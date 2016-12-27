/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables;


import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import top.zbeboy.isy.domain.Isy;
import top.zbeboy.isy.domain.Keys;
import top.zbeboy.isy.domain.tables.records.StaffRecord;


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
public class Staff extends TableImpl<StaffRecord> {

    private static final long serialVersionUID = -1308047075;

    /**
     * The reference instance of <code>isy.staff</code>
     */
    public static final Staff STAFF = new Staff();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StaffRecord> getRecordType() {
        return StaffRecord.class;
    }

    /**
     * The column <code>isy.staff.staff_id</code>.
     */
    public final TableField<StaffRecord, Integer> STAFF_ID = createField("staff_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.staff.staff_number</code>.
     */
    public final TableField<StaffRecord, String> STAFF_NUMBER = createField("staff_number", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.staff.birthday</code>.
     */
    public final TableField<StaffRecord, Date> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>isy.staff.sex</code>.
     */
    public final TableField<StaffRecord, String> SEX = createField("sex", org.jooq.impl.SQLDataType.VARCHAR.length(2), this, "");

    /**
     * The column <code>isy.staff.id_card</code>.
     */
    public final TableField<StaffRecord, String> ID_CARD = createField("id_card", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

    /**
     * The column <code>isy.staff.family_residence</code>.
     */
    public final TableField<StaffRecord, String> FAMILY_RESIDENCE = createField("family_residence", org.jooq.impl.SQLDataType.VARCHAR.length(600), this, "");

    /**
     * The column <code>isy.staff.political_landscape_id</code>.
     */
    public final TableField<StaffRecord, Integer> POLITICAL_LANDSCAPE_ID = createField("political_landscape_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>isy.staff.nation_id</code>.
     */
    public final TableField<StaffRecord, Integer> NATION_ID = createField("nation_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>isy.staff.post</code>.
     */
    public final TableField<StaffRecord, String> POST = createField("post", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "");

    /**
     * The column <code>isy.staff.department_id</code>.
     */
    public final TableField<StaffRecord, Integer> DEPARTMENT_ID = createField("department_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.staff.username</code>.
     */
    public final TableField<StaffRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * Create a <code>isy.staff</code> table reference
     */
    public Staff() {
        this("staff", null);
    }

    /**
     * Create an aliased <code>isy.staff</code> table reference
     */
    public Staff(String alias) {
        this(alias, STAFF);
    }

    private Staff(String alias, Table<StaffRecord> aliased) {
        this(alias, aliased, null);
    }

    private Staff(String alias, Table<StaffRecord> aliased, Field<?>[] parameters) {
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
    public Identity<StaffRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STAFF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StaffRecord> getPrimaryKey() {
        return Keys.KEY_STAFF_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StaffRecord>> getKeys() {
        return Arrays.<UniqueKey<StaffRecord>>asList(Keys.KEY_STAFF_PRIMARY, Keys.KEY_STAFF_STAFF_NUMBER, Keys.KEY_STAFF_ID_CARD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StaffRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StaffRecord, ?>>asList(Keys.STAFF_IBFK_1, Keys.STAFF_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Staff as(String alias) {
        return new Staff(alias, this);
    }

    /**
     * Rename this table
     */
    public Staff rename(String name) {
        return new Staff(name, null);
    }
}
