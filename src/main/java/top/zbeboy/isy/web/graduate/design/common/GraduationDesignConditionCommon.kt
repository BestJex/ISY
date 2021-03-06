package top.zbeboy.isy.web.graduate.design.common

import org.springframework.data.redis.core.ValueOperations
import org.springframework.stereotype.Component
import org.springframework.util.ObjectUtils
import top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease
import top.zbeboy.isy.service.cache.CacheBook
import top.zbeboy.isy.service.graduate.design.GraduationDesignReleaseService
import top.zbeboy.isy.service.util.DateTimeUtils
import top.zbeboy.isy.web.bean.error.ErrorBean
import java.util.concurrent.TimeUnit
import javax.annotation.Resource

/**
 * Created by zbeboy 2018-01-14 .
 **/
@Component
open class GraduationDesignConditionCommon {

    @Resource
    open lateinit var graduationDesignReleaseService: GraduationDesignReleaseService

    @Resource(name = "redisTemplate")
    open lateinit var errorBeanValueOperations: ValueOperations<String, ErrorBean<GraduationDesignRelease>>

    fun basicCondition(graduationDesignReleaseId: String): ErrorBean<GraduationDesignRelease> {
        val cacheKey = CacheBook.GRADUATION_DESIGN_BASE_CONDITION + graduationDesignReleaseId
        if (errorBeanValueOperations.operations.hasKey(cacheKey)!!) {
            return errorBeanValueOperations.get(cacheKey)!!
        }
        val errorBean = ErrorBean.of<GraduationDesignRelease>()
        val graduationDesignRelease = graduationDesignReleaseService.findById(graduationDesignReleaseId)
        if (!ObjectUtils.isEmpty(graduationDesignRelease)) {
            errorBean.data = graduationDesignRelease
            if (graduationDesignRelease.graduationDesignIsDel == 1.toByte()) {
                errorBean.hasError = true
                errorBean.errorMsg = "该毕业设计已被注销"
            } else {
                errorBean.hasError = false
            }
        } else {
            errorBean.hasError = true
            errorBean.errorMsg = "未查询到相关毕业设计信息"
        }
        errorBeanValueOperations.set(cacheKey, errorBean, CacheBook.EXPIRES_MINUTES, TimeUnit.MINUTES)
        return errorBean
    }

    /**
     * 在毕业时间范围
     *
     * @param graduationDesignReleaseId 毕业设计发布id
     * @return error
     */
    fun isRangeGraduationDateCondition(graduationDesignReleaseId: String): ErrorBean<GraduationDesignRelease> {
        val errorBean = basicCondition(graduationDesignReleaseId)
        val graduationDesignRelease = errorBean.data
        if (!errorBean.hasError) {
            // 毕业时间范围
            if (DateTimeUtils.timestampRangeDecide(graduationDesignRelease!!.startTime, graduationDesignRelease.endTime)) {
                errorBean.hasError = false
            } else {
                errorBean.hasError = true
                errorBean.errorMsg = "不在毕业设计时间范围，无法操作"
            }
        }
        return errorBean
    }

    /**
     * 在指导教师填报时间范围
     *
     * @param graduationDesignReleaseId 毕业设计发布id
     * @return error
     */
    fun isRangeFillTeacherDate(graduationDesignReleaseId: String): ErrorBean<GraduationDesignRelease> {
        val errorBean = isRangeGraduationDateCondition(graduationDesignReleaseId)
        val graduationDesignRelease = errorBean.data
        if (!errorBean.hasError) {
            // 填报时间范围
            if (DateTimeUtils.timestampRangeDecide(graduationDesignRelease!!.fillTeacherStartTime, graduationDesignRelease.fillTeacherEndTime)) {
                errorBean.hasError = false
            } else {
                errorBean.hasError = true
                errorBean.errorMsg = "不在填报时间范围，无法操作"
            }
        }
        return errorBean
    }

    /**
     * 已确认毕业设计指导教师
     *
     * @param graduationDesignReleaseId 毕业设计发布id
     * @return error
     */
    fun isOkTeacherCondition(graduationDesignReleaseId: String): ErrorBean<GraduationDesignRelease> {
        val errorBean = isRangeGraduationDateCondition(graduationDesignReleaseId)
        val graduationDesignRelease = errorBean.data
        if (!errorBean.hasError) {
            // 是否已确认
            if (!ObjectUtils.isEmpty(graduationDesignRelease!!.isOkTeacher) && graduationDesignRelease.isOkTeacher == 1.toByte()) {
                errorBean.hasError = true
                errorBean.errorMsg = "已确认毕业设计指导教师，无法进行操作"
            } else {
                errorBean.hasError = false
            }
        }
        return errorBean
    }

