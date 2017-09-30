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
public class School implements Serializable {

    private static final long serialVersionUID = -1303612146;

    private Integer schoolId;
    private String  schoolName;
    private Byte    schoolIsDel;

    public School() {}

    public School(School value) {
        this.schoolId = value.schoolId;
        this.schoolName = value.schoolName;
        this.schoolIsDel = value.schoolIsDel;
    }

    public School(
        Integer schoolId,
        String  schoolName,
        Byte    schoolIsDel
    ) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
        this.schoolIsDel = schoolIsDel;
    }

    @NotNull
    public Integer getSchoolId() {
        return this.schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    @NotNull
    @Size(max = 200)
    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Byte getSchoolIsDel() {
        return this.schoolIsDel;
    }

    public void setSchoolIsDel(Byte schoolIsDel) {
        this.schoolIsDel = schoolIsDel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("School (");

        sb.append(schoolId);
        sb.append(", ").append(schoolName);
        sb.append(", ").append(schoolIsDel);

        sb.append(")");
        return sb.toString();
    }
}
