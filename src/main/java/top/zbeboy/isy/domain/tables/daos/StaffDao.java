/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.daos;


import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import top.zbeboy.isy.domain.tables.Staff;
import top.zbeboy.isy.domain.tables.records.StaffRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class StaffDao extends DAOImpl<StaffRecord, top.zbeboy.isy.domain.tables.pojos.Staff, Integer> {

    /**
     * Create a new StaffDao without any configuration
     */
    public StaffDao() {
        super(Staff.STAFF, top.zbeboy.isy.domain.tables.pojos.Staff.class);
    }

    /**
     * Create a new StaffDao with an attached configuration
     */
    @Autowired
    public StaffDao(Configuration configuration) {
        super(Staff.STAFF, top.zbeboy.isy.domain.tables.pojos.Staff.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(top.zbeboy.isy.domain.tables.pojos.Staff object) {
        return object.getStaffId();
    }

    /**
     * Fetch records that have <code>staff_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByStaffId(Integer... values) {
        return fetch(Staff.STAFF.STAFF_ID, values);
    }

    /**
     * Fetch a unique record that has <code>staff_id = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.Staff fetchOneByStaffId(Integer value) {
        return fetchOne(Staff.STAFF.STAFF_ID, value);
    }

    /**
     * Fetch records that have <code>staff_number IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByStaffNumber(String... values) {
        return fetch(Staff.STAFF.STAFF_NUMBER, values);
    }

    /**
     * Fetch a unique record that has <code>staff_number = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.Staff fetchOneByStaffNumber(String value) {
        return fetchOne(Staff.STAFF.STAFF_NUMBER, value);
    }

    /**
     * Fetch records that have <code>birthday IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByBirthday(Date... values) {
        return fetch(Staff.STAFF.BIRTHDAY, values);
    }

    /**
     * Fetch records that have <code>sex IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchBySex(String... values) {
        return fetch(Staff.STAFF.SEX, values);
    }

    /**
     * Fetch records that have <code>id_card IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByIdCard(String... values) {
        return fetch(Staff.STAFF.ID_CARD, values);
    }

    /**
     * Fetch a unique record that has <code>id_card = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.Staff fetchOneByIdCard(String value) {
        return fetchOne(Staff.STAFF.ID_CARD, value);
    }

    /**
     * Fetch records that have <code>family_residence IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByFamilyResidence(String... values) {
        return fetch(Staff.STAFF.FAMILY_RESIDENCE, values);
    }

    /**
     * Fetch records that have <code>political_landscape_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByPoliticalLandscapeId(Integer... values) {
        return fetch(Staff.STAFF.POLITICAL_LANDSCAPE_ID, values);
    }

    /**
     * Fetch records that have <code>nation_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByNationId(Integer... values) {
        return fetch(Staff.STAFF.NATION_ID, values);
    }

    /**
     * Fetch records that have <code>post IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByPost(String... values) {
        return fetch(Staff.STAFF.POST, values);
    }

    /**
     * Fetch records that have <code>academic_title_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByAcademicTitleId(Integer... values) {
        return fetch(Staff.STAFF.ACADEMIC_TITLE_ID, values);
    }

    /**
     * Fetch records that have <code>department_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByDepartmentId(Integer... values) {
        return fetch(Staff.STAFF.DEPARTMENT_ID, values);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Staff> fetchByUsername(String... values) {
        return fetch(Staff.STAFF.USERNAME, values);
    }
}
