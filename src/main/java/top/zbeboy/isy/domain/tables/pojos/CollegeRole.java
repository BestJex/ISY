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
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CollegeRole implements Serializable {

    private static final long serialVersionUID = 82629860;

    private String  roleId;
    private Integer collegeId;

    public CollegeRole() {}

    public CollegeRole(CollegeRole value) {
        this.roleId = value.roleId;
        this.collegeId = value.collegeId;
    }

    public CollegeRole(
        String  roleId,
        Integer collegeId
    ) {
        this.roleId = roleId;
        this.collegeId = collegeId;
    }

    @NotNull
    @Size(max = 64)
    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @NotNull
    public Integer getCollegeId() {
        return this.collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CollegeRole (");

        sb.append(roleId);
        sb.append(", ").append(collegeId);

        sb.append(")");
        return sb.toString();
    }
}
