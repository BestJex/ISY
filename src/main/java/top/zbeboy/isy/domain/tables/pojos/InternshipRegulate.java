/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class InternshipRegulate implements Serializable {

    private static final long serialVersionUID = -1463032357;

    private String    internshipRegulateId;
    private String    studentName;
    private String    studentNumber;
    private String    studentTel;
    private String    internshipContent;
    private String    internshipProgress;
    private String    reportWay;
    private Date      reportDate;
    private String    schoolGuidanceTeacher;
    private String    tliy;
    private Timestamp createDate;
    private Integer   studentId;
    private String    internshipReleaseId;
    private Integer   staffId;

    public InternshipRegulate() {}

    public InternshipRegulate(InternshipRegulate value) {
        this.internshipRegulateId = value.internshipRegulateId;
        this.studentName = value.studentName;
        this.studentNumber = value.studentNumber;
        this.studentTel = value.studentTel;
        this.internshipContent = value.internshipContent;
        this.internshipProgress = value.internshipProgress;
        this.reportWay = value.reportWay;
        this.reportDate = value.reportDate;
        this.schoolGuidanceTeacher = value.schoolGuidanceTeacher;
        this.tliy = value.tliy;
        this.createDate = value.createDate;
        this.studentId = value.studentId;
        this.internshipReleaseId = value.internshipReleaseId;
        this.staffId = value.staffId;
    }

    public InternshipRegulate(
        String    internshipRegulateId,
        String    studentName,
        String    studentNumber,
        String    studentTel,
        String    internshipContent,
        String    internshipProgress,
        String    reportWay,
        Date      reportDate,
        String    schoolGuidanceTeacher,
        String    tliy,
        Timestamp createDate,
        Integer   studentId,
        String    internshipReleaseId,
        Integer   staffId
    ) {
        this.internshipRegulateId = internshipRegulateId;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentTel = studentTel;
        this.internshipContent = internshipContent;
        this.internshipProgress = internshipProgress;
        this.reportWay = reportWay;
        this.reportDate = reportDate;
        this.schoolGuidanceTeacher = schoolGuidanceTeacher;
        this.tliy = tliy;
        this.createDate = createDate;
        this.studentId = studentId;
        this.internshipReleaseId = internshipReleaseId;
        this.staffId = staffId;
    }

    @NotNull
    @Size(max = 64)
    public String getInternshipRegulateId() {
        return this.internshipRegulateId;
    }

    public void setInternshipRegulateId(String internshipRegulateId) {
        this.internshipRegulateId = internshipRegulateId;
    }

    @NotNull
    @Size(max = 30)
    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @NotNull
    @Size(max = 20)
    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    @NotNull
    @Size(max = 15)
    public String getStudentTel() {
        return this.studentTel;
    }

    public void setStudentTel(String studentTel) {
        this.studentTel = studentTel;
    }

    @NotNull
    @Size(max = 200)
    public String getInternshipContent() {
        return this.internshipContent;
    }

    public void setInternshipContent(String internshipContent) {
        this.internshipContent = internshipContent;
    }

    @NotNull
    @Size(max = 200)
    public String getInternshipProgress() {
        return this.internshipProgress;
    }

    public void setInternshipProgress(String internshipProgress) {
        this.internshipProgress = internshipProgress;
    }

    @NotNull
    @Size(max = 20)
    public String getReportWay() {
        return this.reportWay;
    }

    public void setReportWay(String reportWay) {
        this.reportWay = reportWay;
    }

    @NotNull
    public Date getReportDate() {
        return this.reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    @NotNull
    @Size(max = 30)
    public String getSchoolGuidanceTeacher() {
        return this.schoolGuidanceTeacher;
    }

    public void setSchoolGuidanceTeacher(String schoolGuidanceTeacher) {
        this.schoolGuidanceTeacher = schoolGuidanceTeacher;
    }

    @Size(max = 200)
    public String getTliy() {
        return this.tliy;
    }

    public void setTliy(String tliy) {
        this.tliy = tliy;
    }

    @NotNull
    public Timestamp getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @NotNull
    public Integer getStudentId() {
        return this.studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @NotNull
    @Size(max = 64)
    public String getInternshipReleaseId() {
        return this.internshipReleaseId;
    }

    public void setInternshipReleaseId(String internshipReleaseId) {
        this.internshipReleaseId = internshipReleaseId;
    }

    @NotNull
    public Integer getStaffId() {
        return this.staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InternshipRegulate (");

        sb.append(internshipRegulateId);
        sb.append(", ").append(studentName);
        sb.append(", ").append(studentNumber);
        sb.append(", ").append(studentTel);
        sb.append(", ").append(internshipContent);
        sb.append(", ").append(internshipProgress);
        sb.append(", ").append(reportWay);
        sb.append(", ").append(reportDate);
        sb.append(", ").append(schoolGuidanceTeacher);
        sb.append(", ").append(tliy);
        sb.append(", ").append(createDate);
        sb.append(", ").append(studentId);
        sb.append(", ").append(internshipReleaseId);
        sb.append(", ").append(staffId);

        sb.append(")");
        return sb.toString();
    }
}
