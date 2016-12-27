/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.SystemMailbox;


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
public class SystemMailboxRecord extends UpdatableRecordImpl<SystemMailboxRecord> implements Record3<String, Timestamp, String> {

    private static final long serialVersionUID = 1106583405;

    /**
     * Setter for <code>isy.system_mailbox.system_mailbox_id</code>.
     */
    public void setSystemMailboxId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.system_mailbox.system_mailbox_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getSystemMailboxId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.system_mailbox.send_time</code>.
     */
    public void setSendTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.system_mailbox.send_time</code>.
     */
    public Timestamp getSendTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>isy.system_mailbox.accept_mail</code>.
     */
    public void setAcceptMail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.system_mailbox.accept_mail</code>.
     */
    @Size(max = 200)
    public String getAcceptMail() {
        return (String) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Timestamp, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, Timestamp, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return SystemMailbox.SYSTEM_MAILBOX.SYSTEM_MAILBOX_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return SystemMailbox.SYSTEM_MAILBOX.SEND_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SystemMailbox.SYSTEM_MAILBOX.ACCEPT_MAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSystemMailboxId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAcceptMail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMailboxRecord value1(String value) {
        setSystemMailboxId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMailboxRecord value2(Timestamp value) {
        setSendTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMailboxRecord value3(String value) {
        setAcceptMail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemMailboxRecord values(String value1, Timestamp value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SystemMailboxRecord
     */
    public SystemMailboxRecord() {
        super(SystemMailbox.SYSTEM_MAILBOX);
    }

    /**
     * Create a detached, initialised SystemMailboxRecord
     */
    public SystemMailboxRecord(String systemMailboxId, Timestamp sendTime, String acceptMail) {
        super(SystemMailbox.SYSTEM_MAILBOX);

        set(0, systemMailboxId);
        set(1, sendTime);
        set(2, acceptMail);
    }
}
