/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import top.zbeboy.isy.domain.tables.Application;
import top.zbeboy.isy.domain.tables.records.ApplicationRecord;


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
public class ApplicationDao extends DAOImpl<ApplicationRecord, top.zbeboy.isy.domain.tables.pojos.Application, String> {

    /**
     * Create a new ApplicationDao without any configuration
     */
    public ApplicationDao() {
        super(Application.APPLICATION, top.zbeboy.isy.domain.tables.pojos.Application.class);
    }

    /**
     * Create a new ApplicationDao with an attached configuration
     */
    @Autowired
    public ApplicationDao(Configuration configuration) {
        super(Application.APPLICATION, top.zbeboy.isy.domain.tables.pojos.Application.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(top.zbeboy.isy.domain.tables.pojos.Application object) {
        return object.getApplicationId();
    }

    /**
     * Fetch records that have <code>application_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Application> fetchByApplicationId(String... values) {
        return fetch(Application.APPLICATION.APPLICATION_ID, values);
    }

    /**
     * Fetch a unique record that has <code>application_id = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.Application fetchOneByApplicationId(String value) {
        return fetchOne(Application.APPLICATION.APPLICATION_ID, value);
    }

    /**
     * Fetch records that have <code>application_name IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Application> fetchByApplicationName(String... values) {
        return fetch(Application.APPLICATION.APPLICATION_NAME, values);
    }

    /**
     * Fetch records that have <code>application_sort IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Application> fetchByApplicationSort(Integer... values) {
        return fetch(Application.APPLICATION.APPLICATION_SORT, values);
    }

    /**
     * Fetch records that have <code>application_pid IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Application> fetchByApplicationPid(String... values) {
        return fetch(Application.APPLICATION.APPLICATION_PID, values);
    }

    /**
     * Fetch records that have <code>application_url IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Application> fetchByApplicationUrl(String... values) {
        return fetch(Application.APPLICATION.APPLICATION_URL, values);
    }

    /**
     * Fetch records that have <code>application_code IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Application> fetchByApplicationCode(String... values) {
        return fetch(Application.APPLICATION.APPLICATION_CODE, values);
    }

    /**
     * Fetch records that have <code>application_en_name IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Application> fetchByApplicationEnName(String... values) {
        return fetch(Application.APPLICATION.APPLICATION_EN_NAME, values);
    }

    /**
     * Fetch records that have <code>icon IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Application> fetchByIcon(String... values) {
        return fetch(Application.APPLICATION.ICON, values);
    }

    /**
     * Fetch records that have <code>application_data_url_start_with IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.Application> fetchByApplicationDataUrlStartWith(String... values) {
        return fetch(Application.APPLICATION.APPLICATION_DATA_URL_START_WITH, values);
    }
}
