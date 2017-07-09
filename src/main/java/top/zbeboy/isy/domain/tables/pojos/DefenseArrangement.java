/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

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
public class DefenseArrangement implements Serializable {

    private static final long serialVersionUID = 89217220;

    private String  defenseArrangementId;
    private Date    paperStartDate;
    private Date    paperEndDate;
    private Date    defenseStartDate;
    private Date    defenseEndDate;
    private Integer intervalTime;
    private String  defenseNote;
    private String  graduationDesignReleaseId;

    public DefenseArrangement() {}

    public DefenseArrangement(DefenseArrangement value) {
        this.defenseArrangementId = value.defenseArrangementId;
        this.paperStartDate = value.paperStartDate;
        this.paperEndDate = value.paperEndDate;
        this.defenseStartDate = value.defenseStartDate;
        this.defenseEndDate = value.defenseEndDate;
        this.intervalTime = value.intervalTime;
        this.defenseNote = value.defenseNote;
        this.graduationDesignReleaseId = value.graduationDesignReleaseId;
    }

    public DefenseArrangement(
        String  defenseArrangementId,
        Date    paperStartDate,
        Date    paperEndDate,
        Date    defenseStartDate,
        Date    defenseEndDate,
        Integer intervalTime,
        String  defenseNote,
        String  graduationDesignReleaseId
    ) {
        this.defenseArrangementId = defenseArrangementId;
        this.paperStartDate = paperStartDate;
        this.paperEndDate = paperEndDate;
        this.defenseStartDate = defenseStartDate;
        this.defenseEndDate = defenseEndDate;
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
    public Date getPaperStartDate() {
        return this.paperStartDate;
    }

    public void setPaperStartDate(Date paperStartDate) {
        this.paperStartDate = paperStartDate;
    }

    @NotNull
    public Date getPaperEndDate() {
        return this.paperEndDate;
    }

    public void setPaperEndDate(Date paperEndDate) {
        this.paperEndDate = paperEndDate;
    }

    @NotNull
    public Date getDefenseStartDate() {
        return this.defenseStartDate;
    }

    public void setDefenseStartDate(Date defenseStartDate) {
        this.defenseStartDate = defenseStartDate;
    }

    @NotNull
    public Date getDefenseEndDate() {
        return this.defenseEndDate;
    }

    public void setDefenseEndDate(Date defenseEndDate) {
        this.defenseEndDate = defenseEndDate;
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
        sb.append(", ").append(paperStartDate);
        sb.append(", ").append(paperEndDate);
        sb.append(", ").append(defenseStartDate);
        sb.append(", ").append(defenseEndDate);
        sb.append(", ").append(intervalTime);
        sb.append(", ").append(defenseNote);
        sb.append(", ").append(graduationDesignReleaseId);

        sb.append(")");
        return sb.toString();
    }
}
