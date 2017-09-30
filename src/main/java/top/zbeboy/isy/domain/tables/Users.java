/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables;


import java.sql.Date;
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
import top.zbeboy.isy.domain.tables.records.UsersRecord;


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
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = 2026005508;

    /**
     * The reference instance of <code>isy.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>isy.users.username</code>.
     */
    public final TableField<UsersRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.users.password</code>.
     */
    public final TableField<UsersRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(300).nullable(false), this, "");

    /**
     * The column <code>isy.users.enabled</code>.
     */
    public final TableField<UsersRecord, Byte> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>isy.users.users_type_id</code>.
     */
    public final TableField<UsersRecord, Integer> USERS_TYPE_ID = createField("users_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.users.real_name</code>.
     */
    public final TableField<UsersRecord, String> REAL_NAME = createField("real_name", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

    /**
     * The column <code>isy.users.mobile</code>.
     */
    public final TableField<UsersRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>isy.users.avatar</code>.
     */
    public final TableField<UsersRecord, String> AVATAR = createField("avatar", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "");

    /**
     * The column <code>isy.users.verify_mailbox</code>.
     */
    public final TableField<UsersRecord, Byte> VERIFY_MAILBOX = createField("verify_mailbox", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.users.mailbox_verify_code</code>.
     */
    public final TableField<UsersRecord, String> MAILBOX_VERIFY_CODE = createField("mailbox_verify_code", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>isy.users.password_reset_key</code>.
     */
    public final TableField<UsersRecord, String> PASSWORD_RESET_KEY = createField("password_reset_key", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>isy.users.mailbox_verify_valid</code>.
     */
    public final TableField<UsersRecord, Timestamp> MAILBOX_VERIFY_VALID = createField("mailbox_verify_valid", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>isy.users.password_reset_key_valid</code>.
     */
    public final TableField<UsersRecord, Timestamp> PASSWORD_RESET_KEY_VALID = createField("password_reset_key_valid", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>isy.users.lang_key</code>.
     */
    public final TableField<UsersRecord, String> LANG_KEY = createField("lang_key", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>isy.users.join_date</code>.
     */
    public final TableField<UsersRecord, Date> JOIN_DATE = createField("join_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * Create a <code>isy.users</code> table reference
     */
    public Users() {
        this("users", null);
    }

    /**
     * Create an aliased <code>isy.users</code> table reference
     */
    public Users(String alias) {
        this(alias, USERS);
    }

    private Users(String alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(String alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.KEY_USERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.KEY_USERS_PRIMARY, Keys.KEY_USERS_MOBILE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<UsersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<UsersRecord, ?>>asList(Keys.USERS_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(String alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(name, null);
    }
}
