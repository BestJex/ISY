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
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.InternshipRelease;


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
public class InternshipReleaseRecord extends UpdatableRecordImpl<InternshipReleaseRecord> implements Record13<String, String, Timestamp, String, String, Timestamp, Timestamp, Timestamp, Timestamp, Byte, Integer, Integer, String> {

    private static final long serialVersionUID = -1859145322;

    /**
     * Setter for <code>isy.internship_release.internship_release_id</code>.
     */
    public void setInternshipReleaseId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.internship_release.internship_release_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getInternshipReleaseId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.internship_release.internship_title</code>.
     */
    public void setInternshipTitle(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.internship_release.internship_title</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getInternshipTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>isy.internship_release.release_time</code>.
     */
    public void setReleaseTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.internship_release.release_time</code>.
     */
    public Timestamp getReleaseTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>isy.internship_release.username</code>.
     */
    public void setUsername(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>isy.internship_release.username</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getUsername() {
        return (String) get(3);
    }

    /**
     * Setter for <code>isy.internship_release.allow_grade</code>.
     */
    public void setAllowGrade(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>isy.internship_release.allow_grade</code>.
     */
    @NotNull
    @Size(max = 5)
    public String getAllowGrade() {
        return (String) get(4);
    }

    /**
     * Setter for <code>isy.internship_release.teacher_distribution_start_time</code>.
     */
    public void setTeacherDistributionStartTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>isy.internship_release.teacher_distribution_start_time</code>.
     */
    @NotNull
    public Timestamp getTeacherDistributionStartTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>isy.internship_release.teacher_distribution_end_time</code>.
     */
    public void setTeacherDistributionEndTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>isy.internship_release.teacher_distribution_end_time</code>.
     */
    @NotNull
    public Timestamp getTeacherDistributionEndTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>isy.internship_release.start_time</code>.
     */
    public void setStartTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>isy.internship_release.start_time</code>.
     */
    @NotNull
    public Timestamp getStartTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>isy.internship_release.end_time</code>.
     */
    public void setEndTime(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>isy.internship_release.end_time</code>.
     */
    @NotNull
    public Timestamp getEndTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>isy.internship_release.internship_release_is_del</code>.
     */
    public void setInternshipReleaseIsDel(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>isy.internship_release.internship_release_is_del</code>.
     */
    @NotNull
    public Byte getInternshipReleaseIsDel() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>isy.internship_release.department_id</code>.
     */
    public void setDepartmentId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>isy.internship_release.department_id</code>.
     */
    @NotNull
    public Integer getDepartmentId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>isy.internship_release.internship_type_id</code>.
     */
    public void setInternshipTypeId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>isy.internship_release.internship_type_id</code>.
     */
    @NotNull
    public Integer getInternshipTypeId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>isy.internship_release.publisher</code>.
     */
    public void setPublisher(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>isy.internship_release.publisher</code>.
     */
    @NotNull
    @Size(max = 30)
    public String getPublisher() {
        return (String) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, Timestamp, String, String, Timestamp, Timestamp, Timestamp, Timestamp, Byte, Integer, Integer, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, Timestamp, String, String, Timestamp, Timestamp, Timestamp, Timestamp, Byte, Integer, Integer, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InternshipRelease.INTERNSHIP_RELEASE.INTERNSHIP_RELEASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InternshipRelease.INTERNSHIP_RELEASE.INTERNSHIP_TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return InternshipRelease.INTERNSHIP_RELEASE.RELEASE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InternshipRelease.INTERNSHIP_RELEASE.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InternshipRelease.INTERNSHIP_RELEASE.ALLOW_GRADE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return InternshipRelease.INTERNSHIP_RELEASE.TEACHER_DISTRIBUTION_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return InternshipRelease.INTERNSHIP_RELEASE.TEACHER_DISTRIBUTION_END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return InternshipRelease.INTERNSHIP_RELEASE.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return InternshipRelease.INTERNSHIP_RELEASE.END_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return InternshipRelease.INTERNSHIP_RELEASE.INTERNSHIP_RELEASE_IS_DEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return InternshipRelease.INTERNSHIP_RELEASE.DEPARTMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return InternshipRelease.INTERNSHIP_RELEASE.INTERNSHIP_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return InternshipRelease.INTERNSHIP_RELEASE.PUBLISHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getInternshipReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getInternshipTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getReleaseTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAllowGrade();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getTeacherDistributionStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getTeacherDistributionEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getEndTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getInternshipReleaseIsDel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getDepartmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getInternshipTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getPublisher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value1(String value) {
        setInternshipReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value2(String value) {
        setInternshipTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value3(Timestamp value) {
        setReleaseTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value4(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value5(String value) {
        setAllowGrade(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value6(Timestamp value) {
        setTeacherDistributionStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value7(Timestamp value) {
        setTeacherDistributionEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value8(Timestamp value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value9(Timestamp value) {
        setEndTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value10(Byte value) {
        setInternshipReleaseIsDel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value11(Integer value) {
        setDepartmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value12(Integer value) {
        setInternshipTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord value13(String value) {
        setPublisher(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseRecord values(String value1, String value2, Timestamp value3, String value4, String value5, Timestamp value6, Timestamp value7, Timestamp value8, Timestamp value9, Byte value10, Integer value11, Integer value12, String value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InternshipReleaseRecord
     */
    public InternshipReleaseRecord() {
        super(InternshipRelease.INTERNSHIP_RELEASE);
    }

    /**
     * Create a detached, initialised InternshipReleaseRecord
     */
    public InternshipReleaseRecord(String internshipReleaseId, String internshipTitle, Timestamp releaseTime, String username, String allowGrade, Timestamp teacherDistributionStartTime, Timestamp teacherDistributionEndTime, Timestamp startTime, Timestamp endTime, Byte internshipReleaseIsDel, Integer departmentId, Integer internshipTypeId, String publisher) {
        super(InternshipRelease.INTERNSHIP_RELEASE);

        set(0, internshipReleaseId);
        set(1, internshipTitle);
        set(2, releaseTime);
        set(3, username);
        set(4, allowGrade);
        set(5, teacherDistributionStartTime);
        set(6, teacherDistributionEndTime);
        set(7, startTime);
        set(8, endTime);
        set(9, internshipReleaseIsDel);
        set(10, departmentId);
        set(11, internshipTypeId);
        set(12, publisher);
    }
}
