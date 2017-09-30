/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import top.zbeboy.isy.domain.Isy;
import top.zbeboy.isy.domain.Keys;
import top.zbeboy.isy.domain.tables.records.NationRecord;


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
public class Nation extends TableImpl<NationRecord> {

    private static final long serialVersionUID = 81650630;

    /**
     * The reference instance of <code>isy.nation</code>
     */
    public static final Nation NATION = new Nation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NationRecord> getRecordType() {
        return NationRecord.class;
    }

    /**
     * The column <code>isy.nation.nation_id</code>.
     */
    public final TableField<NationRecord, Integer> NATION_ID = createField("nation_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.nation.nation_name</code>.
     */
    public final TableField<NationRecord, String> NATION_NAME = createField("nation_name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * Create a <code>isy.nation</code> table reference
     */
    public Nation() {
        this("nation", null);
    }

    /**
     * Create an aliased <code>isy.nation</code> table reference
     */
    public Nation(String alias) {
        this(alias, NATION);
    }

    private Nation(String alias, Table<NationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Nation(String alias, Table<NationRecord> aliased, Field<?>[] parameters) {
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
    public Identity<NationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_NATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<NationRecord> getPrimaryKey() {
        return Keys.KEY_NATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<NationRecord>> getKeys() {
        return Arrays.<UniqueKey<NationRecord>>asList(Keys.KEY_NATION_PRIMARY, Keys.KEY_NATION_NATION_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Nation as(String alias) {
        return new Nation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Nation rename(String name) {
        return new Nation(name, null);
    }
}
