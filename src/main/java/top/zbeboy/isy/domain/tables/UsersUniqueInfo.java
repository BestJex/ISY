/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables;


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
import top.zbeboy.isy.domain.tables.records.UsersUniqueInfoRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersUniqueInfo extends TableImpl<UsersUniqueInfoRecord> {

    private static final long serialVersionUID = -1254163361;

    /**
     * The reference instance of <code>isy.users_unique_info</code>
     */
    public static final UsersUniqueInfo USERS_UNIQUE_INFO = new UsersUniqueInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersUniqueInfoRecord> getRecordType() {
        return UsersUniqueInfoRecord.class;
    }

    /**
     * The column <code>isy.users_unique_info.username</code>.
     */
    public final TableField<UsersUniqueInfoRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.users_unique_info.id_card</code>.
     */
    public final TableField<UsersUniqueInfoRecord, String> ID_CARD = createField("id_card", org.jooq.impl.SQLDataType.VARCHAR.length(50), this, "");

    /**
     * Create a <code>isy.users_unique_info</code> table reference
     */
    public UsersUniqueInfo() {
        this("users_unique_info", null);
    }

    /**
     * Create an aliased <code>isy.users_unique_info</code> table reference
     */
    public UsersUniqueInfo(String alias) {
        this(alias, USERS_UNIQUE_INFO);
    }

    private UsersUniqueInfo(String alias, Table<UsersUniqueInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private UsersUniqueInfo(String alias, Table<UsersUniqueInfoRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<UsersUniqueInfoRecord> getPrimaryKey() {
        return Keys.KEY_USERS_UNIQUE_INFO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsersUniqueInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersUniqueInfoRecord>>asList(Keys.KEY_USERS_UNIQUE_INFO_PRIMARY, Keys.KEY_USERS_UNIQUE_INFO_ID_CARD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersUniqueInfo as(String alias) {
        return new UsersUniqueInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UsersUniqueInfo rename(String name) {
        return new UsersUniqueInfo(name, null);
    }
}
