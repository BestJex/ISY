/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.InternshipRegulate;


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
public class InternshipRegulateRecord extends UpdatableRecordImpl<InternshipRegulateRecord> implements Record14<String, String, String, String, String, String, String, Date, String, String, Timestamp, Integer, String, Integer> {

    private static final long serialVersionUID = -1126017097;

    /**
     * Setter for <code>isy.internship_regulate.internship_regulate_id</code>.
     */
    public void setInternshipRegulateId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.internship_regulate_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getInternshipRegulateId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.internship_regulate.student_name</code>.
     */
    public void setStudentName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.student_name</code>.
     */
    @NotNull
    @Size(max = 30)
    public String getStudentName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>isy.internship_regulate.student_number</code>.
     */
    public void setStudentNumber(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.student_number</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getStudentNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>isy.internship_regulate.student_tel</code>.
     */
    public void setStudentTel(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.student_tel</code>.
     */
    @NotNull
    @Size(max = 15)
    public String getStudentTel() {
        return (String) get(3);
    }

    /**
     * Setter for <code>isy.internship_regulate.internship_content</code>.
     */
    public void setInternshipContent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.internship_content</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getInternshipContent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>isy.internship_regulate.internship_progress</code>.
     */
    public void setInternshipProgress(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.internship_progress</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getInternshipProgress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>isy.internship_regulate.report_way</code>.
     */
    public void setReportWay(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.report_way</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getReportWay() {
        return (String) get(6);
    }

    /**
     * Setter for <code>isy.internship_regulate.report_date</code>.
     */
    public void setReportDate(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.report_date</code>.
     */
    @NotNull
    public Date getReportDate() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>isy.internship_regulate.school_guidance_teacher</code>.
     */
    public void setSchoolGuidanceTeacher(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.school_guidance_teacher</code>.
     */
    @NotNull
    @Size(max = 30)
    public String getSchoolGuidanceTeacher() {
        return (String) get(8);
    }

    /**
     * Setter for <code>isy.internship_regulate.tliy</code>.
     */
    public void setTliy(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.tliy</code>.
     */
    @Size(max = 200)
    public String getTliy() {
        return (String) get(9);
    }

    /**
     * Setter for <code>isy.internship_regulate.create_date</code>.
     */
    public void setCreateDate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.create_date</code>.
     */
    @NotNull
    public Timestamp getCreateDate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>isy.internship_regulate.student_id</code>.
     */
    public void setStudentId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.student_id</code>.
     */
    @NotNull
    public Integer getStudentId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>isy.internship_regulate.internship_release_id</code>.
     */
    public void setInternshipReleaseId(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.internship_release_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getInternshipReleaseId() {
        return (String) get(12);
    }

    /**
     * Setter for <code>isy.internship_regulate.staff_id</code>.
     */
    public void setStaffId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>isy.internship_regulate.staff_id</code>.
     */
    @NotNull
    public Integer getStaffId() {
        return (Integer) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, String, String, String, String, Date, String, String, Timestamp, Integer, String, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<String, String, String, String, String, String, String, Date, String, String, Timestamp, Integer, String, Integer> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InternshipRegulate.INTERNSHIP_REGULATE.INTERNSHIP_REGULATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InternshipRegulate.INTERNSHIP_REGULATE.STUDENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InternshipRegulate.INTERNSHIP_REGULATE.STUDENT_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InternshipRegulate.INTERNSHIP_REGULATE.STUDENT_TEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InternshipRegulate.INTERNSHIP_REGULATE.INTERNSHIP_CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return InternshipRegulate.INTERNSHIP_REGULATE.INTERNSHIP_PROGRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InternshipRegulate.INTERNSHIP_REGULATE.REPORT_WAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return InternshipRegulate.INTERNSHIP_REGULATE.REPORT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return InternshipRegulate.INTERNSHIP_REGULATE.SCHOOL_GUIDANCE_TEACHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return InternshipRegulate.INTERNSHIP_REGULATE.TLIY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return InternshipRegulate.INTERNSHIP_REGULATE.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return InternshipRegulate.INTERNSHIP_REGULATE.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return InternshipRegulate.INTERNSHIP_REGULATE.INTERNSHIP_RELEASE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return InternshipRegulate.INTERNSHIP_REGULATE.STAFF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getInternshipRegulateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getStudentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getStudentNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStudentTel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getInternshipContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getInternshipProgress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getReportWay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getReportDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSchoolGuidanceTeacher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTliy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getInternshipReleaseId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value1(String value) {
        setInternshipRegulateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value2(String value) {
        setStudentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value3(String value) {
        setStudentNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value4(String value) {
        setStudentTel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value5(String value) {
        setInternshipContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value6(String value) {
        setInternshipProgress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value7(String value) {
        setReportWay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value8(Date value) {
        setReportDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value9(String value) {
        setSchoolGuidanceTeacher(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value10(String value) {
        setTliy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value11(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value12(Integer value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value13(String value) {
        setInternshipReleaseId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord value14(Integer value) {
        setStaffId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipRegulateRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Date value8, String value9, String value10, Timestamp value11, Integer value12, String value13, Integer value14) {
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
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InternshipRegulateRecord
     */
    public InternshipRegulateRecord() {
        super(InternshipRegulate.INTERNSHIP_REGULATE);
    }

    /**
     * Create a detached, initialised InternshipRegulateRecord
     */
    public InternshipRegulateRecord(String internshipRegulateId, String studentName, String studentNumber, String studentTel, String internshipContent, String internshipProgress, String reportWay, Date reportDate, String schoolGuidanceTeacher, String tliy, Timestamp createDate, Integer studentId, String internshipReleaseId, Integer staffId) {
        super(InternshipRegulate.INTERNSHIP_REGULATE);

        set(0, internshipRegulateId);
        set(1, studentName);
        set(2, studentNumber);
        set(3, studentTel);
        set(4, internshipContent);
        set(5, internshipProgress);
        set(6, reportWay);
        set(7, reportDate);
        set(8, schoolGuidanceTeacher);
        set(9, tliy);
        set(10, createDate);
        set(11, studentId);
        set(12, internshipReleaseId);
        set(13, staffId);
    }
}
