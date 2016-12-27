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

import top.zbeboy.isy.domain.tables.PersistentLogins;
import top.zbeboy.isy.domain.tables.records.PersistentLoginsRecord;


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
public class PersistentLoginsDao extends DAOImpl<PersistentLoginsRecord, top.zbeboy.isy.domain.tables.pojos.PersistentLogins, String> {

    /**
     * Create a new PersistentLoginsDao without any configuration
     */
    public PersistentLoginsDao() {
        super(PersistentLogins.PERSISTENT_LOGINS, top.zbeboy.isy.domain.tables.pojos.PersistentLogins.class);
    }

    /**
     * Create a new PersistentLoginsDao with an attached configuration
     */
    @Autowired
    public PersistentLoginsDao(Configuration configuration) {
        super(PersistentLogins.PERSISTENT_LOGINS, top.zbeboy.isy.domain.tables.pojos.PersistentLogins.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(top.zbeboy.isy.domain.tables.pojos.PersistentLogins object) {
        return object.getSeries();
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.PersistentLogins> fetchByUsername(String... values) {
        return fetch(PersistentLogins.PERSISTENT_LOGINS.USERNAME, values);
    }

    /**
     * Fetch records that have <code>series IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.PersistentLogins> fetchBySeries(String... values) {
        return fetch(PersistentLogins.PERSISTENT_LOGINS.SERIES, values);
    }

    /**
     * Fetch a unique record that has <code>series = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.PersistentLogins fetchOneBySeries(String value) {
        return fetchOne(PersistentLogins.PERSISTENT_LOGINS.SERIES, value);
    }

    /**
     * Fetch records that have <code>token IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.PersistentLogins> fetchByToken(String... values) {
        return fetch(PersistentLogins.PERSISTENT_LOGINS.TOKEN, values);
    }

    /**
     * Fetch records that have <code>last_used IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.PersistentLogins> fetchByLastUsed(Timestamp... values) {
        return fetch(PersistentLogins.PERSISTENT_LOGINS.LAST_USED, values);
    }
}
