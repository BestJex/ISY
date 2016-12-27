/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import top.zbeboy.isy.domain.Isy;
import top.zbeboy.isy.domain.Keys;
import top.zbeboy.isy.domain.tables.records.SystemSmsRecord;


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
public class SystemSms extends TableImpl<SystemSmsRecord> {

    private static final long serialVersionUID = -448310049;

    /**
     * The reference instance of <code>isy.system_sms</code>
     */
    public static final SystemSms SYSTEM_SMS = new SystemSms();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemSmsRecord> getRecordType() {
        return SystemSmsRecord.class;
    }

    /**
     * The column <code>isy.system_sms.system_sms_id</code>.
     */
    public final TableField<SystemSmsRecord, String> SYSTEM_SMS_ID = createField("system_sms_id", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.system_sms.send_time</code>.
     */
    public final TableField<SystemSmsRecord, Timestamp> SEND_TIME = createField("send_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>isy.system_sms.accept_phone</code>.
     */
    public final TableField<SystemSmsRecord, String> ACCEPT_PHONE = createField("accept_phone", org.jooq.impl.SQLDataType.VARCHAR.length(15), this, "");

    /**
     * Create a <code>isy.system_sms</code> table reference
     */
    public SystemSms() {
        this("system_sms", null);
    }

    /**
     * Create an aliased <code>isy.system_sms</code> table reference
     */
    public SystemSms(String alias) {
        this(alias, SYSTEM_SMS);
    }

    private SystemSms(String alias, Table<SystemSmsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemSms(String alias, Table<SystemSmsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Isy.ISY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SystemSmsRecord> getPrimaryKey() {
        return Keys.KEY_SYSTEM_SMS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SystemSmsRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemSmsRecord>>asList(Keys.KEY_SYSTEM_SMS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemSms as(String alias) {
        return new SystemSms(alias, this);
    }

    /**
     * Rename this table
     */
    public SystemSms rename(String name) {
        return new SystemSms(name, null);
    }
}
