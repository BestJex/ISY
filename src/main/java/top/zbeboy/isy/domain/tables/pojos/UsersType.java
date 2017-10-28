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
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersType implements Serializable {

    private static final long serialVersionUID = -890345351;

    private Integer usersTypeId;
    private String  usersTypeName;

    public UsersType() {}

    public UsersType(UsersType value) {
        this.usersTypeId = value.usersTypeId;
        this.usersTypeName = value.usersTypeName;
    }

    public UsersType(
        Integer usersTypeId,
        String  usersTypeName
    ) {
        this.usersTypeId = usersTypeId;
        this.usersTypeName = usersTypeName;
    }

    @NotNull
    public Integer getUsersTypeId() {
        return this.usersTypeId;
    }

    public void setUsersTypeId(Integer usersTypeId) {
        this.usersTypeId = usersTypeId;
    }

    @NotNull
    @Size(max = 50)
    public String getUsersTypeName() {
        return this.usersTypeName;
    }

    public void setUsersTypeName(String usersTypeName) {
        this.usersTypeName = usersTypeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UsersType (");

        sb.append(usersTypeId);
        sb.append(", ").append(usersTypeName);

        sb.append(")");
        return sb.toString();
    }
}
