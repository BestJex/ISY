/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import top.zbeboy.isy.domain.tables.InternshipChangeHistory;
import top.zbeboy.isy.domain.tables.records.InternshipChangeHistoryRecord;


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
public class InternshipChangeHistoryDao extends DAOImpl<InternshipChangeHistoryRecord, top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory, String> {

	/**
	 * Create a new InternshipChangeHistoryDao without any configuration
	 */
	public InternshipChangeHistoryDao() {
		super(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY, top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory.class);
	}

	/**
	 * Create a new InternshipChangeHistoryDao with an attached configuration
	 */
	public InternshipChangeHistoryDao(Configuration configuration) {
		super(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY, top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String getId(top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory object) {
		return object.getInternshipChangeHistoryId();
	}

	/**
	 * Fetch records that have <code>internship_change_history_id IN (values)</code>
	 */
	public List<top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory> fetchByInternshipChangeHistoryId(String... values) {
		return fetch(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.INTERNSHIP_CHANGE_HISTORY_ID, values);
	}

	/**
	 * Fetch a unique record that has <code>internship_change_history_id = value</code>
	 */
	public top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory fetchOneByInternshipChangeHistoryId(String value) {
		return fetchOne(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.INTERNSHIP_CHANGE_HISTORY_ID, value);
	}

	/**
	 * Fetch records that have <code>reason IN (values)</code>
	 */
	public List<top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory> fetchByReason(String... values) {
		return fetch(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.REASON, values);
	}

	/**
	 * Fetch records that have <code>change_fill_start_time IN (values)</code>
	 */
	public List<top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory> fetchByChangeFillStartTime(Timestamp... values) {
		return fetch(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.CHANGE_FILL_START_TIME, values);
	}

	/**
	 * Fetch records that have <code>change_fill_end_time IN (values)</code>
	 */
	public List<top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory> fetchByChangeFillEndTime(Timestamp... values) {
		return fetch(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.CHANGE_FILL_END_TIME, values);
	}

	/**
	 * Fetch records that have <code>student_id IN (values)</code>
	 */
	public List<top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory> fetchByStudentId(Integer... values) {
		return fetch(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.STUDENT_ID, values);
	}

	/**
	 * Fetch records that have <code>internship_release_id IN (values)</code>
	 */
	public List<top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory> fetchByInternshipReleaseId(String... values) {
		return fetch(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.INTERNSHIP_RELEASE_ID, values);
	}

	/**
	 * Fetch records that have <code>apply_time IN (values)</code>
	 */
	public List<top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory> fetchByApplyTime(Timestamp... values) {
		return fetch(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.APPLY_TIME, values);
	}

	/**
	 * Fetch records that have <code>state IN (values)</code>
	 */
	public List<top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory> fetchByState(Integer... values) {
		return fetch(InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY.STATE, values);
	}
}
