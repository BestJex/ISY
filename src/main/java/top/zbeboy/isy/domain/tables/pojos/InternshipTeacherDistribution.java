/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class InternshipTeacherDistribution implements Serializable {

    private static final long serialVersionUID = 1349354947;

    private Integer staffId;
    private Integer studentId;
    private String  internshipReleaseId;
    private String  username;
    private String  studentRealName;
    private String  assigner;

    public InternshipTeacherDistribution() {}

    public InternshipTeacherDistribution(InternshipTeacherDistribution value) {
        this.staffId = value.staffId;
        this.studentId = value.studentId;
        this.internshipReleaseId = value.internshipReleaseId;
        this.username = value.username;
        this.studentRealName = value.studentRealName;
        this.assigner = value.assigner;
    }

    public InternshipTeacherDistribution(
        Integer staffId,
        Integer studentId,
        String  internshipReleaseId,
        String  username,
        String  studentRealName,
        String  assigner
    ) {
        this.staffId = staffId;
        this.studentId = studentId;
        this.internshipReleaseId = internshipReleaseId;
        this.username = username;
        this.studentRealName = studentRealName;
        this.assigner = assigner;
    }

    @NotNull
    public Integer getStaffId() {
        return this.staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
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
    @Size(max = 200)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull
    @Size(max = 30)
    public String getStudentRealName() {
        return this.studentRealName;
    }

    public void setStudentRealName(String studentRealName) {
        this.studentRealName = studentRealName;
    }

    @NotNull
    @Size(max = 30)
    public String getAssigner() {
        return this.assigner;
    }

    public void setAssigner(String assigner) {
        this.assigner = assigner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InternshipTeacherDistribution (");

        sb.append(staffId);
        sb.append(", ").append(studentId);
        sb.append(", ").append(internshipReleaseId);
        sb.append(", ").append(username);
        sb.append(", ").append(studentRealName);
        sb.append(", ").append(assigner);

        sb.append(")");
        return sb.toString();
    }
}
