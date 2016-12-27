/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import top.zbeboy.isy.domain.Isy;
import top.zbeboy.isy.domain.Keys;
import top.zbeboy.isy.domain.tables.records.SystemAlertRecord;


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
public class SystemAlert extends TableImpl<SystemAlertRecord> {

    private static final long serialVersionUID = 1655067689;

    /**
     * The reference instance of <code>isy.system_alert</code>
     */
    public static final SystemAlert SYSTEM_ALERT = new SystemAlert();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SystemAlertRecord> getRecordType() {
        return SystemAlertRecord.class;
    }

    /**
     * The column <code>isy.system_alert.system_alert_id</code>.
     */
    public final TableField<SystemAlertRecord, String> SYSTEM_ALERT_ID = createField("system_alert_id", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.system_alert.alert_content</code>.
     */
    public final TableField<SystemAlertRecord, String> ALERT_CONTENT = createField("alert_content", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>isy.system_alert.alert_date</code>.
     */
    public final TableField<SystemAlertRecord, Timestamp> ALERT_DATE = createField("alert_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>isy.system_alert.link_id</code>.
     */
    public final TableField<SystemAlertRecord, String> LINK_ID = createField("link_id", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

    /**
     * The column <code>isy.system_alert.is_see</code>.
     */
    public final TableField<SystemAlertRecord, Byte> IS_SEE = createField("is_see", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.system_alert.username</code>.
     */
    public final TableField<SystemAlertRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.system_alert.system_alert_type_id</code>.
     */
    public final TableField<SystemAlertRecord, Integer> SYSTEM_ALERT_TYPE_ID = createField("system_alert_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>isy.system_alert</code> table reference
     */
    public SystemAlert() {
        this("system_alert", null);
    }

    /**
     * Create an aliased <code>isy.system_alert</code> table reference
     */
    public SystemAlert(String alias) {
        this(alias, SYSTEM_ALERT);
    }

    private SystemAlert(String alias, Table<SystemAlertRecord> aliased) {
        this(alias, aliased, null);
    }

    private SystemAlert(String alias, Table<SystemAlertRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<SystemAlertRecord> getPrimaryKey() {
        return Keys.KEY_SYSTEM_ALERT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SystemAlertRecord>> getKeys() {
        return Arrays.<UniqueKey<SystemAlertRecord>>asList(Keys.KEY_SYSTEM_ALERT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SystemAlertRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SystemAlertRecord, ?>>asList(Keys.SYSTEM_ALERT_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SystemAlert as(String alias) {
        return new SystemAlert(alias, this);
    }

    /**
     * Rename this table
     */
    public SystemAlert rename(String name) {
        return new SystemAlert(name, null);
    }
}
