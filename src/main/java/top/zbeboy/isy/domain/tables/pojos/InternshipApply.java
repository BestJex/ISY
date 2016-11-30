/**
 * This class is generated by jOOQ
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
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InternshipApply implements Serializable {

	private static final long serialVersionUID = 1241321873;

	private String    internshipApplyId;
	private Integer   studentId;
	private String    internshipReleaseId;
	private Integer   internshipApplyState;
	private String    reason;
	private Timestamp changeFillStartTime;
	private Timestamp changeFillEndTime;
	private Timestamp applyTime;

	public InternshipApply() {}

	public InternshipApply(InternshipApply value) {
		this.internshipApplyId = value.internshipApplyId;
		this.studentId = value.studentId;
		this.internshipReleaseId = value.internshipReleaseId;
		this.internshipApplyState = value.internshipApplyState;
		this.reason = value.reason;
		this.changeFillStartTime = value.changeFillStartTime;
		this.changeFillEndTime = value.changeFillEndTime;
		this.applyTime = value.applyTime;
	}

	public InternshipApply(
		String    internshipApplyId,
		Integer   studentId,
		String    internshipReleaseId,
		Integer   internshipApplyState,
		String    reason,
		Timestamp changeFillStartTime,
		Timestamp changeFillEndTime,
		Timestamp applyTime
	) {
		this.internshipApplyId = internshipApplyId;
		this.studentId = studentId;
		this.internshipReleaseId = internshipReleaseId;
		this.internshipApplyState = internshipApplyState;
		this.reason = reason;
		this.changeFillStartTime = changeFillStartTime;
		this.changeFillEndTime = changeFillEndTime;
		this.applyTime = applyTime;
	}

	@NotNull
	@Size(max = 100)
	public String getInternshipApplyId() {
		return this.internshipApplyId;
	}

	public void setInternshipApplyId(String internshipApplyId) {
		this.internshipApplyId = internshipApplyId;
	}

	@NotNull
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@NotNull
	@Size(max = 100)
	public String getInternshipReleaseId() {
		return this.internshipReleaseId;
	}

	public void setInternshipReleaseId(String internshipReleaseId) {
		this.internshipReleaseId = internshipReleaseId;
	}

	public Integer getInternshipApplyState() {
		return this.internshipApplyState;
	}

	public void setInternshipApplyState(Integer internshipApplyState) {
		this.internshipApplyState = internshipApplyState;
	}

	@Size(max = 500)
	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Timestamp getChangeFillStartTime() {
		return this.changeFillStartTime;
	}

	public void setChangeFillStartTime(Timestamp changeFillStartTime) {
		this.changeFillStartTime = changeFillStartTime;
	}

	public Timestamp getChangeFillEndTime() {
		return this.changeFillEndTime;
	}

	public void setChangeFillEndTime(Timestamp changeFillEndTime) {
		this.changeFillEndTime = changeFillEndTime;
	}

	@NotNull
	public Timestamp getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(Timestamp applyTime) {
		this.applyTime = applyTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("InternshipApply (");

		sb.append(internshipApplyId);
		sb.append(", ").append(studentId);
		sb.append(", ").append(internshipReleaseId);
		sb.append(", ").append(internshipApplyState);
		sb.append(", ").append(reason);
		sb.append(", ").append(changeFillStartTime);
		sb.append(", ").append(changeFillEndTime);
		sb.append(", ").append(applyTime);

		sb.append(")");
		return sb.toString();
	}
}
