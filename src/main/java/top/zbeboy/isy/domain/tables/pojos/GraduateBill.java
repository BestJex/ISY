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
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GraduateBill implements Serializable {

    private static final long serialVersionUID = 1740083107;

    private String  graduateBillId;
    private Integer scoreTypeId;
    private String  graduationDesignReleaseId;
    private String  graduationDesignPresubjectId;

    public GraduateBill() {}

    public GraduateBill(GraduateBill value) {
        this.graduateBillId = value.graduateBillId;
        this.scoreTypeId = value.scoreTypeId;
        this.graduationDesignReleaseId = value.graduationDesignReleaseId;
        this.graduationDesignPresubjectId = value.graduationDesignPresubjectId;
    }

    public GraduateBill(
        String  graduateBillId,
        Integer scoreTypeId,
        String  graduationDesignReleaseId,
        String  graduationDesignPresubjectId
    ) {
        this.graduateBillId = graduateBillId;
        this.scoreTypeId = scoreTypeId;
        this.graduationDesignReleaseId = graduationDesignReleaseId;
        this.graduationDesignPresubjectId = graduationDesignPresubjectId;
    }

    @NotNull
    @Size(max = 64)
    public String getGraduateBillId() {
        return this.graduateBillId;
    }

    public void setGraduateBillId(String graduateBillId) {
        this.graduateBillId = graduateBillId;
    }

    @NotNull
    public Integer getScoreTypeId() {
        return this.scoreTypeId;
    }

    public void setScoreTypeId(Integer scoreTypeId) {
        this.scoreTypeId = scoreTypeId;
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
    @Size(max = 64)
    public String getGraduationDesignPresubjectId() {
        return this.graduationDesignPresubjectId;
    }

    public void setGraduationDesignPresubjectId(String graduationDesignPresubjectId) {
        this.graduationDesignPresubjectId = graduationDesignPresubjectId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GraduateBill (");

        sb.append(graduateBillId);
        sb.append(", ").append(scoreTypeId);
        sb.append(", ").append(graduationDesignReleaseId);
        sb.append(", ").append(graduationDesignPresubjectId);

        sb.append(")");
        return sb.toString();
    }
}
