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
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GraduationDesignTeacher implements Serializable {

    private static final long serialVersionUID = 996617747;

    private String  graduationDesignTeacherId;
    private String  graduationDesignReleaseId;
    private Integer staffId;
    private Integer studentCount;
    private Integer residue;
    private String  username;

    public GraduationDesignTeacher() {}

    public GraduationDesignTeacher(GraduationDesignTeacher value) {
        this.graduationDesignTeacherId = value.graduationDesignTeacherId;
        this.graduationDesignReleaseId = value.graduationDesignReleaseId;
        this.staffId = value.staffId;
        this.studentCount = value.studentCount;
        this.residue = value.residue;
        this.username = value.username;
    }

    public GraduationDesignTeacher(
        String  graduationDesignTeacherId,
        String  graduationDesignReleaseId,
        Integer staffId,
        Integer studentCount,
        Integer residue,
        String  username
    ) {
        this.graduationDesignTeacherId = graduationDesignTeacherId;
        this.graduationDesignReleaseId = graduationDesignReleaseId;
        this.staffId = staffId;
        this.studentCount = studentCount;
        this.residue = residue;
        this.username = username;
    }

    @NotNull
    @Size(max = 64)
    public String getGraduationDesignTeacherId() {
        return this.graduationDesignTeacherId;
    }

    public void setGraduationDesignTeacherId(String graduationDesignTeacherId) {
        this.graduationDesignTeacherId = graduationDesignTeacherId;
    }

    @NotNull
    @Size(max = 64)
    public String getGraduationDesignReleaseId() {
        return this.graduationDesignReleaseId;
    }

    public void setGraduationDesignReleaseId(String graduationDesignReleaseId) {
        this.graduationDesignReleaseId = graduationDesignReleaseId;
    }

    @NotNull
    public Integer getStaffId() {
        return this.staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    @NotNull
    public Integer getStudentCount() {
        return this.studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public Integer getResidue() {
        return this.residue;
    }

    public void setResidue(Integer residue) {
        this.residue = residue;
    }

    @NotNull
    @Size(max = 64)
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GraduationDesignTeacher (");

        sb.append(graduationDesignTeacherId);
        sb.append(", ").append(graduationDesignReleaseId);
        sb.append(", ").append(staffId);
        sb.append(", ").append(studentCount);
        sb.append(", ").append(residue);
        sb.append(", ").append(username);

        sb.append(")");
        return sb.toString();
    }
}