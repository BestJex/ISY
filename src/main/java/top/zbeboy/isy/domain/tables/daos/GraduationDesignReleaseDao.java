/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import top.zbeboy.isy.domain.tables.GraduationDesignRelease;
import top.zbeboy.isy.domain.tables.records.GraduationDesignReleaseRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class GraduationDesignReleaseDao extends DAOImpl<GraduationDesignReleaseRecord, top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease, String> {

    /**
     * Create a new GraduationDesignReleaseDao without any configuration
     */
    public GraduationDesignReleaseDao() {
        super(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE, top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease.class);
    }

    /**
     * Create a new GraduationDesignReleaseDao with an attached configuration
     */
    @Autowired
    public GraduationDesignReleaseDao(Configuration configuration) {
        super(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE, top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease object) {
        return object.getGraduationDesignReleaseId();
    }

    /**
     * Fetch records that have <code>graduation_design_release_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByGraduationDesignReleaseId(String... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.GRADUATION_DESIGN_RELEASE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>graduation_design_release_id = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease fetchOneByGraduationDesignReleaseId(String value) {
        return fetchOne(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.GRADUATION_DESIGN_RELEASE_ID, value);
    }

    /**
     * Fetch records that have <code>graduation_design_title IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByGraduationDesignTitle(String... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.GRADUATION_DESIGN_TITLE, values);
    }

    /**
     * Fetch records that have <code>release_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByReleaseTime(Timestamp... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.RELEASE_TIME, values);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByUsername(String... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.USERNAME, values);
    }

    /**
     * Fetch records that have <code>start_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByStartTime(Timestamp... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.START_TIME, values);
    }

    /**
     * Fetch records that have <code>end_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByEndTime(Timestamp... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.END_TIME, values);
    }

    /**
     * Fetch records that have <code>fill_teacher_start_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByFillTeacherStartTime(Timestamp... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.FILL_TEACHER_START_TIME, values);
    }

    /**
     * Fetch records that have <code>fill_teacher_end_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByFillTeacherEndTime(Timestamp... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.FILL_TEACHER_END_TIME, values);
    }

    /**
     * Fetch records that have <code>graduation_design_is_del IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByGraduationDesignIsDel(Byte... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.GRADUATION_DESIGN_IS_DEL, values);
    }

    /**
     * Fetch records that have <code>allow_grade IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByAllowGrade(String... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.ALLOW_GRADE, values);
    }

    /**
     * Fetch records that have <code>is_ok_teacher IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByIsOkTeacher(Byte... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.IS_OK_TEACHER, values);
    }

    /**
     * Fetch records that have <code>is_ok_teacher_adjust IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByIsOkTeacherAdjust(Byte... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.IS_OK_TEACHER_ADJUST, values);
    }

    /**
     * Fetch records that have <code>department_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByDepartmentId(Integer... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.DEPARTMENT_ID, values);
    }

    /**
     * Fetch records that have <code>science_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByScienceId(Integer... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.SCIENCE_ID, values);
    }

    /**
     * Fetch records that have <code>publisher IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignRelease> fetchByPublisher(String... values) {
        return fetch(GraduationDesignRelease.GRADUATION_DESIGN_RELEASE.PUBLISHER, values);
    }
}
