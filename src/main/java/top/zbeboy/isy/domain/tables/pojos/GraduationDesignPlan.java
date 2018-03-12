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
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GraduationDesignPlan implements Serializable {

    private static final long serialVersionUID = 151846815;

    private String    graduationDesignPlanId;
    private String    scheduling;
    private String    supervisionTime;
    private String    guideContent;
    private String    note;
    private Timestamp addTime;
    private String    graduationDesignTeacherId;
    private Integer   schoolroomId;

    public GraduationDesignPlan() {}

    public GraduationDesignPlan(GraduationDesignPlan value) {
        this.graduationDesignPlanId = value.graduationDesignPlanId;
        this.scheduling = value.scheduling;
        this.supervisionTime = value.supervisionTime;
        this.guideContent = value.guideContent;
        this.note = value.note;
        this.addTime = value.addTime;
        this.graduationDesignTeacherId = value.graduationDesignTeacherId;
        this.schoolroomId = value.schoolroomId;
    }

    public GraduationDesignPlan(
        String    graduationDesignPlanId,
        String    scheduling,
        String    supervisionTime,
        String    guideContent,
        String    note,
        Timestamp addTime,
        String    graduationDesignTeacherId,
        Integer   schoolroomId
    ) {
        this.graduationDesignPlanId = graduationDesignPlanId;
        this.scheduling = scheduling;
        this.supervisionTime = supervisionTime;
        this.guideContent = guideContent;
        this.note = note;
        this.addTime = addTime;
        this.graduationDesignTeacherId = graduationDesignTeacherId;
        this.schoolroomId = schoolroomId;
    }

    @NotNull
    @Size(max = 64)
    public String getGraduationDesignPlanId() {
        return this.graduationDesignPlanId;
    }

    public void setGraduationDesignPlanId(String graduationDesignPlanId) {
        this.graduationDesignPlanId = graduationDesignPlanId;
    }

    @NotNull
    @Size(max = 100)
    public String getScheduling() {
        return this.scheduling;
    }

    public void setScheduling(String scheduling) {
        this.scheduling = scheduling;
    }

    @NotNull
    @Size(max = 100)
    public String getSupervisionTime() {
        return this.supervisionTime;
    }

    public void setSupervisionTime(String supervisionTime) {
        this.supervisionTime = supervisionTime;
    }

    @NotNull
    @Size(max = 150)
    public String getGuideContent() {
        return this.guideContent;
    }

    public void setGuideContent(String guideContent) {
        this.guideContent = guideContent;
    }

    @Size(max = 100)
    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @NotNull
    public Timestamp getAddTime() {
        return this.addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
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
    public Integer getSchoolroomId() {
        return this.schoolroomId;
    }

    public void setSchoolroomId(Integer schoolroomId) {
        this.schoolroomId = schoolroomId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GraduationDesignPlan (");

        sb.append(graduationDesignPlanId);
        sb.append(", ").append(scheduling);
        sb.append(", ").append(supervisionTime);
        sb.append(", ").append(guideContent);
        sb.append(", ").append(note);
        sb.append(", ").append(addTime);
        sb.append(", ").append(graduationDesignTeacherId);
        sb.append(", ").append(schoolroomId);

        sb.append(")");
        return sb.toString();
    }
}
