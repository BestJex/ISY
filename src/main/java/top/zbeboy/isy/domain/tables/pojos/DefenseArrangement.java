/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class DefenseArrangement implements Serializable {

    private static final long serialVersionUID = 1475846989;

    private String    defenseArrangementId;
    private Timestamp paperStartTime;
    private Timestamp paperEndTime;
    private Timestamp defenseStartTime;
    private Timestamp defenseEndTime;
    private Integer   intervalTime;
    private String    defenseNote;
    private String    graduationDesignReleaseId;

    public DefenseArrangement() {}

    public DefenseArrangement(DefenseArrangement value) {
        this.defenseArrangementId = value.defenseArrangementId;
        this.paperStartTime = value.paperStartTime;
        this.paperEndTime = value.paperEndTime;
        this.defenseStartTime = value.defenseStartTime;
        this.defenseEndTime = value.defenseEndTime;
        this.intervalTime = value.intervalTime;
        this.defenseNote = value.defenseNote;
        this.graduationDesignReleaseId = value.graduationDesignReleaseId;
    }

    public DefenseArrangement(
        String    defenseArrangementId,
        Timestamp paperStartTime,
        Timestamp paperEndTime,
        Timestamp defenseStartTime,
        Timestamp defenseEndTime,
        Integer   intervalTime,
        String    defenseNote,
        String    graduationDesignReleaseId
    ) {
        this.defenseArrangementId = defenseArrangementId;
        this.paperStartTime = paperStartTime;
        this.paperEndTime = paperEndTime;
        this.defenseStartTime = defenseStartTime;
        this.defenseEndTime = defenseEndTime;
        this.intervalTime = intervalTime;
        this.defenseNote = defenseNote;
        this.graduationDesignReleaseId = graduationDesignReleaseId;
    }

    @NotNull
    @Size(max = 64)
    public String getDefenseArrangementId() {
        return this.defenseArrangementId;
    }

    public void setDefenseArrangementId(String defenseArrangementId) {
        this.defenseArrangementId = defenseArrangementId;
    }

    @NotNull
    public Timestamp getPaperStartTime() {
        return this.paperStartTime;
    }

    public void setPaperStartTime(Timestamp paperStartTime) {
        this.paperStartTime = paperStartTime;
    }

    @NotNull
    public Timestamp getPaperEndTime() {
        return this.paperEndTime;
    }

    public void setPaperEndTime(Timestamp paperEndTime) {
        this.paperEndTime = paperEndTime;
    }

    @NotNull
    public Timestamp getDefenseStartTime() {
        return this.defenseStartTime;
    }

    public void setDefenseStartTime(Timestamp defenseStartTime) {
        this.defenseStartTime = defenseStartTime;
    }

    @NotNull
    public Timestamp getDefenseEndTime() {
        return this.defenseEndTime;
    }

    public void setDefenseEndTime(Timestamp defenseEndTime) {
        this.defenseEndTime = defenseEndTime;
    }

    @NotNull
    public Integer getIntervalTime() {
        return this.intervalTime;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    @Size(max = 100)
    public String getDefenseNote() {
        return this.defenseNote;
    }

    public void setDefenseNote(String defenseNote) {
        this.defenseNote = defenseNote;
    }

    @NotNull
    @Size(max = 64)
    public String getGraduationDesignReleaseId() {
        return this.graduationDesignReleaseId;
    }

    public void setGraduationDesignReleaseId(String graduationDesignReleaseId) {
        this.graduationDesignReleaseId = graduationDesignReleaseId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DefenseArrangement (");

        sb.append(defenseArrangementId);
        sb.append(", ").append(paperStartTime);
        sb.append(", ").append(paperEndTime);
        sb.append(", ").append(defenseStartTime);
        sb.append(", ").append(defenseEndTime);
        sb.append(", ").append(intervalTime);
        sb.append(", ").append(defenseNote);
        sb.append(", ").append(graduationDesignReleaseId);

        sb.append(")");
        return sb.toString();
    }
}
