/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import top.zbeboy.isy.domain.tables.CollegeApplication;
import top.zbeboy.isy.domain.tables.records.CollegeApplicationRecord;


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
public class CollegeApplicationDao extends DAOImpl<CollegeApplicationRecord, top.zbeboy.isy.domain.tables.pojos.CollegeApplication, Record2<String, Integer>> {

    /**
     * Create a new CollegeApplicationDao without any configuration
     */
    public CollegeApplicationDao() {
        super(CollegeApplication.COLLEGE_APPLICATION, top.zbeboy.isy.domain.tables.pojos.CollegeApplication.class);
    }

    /**
     * Create a new CollegeApplicationDao with an attached configuration
     */
    @Autowired
    public CollegeApplicationDao(Configuration configuration) {
        super(CollegeApplication.COLLEGE_APPLICATION, top.zbeboy.isy.domain.tables.pojos.CollegeApplication.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<String, Integer> getId(top.zbeboy.isy.domain.tables.pojos.CollegeApplication object) {
        return compositeKeyRecord(object.getApplicationId(), object.getCollegeId());
    }

    /**
     * Fetch records that have <code>application_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.CollegeApplication> fetchByApplicationId(String... values) {
        return fetch(CollegeApplication.COLLEGE_APPLICATION.APPLICATION_ID, values);
    }

    /**
     * Fetch records that have <code>college_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.CollegeApplication> fetchByCollegeId(Integer... values) {
        return fetch(CollegeApplication.COLLEGE_APPLICATION.COLLEGE_ID, values);
    }
}
