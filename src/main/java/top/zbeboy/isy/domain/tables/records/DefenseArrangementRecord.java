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

import top.zbeboy.isy.domain.tables.DefenseArrangement;


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
public class DefenseArrangementRecord extends UpdatableRecordImpl<DefenseArrangementRecord> implements Record8<String, Timestamp, Timestamp, Timestamp, Timestamp, Integer, String, String> {

    private static final long serialVersionUID = -1814124008;

    /**
     * Setter for <code>isy.defense_arrangement.defense_arrangement_id</code>.
     */
    public void setDefenseArrangementId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.defense_arrangement.defense_arrangement_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getDefenseArrangementId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.defense_arrangement.paper_start_time</code>.
     */
    public void setPaperStartTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.defense_arrangement.paper_start_time</code>.
     */
    @NotNull
    public Timestamp getPaperStartTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>isy.defense_arrangement.paper_end_time</code>.
     */
    public void setPaperEndTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.defense_arrangement.paper_end_time</code>.
     */
    @NotNull
    public Timestamp getPaperEndTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>isy.defense_arrangement.defense_start_time</code>.
     */
    public void setDefenseStartTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>isy.defense_arrangement.defense_start_time</code>.
     */
    @NotNull
    public Timestamp getDefenseStartTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>isy.defense_arrangement.defense_end_time</code>.
     */
    public void setDefenseEndTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>isy.defense_arrangement.defense_end_time</code>.
     */
    @NotNull
    public Timestamp getDefenseEndTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>isy.defense_arrangement.interval_time</code>.
     */
    public void setIntervalTime(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>isy.defense_arrangement.interval_time</code>.
     */
    @NotNull
    public Integer getIntervalTime() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>isy.defense_arrangement.defense_note</code>.
     */
    public void setDefenseNote(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>isy.defense_arrangement.defense_note</code>.
     */
    @Size(max = 100)
    public String getDefenseNote() {
        return (String) get(6);
    }

    /**
     * Setter for <code>isy.defense_arrangement.graduation_design_release_id</code>.
     */
    public void setGraduationDesignReleaseId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>isy.defense_arrangement.graduation_design_release_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getGraduationDesignReleaseId() {
        return (String) get(7);
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
    public Row8<String, Timestamp, Timestamp, Timestamp, Timestamp, Integer, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Timestamp, Timestamp, Timestamp, Timestamp, Integer, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return DefenseArrangement.DEFENSE_ARRANGEMENT.DEFENSE_ARRANGEMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return DefenseArrangement.DEFENSE_ARRANGEMENT.PAPER_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return DefenseArrangement.DEFENSE_ARRANGEMENT.PAPER_END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return DefenseArrangement.DEFENSE_ARRANGEMENT.DEFENSE_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return DefenseArrangement.DEFENSE_ARRANGEMENT.DEFENSE_END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return DefenseArrangement.DEFENSE_ARRANGEMENT.INTERVAL_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DefenseArrangement.DEFENSE_ARRANGEMENT.DEFENSE_NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return DefenseArrangement.DEFENSE_ARRANGEMENT.GRADUATION_DESIGN_RELEASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getDefenseArrangementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getPaperStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getPaperEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getDefenseStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDefenseEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIntervalTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDefenseNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getGraduationDesignReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseArrangementRecord value1(String value) {
        setDefenseArrangementId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseArrangementRecord value2(Timestamp value) {
        setPaperStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseArrangementRecord value3(Timestamp value) {
        setPaperEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseArrangementRecord value4(Timestamp value) {
        setDefenseStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseArrangementRecord value5(Timestamp value) {
        setDefenseEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseArrangementRecord value6(Integer value) {
        setIntervalTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseArrangementRecord value7(String value) {
        setDefenseNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseArrangementRecord value8(String value) {
        setGraduationDesignReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DefenseArrangementRecord values(String value1, Timestamp value2, Timestamp value3, Timestamp value4, Timestamp value5, Integer value6, String value7, String value8) {
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
     * Create a detached DefenseArrangementRecord
     */
    public DefenseArrangementRecord() {
        super(DefenseArrangement.DEFENSE_ARRANGEMENT);
    }

    /**
     * Create a detached, initialised DefenseArrangementRecord
     */
    public DefenseArrangementRecord(String defenseArrangementId, Timestamp paperStartTime, Timestamp paperEndTime, Timestamp defenseStartTime, Timestamp defenseEndTime, Integer intervalTime, String defenseNote, String graduationDesignReleaseId) {
        super(DefenseArrangement.DEFENSE_ARRANGEMENT);

        set(0, defenseArrangementId);
        set(1, paperStartTime);
        set(2, paperEndTime);
        set(3, defenseStartTime);
        set(4, defenseEndTime);
        set(5, intervalTime);
        set(6, defenseNote);
        set(7, graduationDesignReleaseId);
    }
}
