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
public class DefenseGroupMember implements Serializable {

    private static final long serialVersionUID = 906470821;

    private String graduationDesignTeacherId;
    private String defenseGroupId;
    private String note;

    public DefenseGroupMember() {}

    public DefenseGroupMember(DefenseGroupMember value) {
        this.graduationDesignTeacherId = value.graduationDesignTeacherId;
        this.defenseGroupId = value.defenseGroupId;
        this.note = value.note;
    }

    public DefenseGroupMember(
        String graduationDesignTeacherId,
        String defenseGroupId,
        String note
    ) {
        this.graduationDesignTeacherId = graduationDesignTeacherId;
        this.defenseGroupId = defenseGroupId;
        this.note = note;
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
    public String getDefenseGroupId() {
        return this.defenseGroupId;
    }

    public void setDefenseGroupId(String defenseGroupId) {
        this.defenseGroupId = defenseGroupId;
    }

    @Size(max = 100)
    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DefenseGroupMember (");

        sb.append(graduationDesignTeacherId);
        sb.append(", ").append(defenseGroupId);
        sb.append(", ").append(note);

        sb.append(")");
        return sb.toString();
    }
}
