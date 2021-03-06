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

import top.zbeboy.isy.domain.tables.GraduationDesignDatumType;
import top.zbeboy.isy.domain.tables.records.GraduationDesignDatumTypeRecord;


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
public class GraduationDesignDatumTypeDao extends DAOImpl<GraduationDesignDatumTypeRecord, top.zbeboy.isy.domain.tables.pojos.GraduationDesignDatumType, Integer> {

    /**
     * Create a new GraduationDesignDatumTypeDao without any configuration
     */
    public GraduationDesignDatumTypeDao() {
        super(GraduationDesignDatumType.GRADUATION_DESIGN_DATUM_TYPE, top.zbeboy.isy.domain.tables.pojos.GraduationDesignDatumType.class);
    }

    /**
     * Create a new GraduationDesignDatumTypeDao with an attached configuration
     */
    @Autowired
    public GraduationDesignDatumTypeDao(Configuration configuration) {
        super(GraduationDesignDatumType.GRADUATION_DESIGN_DATUM_TYPE, top.zbeboy.isy.domain.tables.pojos.GraduationDesignDatumType.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(top.zbeboy.isy.domain.tables.pojos.GraduationDesignDatumType object) {
        return object.getGraduationDesignDatumTypeId();
    }

    /**
     * Fetch records that have <code>graduation_design_datum_type_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignDatumType> fetchByGraduationDesignDatumTypeId(Integer... values) {
        return fetch(GraduationDesignDatumType.GRADUATION_DESIGN_DATUM_TYPE.GRADUATION_DESIGN_DATUM_TYPE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>graduation_design_datum_type_id = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.GraduationDesignDatumType fetchOneByGraduationDesignDatumTypeId(Integer value) {
        return fetchOne(GraduationDesignDatumType.GRADUATION_DESIGN_DATUM_TYPE.GRADUATION_DESIGN_DATUM_TYPE_ID, value);
    }

    /**
     * Fetch records that have <code>graduation_design_datum_type_name IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.GraduationDesignDatumType> fetchByGraduationDesignDatumTypeName(String... values) {
        return fetch(GraduationDesignDatumType.GRADUATION_DESIGN_DATUM_TYPE.GRADUATION_DESIGN_DATUM_TYPE_NAME, values);
    }
}
