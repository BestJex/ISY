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
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.GraduationDesignPlan;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GraduationDesignPlanRecord extends UpdatableRecordImpl<GraduationDesignPlanRecord> implements Record8<String, String, String, String, String, String, String, Timestamp> {

    private static final long serialVersionUID = -1160748945;

    /**
     * Setter for <code>isy.graduation_design_plan.graduation_design_plan_id</code>.
     */
    public void setGraduationDesignPlanId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.graduation_design_plan.graduation_design_plan_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getGraduationDesignPlanId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.graduation_design_plan.scheduling</code>.
     */
    public void setScheduling(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.graduation_design_plan.scheduling</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getScheduling() {
        return (String) get(1);
    }

    /**
     * Setter for <code>isy.graduation_design_plan.supervision_time</code>.
     */
    public void setSupervisionTime(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.graduation_design_plan.supervision_time</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getSupervisionTime() {
        return (String) get(2);
    }

    /**
     * Setter for <code>isy.graduation_design_plan.guide_location</code>.
     */
    public void setGuideLocation(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>isy.graduation_design_plan.guide_location</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getGuideLocation() {
        return (String) get(3);
    }

    /**
     * Setter for <code>isy.graduation_design_plan.guide_content</code>.
     */
    public void setGuideContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>isy.graduation_design_plan.guide_content</code>.
     */
    @NotNull
    @Size(max = 150)
    public String getGuideContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>isy.graduation_design_plan.note</code>.
     */
    public void setNote(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>isy.graduation_design_plan.note</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getNote() {
        return (String) get(5);
    }

    /**
     * Setter for <code>isy.graduation_design_plan.graduation_design_teacher_id</code>.
     */
    public void setGraduationDesignTeacherId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>isy.graduation_design_plan.graduation_design_teacher_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getGraduationDesignTeacherId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>isy.graduation_design_plan.add_time</code>.
     */
    public void setAddTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>isy.graduation_design_plan.add_time</code>.
     */
    @NotNull
    public Timestamp getAddTime() {
        return (Timestamp) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String, String, String, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GraduationDesignPlan.GRADUATION_DESIGN_PLAN.GRADUATION_DESIGN_PLAN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GraduationDesignPlan.GRADUATION_DESIGN_PLAN.SCHEDULING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return GraduationDesignPlan.GRADUATION_DESIGN_PLAN.SUPERVISION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return GraduationDesignPlan.GRADUATION_DESIGN_PLAN.GUIDE_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return GraduationDesignPlan.GRADUATION_DESIGN_PLAN.GUIDE_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return GraduationDesignPlan.GRADUATION_DESIGN_PLAN.NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return GraduationDesignPlan.GRADUATION_DESIGN_PLAN.GRADUATION_DESIGN_TEACHER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return GraduationDesignPlan.GRADUATION_DESIGN_PLAN.ADD_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGraduationDesignPlanId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getScheduling();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSupervisionTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getGuideLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGuideContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getGraduationDesignTeacherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getAddTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignPlanRecord value1(String value) {
        setGraduationDesignPlanId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignPlanRecord value2(String value) {
        setScheduling(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignPlanRecord value3(String value) {
        setSupervisionTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignPlanRecord value4(String value) {
        setGuideLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignPlanRecord value5(String value) {
        setGuideContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignPlanRecord value6(String value) {
        setNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignPlanRecord value7(String value) {
        setGraduationDesignTeacherId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignPlanRecord value8(Timestamp value) {
        setAddTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignPlanRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GraduationDesignPlanRecord
     */
    public GraduationDesignPlanRecord() {
        super(GraduationDesignPlan.GRADUATION_DESIGN_PLAN);
    }

    /**
     * Create a detached, initialised GraduationDesignPlanRecord
     */
    public GraduationDesignPlanRecord(String graduationDesignPlanId, String scheduling, String supervisionTime, String guideLocation, String guideContent, String note, String graduationDesignTeacherId, Timestamp addTime) {
        super(GraduationDesignPlan.GRADUATION_DESIGN_PLAN);

        set(0, graduationDesignPlanId);
        set(1, scheduling);
        set(2, supervisionTime);
        set(3, guideLocation);
        set(4, guideContent);
        set(5, note);
        set(6, graduationDesignTeacherId);
        set(7, addTime);
    }
}
