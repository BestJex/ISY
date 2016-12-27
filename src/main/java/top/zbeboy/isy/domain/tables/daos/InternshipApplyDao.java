/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import top.zbeboy.isy.domain.tables.InternshipApply;
import top.zbeboy.isy.domain.tables.records.InternshipApplyRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class InternshipApplyDao extends DAOImpl<InternshipApplyRecord, top.zbeboy.isy.domain.tables.pojos.InternshipApply, String> {

    /**
     * Create a new InternshipApplyDao without any configuration
     */
    public InternshipApplyDao() {
        super(InternshipApply.INTERNSHIP_APPLY, top.zbeboy.isy.domain.tables.pojos.InternshipApply.class);
    }

    /**
     * Create a new InternshipApplyDao with an attached configuration
     */
    @Autowired
    public InternshipApplyDao(Configuration configuration) {
        super(InternshipApply.INTERNSHIP_APPLY, top.zbeboy.isy.domain.tables.pojos.InternshipApply.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(top.zbeboy.isy.domain.tables.pojos.InternshipApply object) {
        return object.getInternshipApplyId();
    }

    /**
     * Fetch records that have <code>internship_apply_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.InternshipApply> fetchByInternshipApplyId(String... values) {
        return fetch(InternshipApply.INTERNSHIP_APPLY.INTERNSHIP_APPLY_ID, values);
    }

    /**
     * Fetch a unique record that has <code>internship_apply_id = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.InternshipApply fetchOneByInternshipApplyId(String value) {
        return fetchOne(InternshipApply.INTERNSHIP_APPLY.INTERNSHIP_APPLY_ID, value);
    }

    /**
     * Fetch records that have <code>student_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.InternshipApply> fetchByStudentId(Integer... values) {
        return fetch(InternshipApply.INTERNSHIP_APPLY.STUDENT_ID, values);
    }

    /**
     * Fetch records that have <code>internship_release_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.InternshipApply> fetchByInternshipReleaseId(String... values) {
        return fetch(InternshipApply.INTERNSHIP_APPLY.INTERNSHIP_RELEASE_ID, values);
    }

    /**
     * Fetch records that have <code>internship_apply_state IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.InternshipApply> fetchByInternshipApplyState(Integer... values) {
        return fetch(InternshipApply.INTERNSHIP_APPLY.INTERNSHIP_APPLY_STATE, values);
    }

    /**
     * Fetch records that have <code>reason IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.InternshipApply> fetchByReason(String... values) {
        return fetch(InternshipApply.INTERNSHIP_APPLY.REASON, values);
    }

    /**
     * Fetch records that have <code>change_fill_start_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.InternshipApply> fetchByChangeFillStartTime(Timestamp... values) {
        return fetch(InternshipApply.INTERNSHIP_APPLY.CHANGE_FILL_START_TIME, values);
    }

    /**
     * Fetch records that have <code>change_fill_end_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.InternshipApply> fetchByChangeFillEndTime(Timestamp... values) {
        return fetch(InternshipApply.INTERNSHIP_APPLY.CHANGE_FILL_END_TIME, values);
    }

    /**
     * Fetch records that have <code>apply_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.InternshipApply> fetchByApplyTime(Timestamp... values) {
        return fetch(InternshipApply.INTERNSHIP_APPLY.APPLY_TIME, values);
    }
}
