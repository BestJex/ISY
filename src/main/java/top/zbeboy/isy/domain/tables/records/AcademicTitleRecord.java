/*
 * This file is generated by jOOQ.
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

import top.zbeboy.isy.domain.tables.AcademicTitle;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AcademicTitleRecord extends UpdatableRecordImpl<AcademicTitleRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1090063890;

    /**
     * Setter for <code>isy.academic_title.academic_title_id</code>.
     */
    public void setAcademicTitleId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.academic_title.academic_title_id</code>.
     */
    @NotNull
    public Integer getAcademicTitleId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>isy.academic_title.academic_title_name</code>.
     */
    public void setAcademicTitleName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.academic_title.academic_title_name</code>.
     */
    @NotNull
    @Size(max = 30)
    public String getAcademicTitleName() {
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
        return AcademicTitle.ACADEMIC_TITLE.ACADEMIC_TITLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return AcademicTitle.ACADEMIC_TITLE.ACADEMIC_TITLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAcademicTitleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAcademicTitleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicTitleRecord value1(Integer value) {
        setAcademicTitleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicTitleRecord value2(String value) {
        setAcademicTitleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcademicTitleRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AcademicTitleRecord
     */
    public AcademicTitleRecord() {
        super(AcademicTitle.ACADEMIC_TITLE);
    }

    /**
     * Create a detached, initialised AcademicTitleRecord
     */
    public AcademicTitleRecord(Integer academicTitleId, String academicTitleName) {
        super(AcademicTitle.ACADEMIC_TITLE);

        set(0, academicTitleId);
        set(1, academicTitleName);
    }
}