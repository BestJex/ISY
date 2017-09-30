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
public class GraduationDesignDatumType implements Serializable {

    private static final long serialVersionUID = 1200500434;

    private Integer graduationDesignDatumTypeId;
    private String  graduationDesignDatumTypeName;

    public GraduationDesignDatumType() {}

    public GraduationDesignDatumType(GraduationDesignDatumType value) {
        this.graduationDesignDatumTypeId = value.graduationDesignDatumTypeId;
        this.graduationDesignDatumTypeName = value.graduationDesignDatumTypeName;
    }

    public GraduationDesignDatumType(
        Integer graduationDesignDatumTypeId,
        String  graduationDesignDatumTypeName
    ) {
        this.graduationDesignDatumTypeId = graduationDesignDatumTypeId;
        this.graduationDesignDatumTypeName = graduationDesignDatumTypeName;
    }

    @NotNull
    public Integer getGraduationDesignDatumTypeId() {
        return this.graduationDesignDatumTypeId;
    }

    public void setGraduationDesignDatumTypeId(Integer graduationDesignDatumTypeId) {
        this.graduationDesignDatumTypeId = graduationDesignDatumTypeId;
    }

    @NotNull
    @Size(max = 50)
    public String getGraduationDesignDatumTypeName() {
        return this.graduationDesignDatumTypeName;
    }

    public void setGraduationDesignDatumTypeName(String graduationDesignDatumTypeName) {
        this.graduationDesignDatumTypeName = graduationDesignDatumTypeName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GraduationDesignDatumType (");

        sb.append(graduationDesignDatumTypeId);
        sb.append(", ").append(graduationDesignDatumTypeName);

        sb.append(")");
        return sb.toString();
    }
}
