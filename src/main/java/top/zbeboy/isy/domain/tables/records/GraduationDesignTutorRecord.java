/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.GraduationDesignTutor;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GraduationDesignTutorRecord extends UpdatableRecordImpl<GraduationDesignTutorRecord> implements Record3<String, String, Integer> {

    private static final long serialVersionUID = -1468544846;

    /**
     * Setter for <code>isy.graduation_design_tutor.graduation_design_tutor_id</code>.
     */
    public void setGraduationDesignTutorId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.graduation_design_tutor.graduation_design_tutor_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getGraduationDesignTutorId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.graduation_design_tutor.graduation_design_teacher_id</code>.
     */
    public void setGraduationDesignTeacherId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.graduation_design_tutor.graduation_design_teacher_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getGraduationDesignTeacherId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>isy.graduation_design_tutor.student_id</code>.
     */
    public void setStudentId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.graduation_design_tutor.student_id</code>.
     */
    @NotNull
    public Integer getStudentId() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GraduationDesignTutor.GRADUATION_DESIGN_TUTOR.GRADUATION_DESIGN_TUTOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GraduationDesignTutor.GRADUATION_DESIGN_TUTOR.GRADUATION_DESIGN_TEACHER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return GraduationDesignTutor.GRADUATION_DESIGN_TUTOR.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getGraduationDesignTutorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGraduationDesignTeacherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGraduationDesignTutorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGraduationDesignTeacherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignTutorRecord value1(String value) {
        setGraduationDesignTutorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignTutorRecord value2(String value) {
        setGraduationDesignTeacherId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignTutorRecord value3(Integer value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignTutorRecord values(String value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GraduationDesignTutorRecord
     */
    public GraduationDesignTutorRecord() {
        super(GraduationDesignTutor.GRADUATION_DESIGN_TUTOR);
    }

    /**
     * Create a detached, initialised GraduationDesignTutorRecord
     */
    public GraduationDesignTutorRecord(String graduationDesignTutorId, String graduationDesignTeacherId, Integer studentId) {
        super(GraduationDesignTutor.GRADUATION_DESIGN_TUTOR);

        set(0, graduationDesignTutorId);
        set(1, graduationDesignTeacherId);
        set(2, studentId);
    }
}
