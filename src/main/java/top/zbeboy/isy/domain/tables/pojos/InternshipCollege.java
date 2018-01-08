/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

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
public class InternshipCollege implements Serializable {

    private static final long serialVersionUID = 1758668441;

    private String  internshipCollegeId;
    private Integer studentId;
    private String  studentUsername;
    private String  internshipReleaseId;
    private String  studentName;
    private String  collegeClass;
    private String  studentSex;
    private String  studentNumber;
    private String  phoneNumber;
    private String  qqMailbox;
    private String  parentalContact;
    private String  headmaster;
    private String  headmasterContact;
    private String  internshipCollegeName;
    private String  internshipCollegeAddress;
    private String  internshipCollegeContacts;
    private String  internshipCollegeTel;
    private String  schoolGuidanceTeacher;
    private String  schoolGuidanceTeacherTel;
    private Date    startTime;
    private Date    endTime;
    private Byte    commitmentBook;
    private Byte    safetyResponsibilityBook;
    private Byte    practiceAgreement;
    private Byte    internshipApplication;
    private Byte    practiceReceiving;
    private Byte    securityEducationAgreement;
    private Byte    parentalConsent;

    public InternshipCollege() {}

    public InternshipCollege(InternshipCollege value) {
        this.internshipCollegeId = value.internshipCollegeId;
        this.studentId = value.studentId;
        this.studentUsername = value.studentUsername;
        this.internshipReleaseId = value.internshipReleaseId;
        this.studentName = value.studentName;
        this.collegeClass = value.collegeClass;
        this.studentSex = value.studentSex;
        this.studentNumber = value.studentNumber;
        this.phoneNumber = value.phoneNumber;
        this.qqMailbox = value.qqMailbox;
        this.parentalContact = value.parentalContact;
        this.headmaster = value.headmaster;
        this.headmasterContact = value.headmasterContact;
        this.internshipCollegeName = value.internshipCollegeName;
        this.internshipCollegeAddress = value.internshipCollegeAddress;
        this.internshipCollegeContacts = value.internshipCollegeContacts;
        this.internshipCollegeTel = value.internshipCollegeTel;
        this.schoolGuidanceTeacher = value.schoolGuidanceTeacher;
        this.schoolGuidanceTeacherTel = value.schoolGuidanceTeacherTel;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.commitmentBook = value.commitmentBook;
        this.safetyResponsibilityBook = value.safetyResponsibilityBook;
        this.practiceAgreement = value.practiceAgreement;
        this.internshipApplication = value.internshipApplication;
        this.practiceReceiving = value.practiceReceiving;
        this.securityEducationAgreement = value.securityEducationAgreement;
        this.parentalConsent = value.parentalConsent;
    }

    public InternshipCollege(
        String  internshipCollegeId,
        Integer studentId,
        String  studentUsername,
        String  internshipReleaseId,
        String  studentName,
        String  collegeClass,
        String  studentSex,
        String  studentNumber,
        String  phoneNumber,
        String  qqMailbox,
        String  parentalContact,
        String  headmaster,
        String  headmasterContact,
        String  internshipCollegeName,
        String  internshipCollegeAddress,
        String  internshipCollegeContacts,
        String  internshipCollegeTel,
        String  schoolGuidanceTeacher,
        String  schoolGuidanceTeacherTel,
        Date    startTime,
        Date    endTime,
        Byte    commitmentBook,
        Byte    safetyResponsibilityBook,
        Byte    practiceAgreement,
        Byte    internshipApplication,
        Byte    practiceReceiving,
        Byte    securityEducationAgreement,
        Byte    parentalConsent
    ) {
        this.internshipCollegeId = internshipCollegeId;
        this.studentId = studentId;
        this.studentUsername = studentUsername;
        this.internshipReleaseId = internshipReleaseId;
        this.studentName = studentName;
        this.collegeClass = collegeClass;
        this.studentSex = studentSex;
        this.studentNumber = studentNumber;
        this.phoneNumber = phoneNumber;
        this.qqMailbox = qqMailbox;
        this.parentalContact = parentalContact;
        this.headmaster = headmaster;
        this.headmasterContact = headmasterContact;
        this.internshipCollegeName = internshipCollegeName;
        this.internshipCollegeAddress = internshipCollegeAddress;
        this.internshipCollegeContacts = internshipCollegeContacts;
        this.internshipCollegeTel = internshipCollegeTel;
        this.schoolGuidanceTeacher = schoolGuidanceTeacher;
        this.schoolGuidanceTeacherTel = schoolGuidanceTeacherTel;
        this.startTime = startTime;
        this.endTime = endTime;
        this.commitmentBook = commitmentBook;
        this.safetyResponsibilityBook = safetyResponsibilityBook;
        this.practiceAgreement = practiceAgreement;
        this.internshipApplication = internshipApplication;
        this.practiceReceiving = practiceReceiving;
        this.securityEducationAgreement = securityEducationAgreement;
        this.parentalConsent = parentalConsent;
    }

    @NotNull
    @Size(max = 64)
    public String getInternshipCollegeId() {
        return this.internshipCollegeId;
    }

