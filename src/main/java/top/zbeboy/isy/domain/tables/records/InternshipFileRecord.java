/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;

import top.zbeboy.isy.domain.tables.InternshipFile;


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
public class InternshipFileRecord extends TableRecordImpl<InternshipFileRecord> implements Record2<String, String> {

	private static final long serialVersionUID = 269938926;

	/**
	 * Setter for <code>isy.internship_file.internship_release_id</code>.
	 */
	public void setInternshipReleaseId(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>isy.internship_file.internship_release_id</code>.
	 */
	@NotNull
	@Size(max = 100)
	public String getInternshipReleaseId() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>isy.internship_file.file_id</code>.
	 */
	public void setFileId(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>isy.internship_file.file_id</code>.
	 */
	@NotNull
	@Size(max = 100)
	public String getFileId() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return InternshipFile.INTERNSHIP_FILE.INTERNSHIP_RELEASE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return InternshipFile.INTERNSHIP_FILE.FILE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getInternshipReleaseId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getFileId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternshipFileRecord value1(String value) {
		setInternshipReleaseId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternshipFileRecord value2(String value) {
		setFileId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternshipFileRecord values(String value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InternshipFileRecord
	 */
	public InternshipFileRecord() {
		super(InternshipFile.INTERNSHIP_FILE);
	}

	/**
	 * Create a detached, initialised InternshipFileRecord
	 */
	public InternshipFileRecord(String internshipReleaseId, String fileId) {
		super(InternshipFile.INTERNSHIP_FILE);

		setValue(0, internshipReleaseId);
		setValue(1, fileId);
	}
}
