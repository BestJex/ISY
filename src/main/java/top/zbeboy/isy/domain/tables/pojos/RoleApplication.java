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
public class RoleApplication implements Serializable {

    private static final long serialVersionUID = 28325622;

    private String roleId;
    private String applicationId;

    public RoleApplication() {}

    public RoleApplication(RoleApplication value) {
        this.roleId = value.roleId;
        this.applicationId = value.applicationId;
    }

    public RoleApplication(
        String roleId,
        String applicationId
    ) {
        this.roleId = roleId;
        this.applicationId = applicationId;
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
    @Size(max = 64)
    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RoleApplication (");

        sb.append(roleId);
        sb.append(", ").append(applicationId);

        sb.append(")");
        return sb.toString();
    }
}
