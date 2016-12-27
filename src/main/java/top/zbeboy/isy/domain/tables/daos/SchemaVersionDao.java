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

import top.zbeboy.isy.domain.tables.SchemaVersion;
import top.zbeboy.isy.domain.tables.records.SchemaVersionRecord;


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
public class SchemaVersionDao extends DAOImpl<SchemaVersionRecord, top.zbeboy.isy.domain.tables.pojos.SchemaVersion, String> {

    /**
     * Create a new SchemaVersionDao without any configuration
     */
    public SchemaVersionDao() {
        super(SchemaVersion.SCHEMA_VERSION, top.zbeboy.isy.domain.tables.pojos.SchemaVersion.class);
    }

    /**
     * Create a new SchemaVersionDao with an attached configuration
     */
    @Autowired
    public SchemaVersionDao(Configuration configuration) {
        super(SchemaVersion.SCHEMA_VERSION, top.zbeboy.isy.domain.tables.pojos.SchemaVersion.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(top.zbeboy.isy.domain.tables.pojos.SchemaVersion object) {
        return object.getVersion();
    }

    /**
     * Fetch records that have <code>version_rank IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchByVersionRank(Integer... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.VERSION_RANK, values);
    }

    /**
     * Fetch records that have <code>installed_rank IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchByInstalledRank(Integer... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.INSTALLED_RANK, values);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchByVersion(String... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.VERSION, values);
    }

    /**
     * Fetch a unique record that has <code>version = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.SchemaVersion fetchOneByVersion(String value) {
        return fetchOne(SchemaVersion.SCHEMA_VERSION.VERSION, value);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchByDescription(String... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchByType(String... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.TYPE, values);
    }

    /**
     * Fetch records that have <code>script IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchByScript(String... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.SCRIPT, values);
    }

    /**
     * Fetch records that have <code>checksum IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchByChecksum(Integer... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.CHECKSUM, values);
    }

    /**
     * Fetch records that have <code>installed_by IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchByInstalledBy(String... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.INSTALLED_BY, values);
    }

    /**
     * Fetch records that have <code>installed_on IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchByInstalledOn(Timestamp... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.INSTALLED_ON, values);
    }

    /**
     * Fetch records that have <code>execution_time IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchByExecutionTime(Integer... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.EXECUTION_TIME, values);
    }

    /**
     * Fetch records that have <code>success IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SchemaVersion> fetchBySuccess(Byte... values) {
        return fetch(SchemaVersion.SCHEMA_VERSION.SUCCESS, values);
    }
}
