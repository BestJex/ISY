/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.InternshipChangeHistory;


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
public class InternshipChangeHistoryRecord extends UpdatableRecordImpl<InternshipChangeHistoryRecord> implements Record6<String, String, Integer, Integer, String, Timestamp> {

	private static final long serialVersionUID = 1777226903;

	/**
	 * Setter for <code>isy.internship_change_history.internship_change_history_id</code>.
	 */
	public void setInternshipChangeHistoryId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>isy.internship_change_history.internship_change_history_id</code>.
	 */
	@NotNull
	@Size(max = 100)
	public String getInternshipChangeHistoryId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>isy.internship_change_history.reason</code>.
	 */
	public void setReason(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>isy.internship_change_history.reason</code>.
	 */
	@NotNull
	@Size(max = 500)
	public String getReason() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>isy.internship_change_history.change_type</code>.
	 */
	public void setChangeType(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>isy.internship_change_history.change_type</code>.
	 */
	@NotNull
	public Integer getChangeType() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>isy.internship_change_history.student_id</code>.
	 */
	public void setStudentId(Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>isy.internship_change_history.student_id</code>.
	 */
	@NotNull
	public Integer getStudentId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>isy.internship_change_history.internship_release_id</code>.
	 */
	public void setInternshipReleaseId(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>isy.internship_change_history.internship_release_id</code>.
	 */
	@NotNull
	@Size(max = 100)
	public String getInternshipReleaseId() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>isy.internship_change_history.apply_time</code>.
	 */
	public void setApplyTime(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>isy.internship_change_history.apply_time</code>.
	 */
	@NotNull
	public Timestamp getApplyTime() {
		return (Timestamp) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, Integer, Integer, String, Timestamp> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<String, String, Integer, Integer, String, Timestamp> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.INTERNSHIP_CHANGE_HISTORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.REASON;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.CHANGE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.STUDENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.INTERNSHIP_RELEASE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.APPLY_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getInternshipChangeHistoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getReason();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getChangeType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getStudentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getInternshipReleaseId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getApplyTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternshipChangeHistoryRecord value1(String value) {
		setInternshipChangeHistoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternshipChangeHistoryRecord value2(String value) {
		setReason(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternshipChangeHistoryRecord value3(Integer value) {
		setChangeType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternshipChangeHistoryRecord value4(Integer value) {
		setStudentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternshipChangeHistoryRecord value5(String value) {
		setInternshipReleaseId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternshipChangeHistoryRecord value6(Timestamp value) {
		setApplyTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternshipChangeHistoryRecord values(String value1, String value2, Integer value3, Integer value4, String value5, Timestamp value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InternshipChangeHistoryRecord
	 */
	public InternshipChangeHistoryRecord() {
		super(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY);
	}

	/**
	 * Create a detached, initialised InternshipChangeHistoryRecord
	 */
	public InternshipChangeHistoryRecord(String internshipChangeHistoryId, String reason, Integer changeType, Integer studentId, String internshipReleaseId, Timestamp applyTime) {
		super(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY);

		setValue(0, internshipChangeHistoryId);
		setValue(1, reason);
		setValue(2, changeType);
		setValue(3, studentId);
		setValue(4, internshipReleaseId);
		setValue(5, applyTime);
	}
}
