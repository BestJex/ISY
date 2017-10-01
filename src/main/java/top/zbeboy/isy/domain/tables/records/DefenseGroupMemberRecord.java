/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;

import top.zbeboy.isy.domain.tables.DefenseGroupMember;


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
public class DefenseGroupMemberRecord extends TableRecordImpl<DefenseGroupMemberRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -834422247;

    /**
     * Setter for <code>isy.defense_group_member.graduation_design_teacher_id</code>.
     */
    public void setGraduationDesignTeacherId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.defense_group_member.graduation_design_teacher_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getGraduationDesignTeacherId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.defense_group_member.defense_group_id</code>.
     */
    public void setDefenseGroupId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.defense_group_member.defense_group_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getDefenseGroupId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>isy.defense_group_member.note</code>.
     */
    public void setNote(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.defense_group_member.note</code>.
     */
    @Size(max = 100)
    public String getNote() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DefenseGroupMember.DEFENSE_GROUP_MEMBER.GRADUATION_DESIGN_TEACHER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DefenseGroupMember.DEFENSE_GROUP_MEMBER.DEFENSE_GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DefenseGroupMember.DEFENSE_GROUP_MEMBER.NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getGraduationDesignTeacherId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDefenseGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseGroupMemberRecord value1(String value) {
        setGraduationDesignTeacherId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseGroupMemberRecord value2(String value) {
        setDefenseGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseGroupMemberRecord value3(String value) {
        setNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseGroupMemberRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DefenseGroupMemberRecord
     */
    public DefenseGroupMemberRecord() {
        super(DefenseGroupMember.DEFENSE_GROUP_MEMBER);
    }

    /**
     * Create a detached, initialised DefenseGroupMemberRecord
     */
    public DefenseGroupMemberRecord(String graduationDesignTeacherId, String defenseGroupId, String note) {
        super(DefenseGroupMember.DEFENSE_GROUP_MEMBER);

        set(0, graduationDesignTeacherId);
        set(1, defenseGroupId);
        set(2, note);
    }
}
