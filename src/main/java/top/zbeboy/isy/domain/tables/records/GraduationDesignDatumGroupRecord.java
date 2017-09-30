/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.GraduationDesignDatumGroup;


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
public class GraduationDesignDatumGroupRecord extends UpdatableRecordImpl<GraduationDesignDatumGroupRecord> implements Record4<String, String, String, Timestamp> {

    private static final long serialVersionUID = 2108694786;

    /**
     * Setter for <code>isy.graduation_design_datum_group.graduation_design_datum_group_id</code>.
     */
    public void setGraduationDesignDatumGroupId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.graduation_design_datum_group.graduation_design_datum_group_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getGraduationDesignDatumGroupId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.graduation_design_datum_group.file_id</code>.
     */
    public void setFileId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.graduation_design_datum_group.file_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getFileId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>isy.graduation_design_datum_group.graduation_design_teacher_id</code>.
     */
    public void setGraduationDesignTeacherId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.graduation_design_datum_group.graduation_design_teacher_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getGraduationDesignTeacherId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>isy.graduation_design_datum_group.upload_time</code>.
     */
    public void setUploadTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>isy.graduation_design_datum_group.upload_time</code>.
     */
    @NotNull
    public Timestamp getUploadTime() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, String, String, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GraduationDesignDatumGroup.GRADUATION_DESIGN_DATUM_GROUP.GRADUATION_DESIGN_DATUM_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GraduationDesignDatumGroup.GRADUATION_DESIGN_DATUM_GROUP.FILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GraduationDesignDatumGroup.GRADUATION_DESIGN_DATUM_GROUP.GRADUATION_DESIGN_TEACHER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return GraduationDesignDatumGroup.GRADUATION_DESIGN_DATUM_GROUP.UPLOAD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGraduationDesignDatumGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGraduationDesignTeacherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getUploadTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignDatumGroupRecord value1(String value) {
        setGraduationDesignDatumGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignDatumGroupRecord value2(String value) {
        setFileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignDatumGroupRecord value3(String value) {
        setGraduationDesignTeacherId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignDatumGroupRecord value4(Timestamp value) {
        setUploadTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignDatumGroupRecord values(String value1, String value2, String value3, Timestamp value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GraduationDesignDatumGroupRecord
     */
    public GraduationDesignDatumGroupRecord() {
        super(GraduationDesignDatumGroup.GRADUATION_DESIGN_DATUM_GROUP);
    }

    /**
     * Create a detached, initialised GraduationDesignDatumGroupRecord
     */
    public GraduationDesignDatumGroupRecord(String graduationDesignDatumGroupId, String fileId, String graduationDesignTeacherId, Timestamp uploadTime) {
        super(GraduationDesignDatumGroup.GRADUATION_DESIGN_DATUM_GROUP);

        set(0, graduationDesignDatumGroupId);
        set(1, fileId);
        set(2, graduationDesignTeacherId);
        set(3, uploadTime);
    }
}
