/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.SystemMessage;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemMessageRecord extends UpdatableRecordImpl<SystemMessageRecord> implements Record7<String, String, String, Timestamp, String, String, Byte> {

    private static final long serialVersionUID = 814731975;

    /**
     * Setter for <code>isy.system_message.system_message_id</code>.
     */
    public void setSystemMessageId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.system_message.system_message_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getSystemMessageId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.system_message.message_title</code>.
     */
    public void setMessageTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.system_message.message_title</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getMessageTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>isy.system_message.message_content</code>.
     */
    public void setMessageContent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.system_message.message_content</code>.
     */
    @NotNull
    @Size(max = 800)
    public String getMessageContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>isy.system_message.message_date</code>.
     */
    public void setMessageDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>isy.system_message.message_date</code>.
     */
    @NotNull
    public Timestamp getMessageDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>isy.system_message.send_users</code>.
     */
    public void setSendUsers(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>isy.system_message.send_users</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getSendUsers() {
        return (String) get(4);
    }

    /**
     * Setter for <code>isy.system_message.accept_users</code>.
     */
    public void setAcceptUsers(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>isy.system_message.accept_users</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getAcceptUsers() {
        return (String) get(5);
    }

    /**
     * Setter for <code>isy.system_message.is_see</code>.
     */
    public void setIsSee(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>isy.system_message.is_see</code>.
     */
    public Byte getIsSee() {
        return (Byte) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Timestamp, String, String, Byte> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, Timestamp, String, String, Byte> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SystemMessage.SYSTEM_MESSAGE.SYSTEM_MESSAGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SystemMessage.SYSTEM_MESSAGE.MESSAGE_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SystemMessage.SYSTEM_MESSAGE.MESSAGE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return SystemMessage.SYSTEM_MESSAGE.MESSAGE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SystemMessage.SYSTEM_MESSAGE.SEND_USERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return SystemMessage.SYSTEM_MESSAGE.ACCEPT_USERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return SystemMessage.SYSTEM_MESSAGE.IS_SEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSystemMessageId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMessageTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMessageContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getMessageDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSendUsers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAcceptUsers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getIsSee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMessageRecord value1(String value) {
        setSystemMessageId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMessageRecord value2(String value) {
        setMessageTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMessageRecord value3(String value) {
        setMessageContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMessageRecord value4(Timestamp value) {
        setMessageDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMessageRecord value5(String value) {
        setSendUsers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMessageRecord value6(String value) {
        setAcceptUsers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMessageRecord value7(Byte value) {
        setIsSee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMessageRecord values(String value1, String value2, String value3, Timestamp value4, String value5, String value6, Byte value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemMessageRecord
     */
    public SystemMessageRecord() {
        super(SystemMessage.SYSTEM_MESSAGE);
    }

    /**
     * Create a detached, initialised SystemMessageRecord
     */
    public SystemMessageRecord(String systemMessageId, String messageTitle, String messageContent, Timestamp messageDate, String sendUsers, String acceptUsers, Byte isSee) {
        super(SystemMessage.SYSTEM_MESSAGE);

        set(0, systemMessageId);
        set(1, messageTitle);
        set(2, messageContent);
        set(3, messageDate);
        set(4, sendUsers);
        set(5, acceptUsers);
        set(6, isSee);
    }
}
