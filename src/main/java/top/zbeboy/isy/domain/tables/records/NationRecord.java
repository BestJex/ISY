/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.Nation;


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
public class NationRecord extends UpdatableRecordImpl<NationRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 636140341;

    /**
     * Setter for <code>isy.nation.nation_id</code>.
     */
    public void setNationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.nation.nation_id</code>.
     */
    @NotNull
    public Integer getNationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>isy.nation.nation_name</code>.
     */
    public void setNationName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.nation.nation_name</code>.
     */
    @NotNull
    @Size(max = 30)
    public String getNationName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Nation.NATION.NATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Nation.NATION.NATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getNationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NationRecord value1(Integer value) {
        setNationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NationRecord value2(String value) {
        setNationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NationRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NationRecord
     */
    public NationRecord() {
        super(Nation.NATION);
    }

    /**
     * Create a detached, initialised NationRecord
     */
    public NationRecord(Integer nationId, String nationName) {
        super(Nation.NATION);

        set(0, nationId);
        set(1, nationName);
    }
}
