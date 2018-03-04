/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import top.zbeboy.isy.domain.Indexes;
import top.zbeboy.isy.domain.Isy;
import top.zbeboy.isy.domain.Keys;
import top.zbeboy.isy.domain.tables.records.SchoolroomRecord;


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
public class Schoolroom extends TableImpl<SchoolroomRecord> {

    private static final long serialVersionUID = -698053836;

    /**
     * The reference instance of <code>isy.schoolroom</code>
     */
    public static final Schoolroom SCHOOLROOM = new Schoolroom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SchoolroomRecord> getRecordType() {
        return SchoolroomRecord.class;
    }

    /**
     * The column <code>isy.schoolroom.schoolroom_id</code>.
     */
    public final TableField<SchoolroomRecord, Integer> SCHOOLROOM_ID = createField("schoolroom_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>isy.schoolroom.building_id</code>.
     */
    public final TableField<SchoolroomRecord, Integer> BUILDING_ID = createField("building_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.schoolroom.building_code</code>.
     */
    public final TableField<SchoolroomRecord, String> BUILDING_CODE = createField("building_code", org.jooq.impl.SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>isy.schoolroom.schoolroom_is_del</code>.
     */
    public final TableField<SchoolroomRecord, Byte> SCHOOLROOM_IS_DEL = createField("schoolroom_is_del", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * Create a <code>isy.schoolroom</code> table reference
     */
    public Schoolroom() {
        this(DSL.name("schoolroom"), null);
    }

    /**
     * Create an aliased <code>isy.schoolroom</code> table reference
     */
    public Schoolroom(String alias) {
        this(DSL.name(alias), SCHOOLROOM);
    }

    /**
     * Create an aliased <code>isy.schoolroom</code> table reference
     */
    public Schoolroom(Name alias) {
        this(alias, SCHOOLROOM);
    }

    private Schoolroom(Name alias, Table<SchoolroomRecord> aliased) {
        this(alias, aliased, null);
    }

    private Schoolroom(Name alias, Table<SchoolroomRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SCHOOLROOM_BUILDING_ID, Indexes.SCHOOLROOM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SchoolroomRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SCHOOLROOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SchoolroomRecord> getPrimaryKey() {
        return Keys.KEY_SCHOOLROOM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SchoolroomRecord>> getKeys() {
        return Arrays.<UniqueKey<SchoolroomRecord>>asList(Keys.KEY_SCHOOLROOM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SchoolroomRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SchoolroomRecord, ?>>asList(Keys.SCHOOLROOM_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schoolroom as(String alias) {
        return new Schoolroom(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schoolroom as(Name alias) {
        return new Schoolroom(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Schoolroom rename(String name) {
        return new Schoolroom(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Schoolroom rename(Name name) {
        return new Schoolroom(name, null);
    }
}
