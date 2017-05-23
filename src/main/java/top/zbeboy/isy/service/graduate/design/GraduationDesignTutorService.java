package top.zbeboy.isy.service.graduate.design;

import org.jooq.Record;
import org.jooq.Result;
import top.zbeboy.isy.domain.tables.pojos.GraduationDesignTutor;
import top.zbeboy.isy.domain.tables.pojos.Users;
import top.zbeboy.isy.web.bean.graduate.design.release.GraduationDesignReleaseBean;

import java.util.Optional;

/**
 * Created by lenovo on 2017-05-20.
 */
public interface GraduationDesignTutorService {

    /**
     * 通过主键查询
     *
     * @param id 主键
     * @return 结果
     */
    GraduationDesignTutor findById(String id);

    /**
     * 通过学生id与发布id查询指导教师信息
     *
     * @param studentId                 学生id
     * @param graduationDesignReleaseId 毕业发布id
     * @return 指导教师信息
     */
    Optional<Record> findByStudentIdAndGraduationDesignReleaseIdRelationForStaff(int studentId, String graduationDesignReleaseId);

    /**
     * 通过指导教师id与发布id关联查询学生信息
     *
     * @param graduationDesignTeacherId 指导教师id
     * @param graduationDesignReleaseId 毕业发布id
     * @return 数据
     */
    Result<Record> findByGraduationDesignTeacherIdAndGraduationDesignReleaseIdRelationForStudent(String graduationDesignTeacherId, String graduationDesignReleaseId);

    /**
     * 统计未填报学生数
     *
     * @param graduationDesignReleaseBean 毕业发布
     * @return 学生数
     */
    int countNotFillStudent(GraduationDesignReleaseBean graduationDesignReleaseBean);

    /**
     * 统计填报学生数
     *
     * @param graduationDesignReleaseBean 毕业发布
     * @return 学生数
     */
    int countFillStudent(GraduationDesignReleaseBean graduationDesignReleaseBean);

    /**
     * 根据 指导教师id删除
     *
     * @param graduationDesignTeacherId 指导教师id
     */
    void deleteByGraduationDesignTeacherId(String graduationDesignTeacherId);

    /**
     * 保存
     *
     * @param graduationDesignTutor 数据
     */
    void save(GraduationDesignTutor graduationDesignTutor);

    /**
     * 更新
     *
     * @param graduationDesignTutor 数据
     */
    void update(GraduationDesignTutor graduationDesignTutor);
}