    /**
     * 未确认毕业设计指导教师
     *
     * @param graduationDesignReleaseId 毕业设计发布id
     * @return error
     */
    fun isNotOkTeacherCondition(graduationDesignReleaseId: String): ErrorBean<GraduationDesignRelease> {
        val errorBean = isRangeGraduationDateCondition(graduationDesignReleaseId)
        val graduationDesignRelease = errorBean.data
        if (!errorBean.hasError) {
            // 是否已确认
            if (!ObjectUtils.isEmpty(graduationDesignRelease!!.isOkTeacher) && graduationDesignRelease.isOkTeacher == 1.toByte()) {
                errorBean.hasError = false
            } else {
                errorBean.hasError = true
                errorBean.errorMsg = "未确认毕业设计指导教师，无法进行操作"
            }
        }
        return errorBean
    }

    /**
     * 未确认毕业设计指导教师
     *
     * @param errorBean error信息
     * @return error
     */
    fun isNotOkTeacherCondition(errorBean: ErrorBean<GraduationDesignRelease>) {
        val graduationDesignRelease = errorBean.data
        if (!errorBean.hasError) {
            // 是否已确认
            if (!ObjectUtils.isEmpty(graduationDesignRelease!!.isOkTeacher) && graduationDesignRelease.isOkTeacher == 1.toByte()) {
                errorBean.hasError = false
            } else {
                errorBean.hasError = true
                errorBean.errorMsg = "未确认毕业设计指导教师，无法进行操作"
            }
        }
    }

    /**
     * 已确认毕业设计指导教师调整
     *
     * @param graduationDesignReleaseId 毕业设计发布id
     * @return error
     */
    fun isOkTeacherAdjust(graduationDesignReleaseId: String): ErrorBean<GraduationDesignRelease> {
        val errorBean = isNotOkTeacherCondition(graduationDesignReleaseId)
        val graduationDesignRelease = errorBean.data
        if (!errorBean.hasError) {
            // 是否已确认调整
            if (!ObjectUtils.isEmpty(graduationDesignRelease!!.isOkTeacherAdjust) && graduationDesignRelease.isOkTeacherAdjust == 1.toByte()) {
                errorBean.hasError = true
                errorBean.errorMsg = "已确认毕业设计指导教师调整，无法进行操作"
            } else {
                errorBean.hasError = false
            }
        }
        return errorBean
    }

    /**
     * 未确认毕业设计指导教师调整
     *
     * @param graduationDesignReleaseId 毕业设计发布id
     * @return error
     */
    fun isNotOkTeacherAdjust(graduationDesignReleaseId: String): ErrorBean<GraduationDesignRelease> {
        val errorBean = basicCondition(graduationDesignReleaseId)
        val graduationDesignRelease = errorBean.data
        if (!errorBean.hasError) {
            // 是否已确认调整
            if (!ObjectUtils.isEmpty(graduationDesignRelease!!.isOkTeacherAdjust) && graduationDesignRelease.isOkTeacherAdjust == 1.toByte()) {
                errorBean.hasError = false
            } else {
                errorBean.hasError = true
                errorBean.errorMsg = "未确认毕业设计指导教师调整，无法进行操作"
            }
        }
        return errorBean
    }

    /**
     * 未确认毕业设计指导教师调整
     *
     * @param errorBean error 信息
     * @return error
     */
    fun isNotOkTeacherAdjust(errorBean: ErrorBean<GraduationDesignRelease>) {
        val graduationDesignRelease = errorBean.data
        if (!errorBean.hasError) {
            // 是否已确认调整
            if (!ObjectUtils.isEmpty(graduationDesignRelease!!.isOkTeacherAdjust) && graduationDesignRelease.isOkTeacherAdjust == 1.toByte()) {
                errorBean.hasError = false
            } else {
                errorBean.hasError = true
                errorBean.errorMsg = "未确认毕业设计指导教师调整，无法进行操作"
            }
        }
    }
}