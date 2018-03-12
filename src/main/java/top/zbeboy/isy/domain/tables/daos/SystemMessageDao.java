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

import top.zbeboy.isy.domain.tables.SystemMessage;
import top.zbeboy.isy.domain.tables.records.SystemMessageRecord;


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
public class SystemMessageDao extends DAOImpl<SystemMessageRecord, top.zbeboy.isy.domain.tables.pojos.SystemMessage, String> {

    /**
     * Create a new SystemMessageDao without any configuration
     */
    public SystemMessageDao() {
        super(SystemMessage.SYSTEM_MESSAGE, top.zbeboy.isy.domain.tables.pojos.SystemMessage.class);
    }

    /**
     * Create a new SystemMessageDao with an attached configuration
     */
    @Autowired
    public SystemMessageDao(Configuration configuration) {
        super(SystemMessage.SYSTEM_MESSAGE, top.zbeboy.isy.domain.tables.pojos.SystemMessage.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(top.zbeboy.isy.domain.tables.pojos.SystemMessage object) {
        return object.getSystemMessageId();
    }

    /**
     * Fetch records that have <code>system_message_id IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SystemMessage> fetchBySystemMessageId(String... values) {
        return fetch(SystemMessage.SYSTEM_MESSAGE.SYSTEM_MESSAGE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>system_message_id = value</code>
     */
    public top.zbeboy.isy.domain.tables.pojos.SystemMessage fetchOneBySystemMessageId(String value) {
        return fetchOne(SystemMessage.SYSTEM_MESSAGE.SYSTEM_MESSAGE_ID, value);
    }

    /**
     * Fetch records that have <code>message_title IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SystemMessage> fetchByMessageTitle(String... values) {
        return fetch(SystemMessage.SYSTEM_MESSAGE.MESSAGE_TITLE, values);
    }

    /**
     * Fetch records that have <code>message_content IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SystemMessage> fetchByMessageContent(String... values) {
        return fetch(SystemMessage.SYSTEM_MESSAGE.MESSAGE_CONTENT, values);
    }

    /**
     * Fetch records that have <code>message_date IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SystemMessage> fetchByMessageDate(Timestamp... values) {
        return fetch(SystemMessage.SYSTEM_MESSAGE.MESSAGE_DATE, values);
    }

    /**
     * Fetch records that have <code>send_users IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SystemMessage> fetchBySendUsers(String... values) {
        return fetch(SystemMessage.SYSTEM_MESSAGE.SEND_USERS, values);
    }

    /**
     * Fetch records that have <code>accept_users IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SystemMessage> fetchByAcceptUsers(String... values) {
        return fetch(SystemMessage.SYSTEM_MESSAGE.ACCEPT_USERS, values);
    }

    /**
     * Fetch records that have <code>is_see IN (values)</code>
     */
    public List<top.zbeboy.isy.domain.tables.pojos.SystemMessage> fetchByIsSee(Byte... values) {
        return fetch(SystemMessage.SYSTEM_MESSAGE.IS_SEE, values);
    }
}
