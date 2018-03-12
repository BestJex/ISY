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

import top.zbeboy.isy.domain.tables.DefenseArrangement;
import top.zbeboy.isy.domain.tables.records.DefenseArrangementRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class DefenseArrangementDao extends DAOImpl<DefenseArrangementRecord, top.zbeboy.isy.domain.tables.pojos.DefenseArrangement, String> {

    /**
     * Create a new DefenseArrangementDao without any configuration
     */
    public DefenseArrangementDao() {
        super(DefenseArrangement.DEFENSE_ARRANGEMENT, top.zbeboy.isy.domain.tables.pojos.DefenseArrangement.class);
    }

    /**
     * Create a new DefenseArrangementDao with an attached configuration
     */
    @Autowired
    public DefenseArrangementDao(Configuration configuration) {
        super(DefenseArrangement.DEFENSE_ARRANGEMENT, top.zbeboy.isy.domain.tables.pojos.DefenseArrangement.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(top.zbeboy.isy.domain.tables.pojos.DefenseArrangement object) {
        return object.getDefenseArrangementId();
    }

    /**
     * Fetch records that have <code>defense_arrangement_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.DefenseArrangement> fetchByDefenseArrangementId(String... values) {
        return fetch(DefenseArrangement.DEFENSE_ARRANGEMENT.DEFENSE_ARRANGEMENT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>defense_arrangement_id = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.DefenseArrangement fetchOneByDefenseArrangementId(String value) {
        return fetchOne(DefenseArrangement.DEFENSE_ARRANGEMENT.DEFENSE_ARRANGEMENT_ID, value);
    }

    /**
     * Fetch records that have <code>paper_start_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.DefenseArrangement> fetchByPaperStartTime(Timestamp... values) {
        return fetch(DefenseArrangement.DEFENSE_ARRANGEMENT.PAPER_START_TIME, values);
    }

    /**
     * Fetch records that have <code>paper_end_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.DefenseArrangement> fetchByPaperEndTime(Timestamp... values) {
        return fetch(DefenseArrangement.DEFENSE_ARRANGEMENT.PAPER_END_TIME, values);
    }

    /**
     * Fetch records that have <code>defense_start_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.DefenseArrangement> fetchByDefenseStartTime(Timestamp... values) {
        return fetch(DefenseArrangement.DEFENSE_ARRANGEMENT.DEFENSE_START_TIME, values);
    }

    /**
     * Fetch records that have <code>defense_end_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.DefenseArrangement> fetchByDefenseEndTime(Timestamp... values) {
        return fetch(DefenseArrangement.DEFENSE_ARRANGEMENT.DEFENSE_END_TIME, values);
    }

    /**
     * Fetch records that have <code>interval_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.DefenseArrangement> fetchByIntervalTime(Integer... values) {
        return fetch(DefenseArrangement.DEFENSE_ARRANGEMENT.INTERVAL_TIME, values);
    }

    /**
     * Fetch records that have <code>defense_note IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.DefenseArrangement> fetchByDefenseNote(String... values) {
        return fetch(DefenseArrangement.DEFENSE_ARRANGEMENT.DEFENSE_NOTE, values);
    }

    /**
     * Fetch records that have <code>graduation_design_release_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.DefenseArrangement> fetchByGraduationDesignReleaseId(String... values) {
        return fetch(DefenseArrangement.DEFENSE_ARRANGEMENT.GRADUATION_DESIGN_RELEASE_ID, values);
    }
}