    public void setInternshipCollegeId(String internshipCollegeId) {
        this.internshipCollegeId = internshipCollegeId;
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
    public String getStudentUsername() {
        return this.studentUsername;
    }

    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
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
    @Size(max = 15)
    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @NotNull
    @Size(max = 50)
    public String getCollegeClass() {
        return this.collegeClass;
    }

    public void setCollegeClass(String collegeClass) {
        this.collegeClass = collegeClass;
    }

    @NotNull
    @Size(max = 24)
    public String getStudentSex() {
        return this.studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
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
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @NotNull
    @Size(max = 100)
    public String getQqMailbox() {
        return this.qqMailbox;
    }

    public void setQqMailbox(String qqMailbox) {
        this.qqMailbox = qqMailbox;
    }

    @NotNull
    @Size(max = 48)
    public String getParentalContact() {
        return this.parentalContact;
    }

    public void setParentalContact(String parentalContact) {
        this.parentalContact = parentalContact;
    }

    @NotNull
    @Size(max = 10)
    public String getHeadmaster() {
        return this.headmaster;
    }

    public void setHeadmaster(String headmaster) {
        this.headmaster = headmaster;
    }

    @NotNull
    @Size(max = 20)
    public String getHeadmasterContact() {
        return this.headmasterContact;
    }

    public void setHeadmasterContact(String headmasterContact) {
        this.headmasterContact = headmasterContact;
    }

    @NotNull
    @Size(max = 200)
    public String getInternshipCollegeName() {
        return this.internshipCollegeName;
    }

    public void setInternshipCollegeName(String internshipCollegeName) {
        this.internshipCollegeName = internshipCollegeName;
    }

    @NotNull
    @Size(max = 500)
    public String getInternshipCollegeAddress() {
        return this.internshipCollegeAddress;
    }

    public void setInternshipCollegeAddress(String internshipCollegeAddress) {
        this.internshipCollegeAddress = internshipCollegeAddress;
    }

    @NotNull
    @Size(max = 10)
    public String getInternshipCollegeContacts() {
        return this.internshipCollegeContacts;
    }

    public void setInternshipCollegeContacts(String internshipCollegeContacts) {
        this.internshipCollegeContacts = internshipCollegeContacts;
    }

    @NotNull
    @Size(max = 20)
    public String getInternshipCollegeTel() {
        return this.internshipCollegeTel;
    }

    public void setInternshipCollegeTel(String internshipCollegeTel) {
        this.internshipCollegeTel = internshipCollegeTel;
    }

    @NotNull
    @Size(max = 10)
    public String getSchoolGuidanceTeacher() {
        return this.schoolGuidanceTeacher;
    }

    public void setSchoolGuidanceTeacher(String schoolGuidanceTeacher) {
        this.schoolGuidanceTeacher = schoolGuidanceTeacher;
    }

    @NotNull
    @Size(max = 20)
    public String getSchoolGuidanceTeacherTel() {
        return this.schoolGuidanceTeacherTel;
    }

    public void setSchoolGuidanceTeacherTel(String schoolGuidanceTeacherTel) {
        this.schoolGuidanceTeacherTel = schoolGuidanceTeacherTel;
    }

    @NotNull
    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @NotNull
    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Byte getCommitmentBook() {
        return this.commitmentBook;
    }

    public void setCommitmentBook(Byte commitmentBook) {
        this.commitmentBook = commitmentBook;
    }

    public Byte getSafetyResponsibilityBook() {
        return this.safetyResponsibilityBook;
    }

    public void setSafetyResponsibilityBook(Byte safetyResponsibilityBook) {
        this.safetyResponsibilityBook = safetyResponsibilityBook;
    }

    public Byte getPracticeAgreement() {
        return this.practiceAgreement;
    }

    public void setPracticeAgreement(Byte practiceAgreement) {
        this.practiceAgreement = practiceAgreement;
    }

    public Byte getInternshipApplication() {
        return this.internshipApplication;
    }

    public void setInternshipApplication(Byte internshipApplication) {
        this.internshipApplication = internshipApplication;
    }

    public Byte getPracticeReceiving() {
        return this.practiceReceiving;
    }

    public void setPracticeReceiving(Byte practiceReceiving) {
        this.practiceReceiving = practiceReceiving;
    }

    public Byte getSecurityEducationAgreement() {
        return this.securityEducationAgreement;
    }

    public void setSecurityEducationAgreement(Byte securityEducationAgreement) {
        this.securityEducationAgreement = securityEducationAgreement;
    }

    public Byte getParentalConsent() {
        return this.parentalConsent;
    }

    public void setParentalConsent(Byte parentalConsent) {
        this.parentalConsent = parentalConsent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InternshipCollege (");

        sb.append(internshipCollegeId);
        sb.append(", ").append(studentId);
        sb.append(", ").append(studentUsername);
        sb.append(", ").append(internshipReleaseId);
        sb.append(", ").append(studentName);
        sb.append(", ").append(collegeClass);
        sb.append(", ").append(studentSex);
        sb.append(", ").append(studentNumber);
        sb.append(", ").append(phoneNumber);
        sb.append(", ").append(qqMailbox);
        sb.append(", ").append(parentalContact);
        sb.append(", ").append(headmaster);
        sb.append(", ").append(headmasterContact);
        sb.append(", ").append(internshipCollegeName);
        sb.append(", ").append(internshipCollegeAddress);
        sb.append(", ").append(internshipCollegeContacts);
        sb.append(", ").append(internshipCollegeTel);
        sb.append(", ").append(schoolGuidanceTeacher);
        sb.append(", ").append(schoolGuidanceTeacherTel);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(commitmentBook);
        sb.append(", ").append(safetyResponsibilityBook);
        sb.append(", ").append(practiceAgreement);
        sb.append(", ").append(internshipApplication);
        sb.append(", ").append(practiceReceiving);
        sb.append(", ").append(securityEducationAgreement);
        sb.append(", ").append(parentalConsent);

        sb.append(")");
        return sb.toString();
    }
}
