/**
 * This class is generated by jOOQ
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
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InternshipFile implements Serializable {

	private static final long serialVersionUID = -1072455197;

	private String internshipReleaseId;
	private String fileId;

	public InternshipFile() {}

	public InternshipFile(InternshipFile value) {
		this.internshipReleaseId = value.internshipReleaseId;
		this.fileId = value.fileId;
	}

	public InternshipFile(
		String internshipReleaseId,
		String fileId
	) {
		this.internshipReleaseId = internshipReleaseId;
		this.fileId = fileId;
	}

	@NotNull
	@Size(max = 100)
	public String getInternshipReleaseId() {
		return this.internshipReleaseId;
	}

	public void setInternshipReleaseId(String internshipReleaseId) {
		this.internshipReleaseId = internshipReleaseId;
	}

	@NotNull
	@Size(max = 100)
	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("InternshipFile (");

		sb.append(internshipReleaseId);
		sb.append(", ").append(fileId);

		sb.append(")");
		return sb.toString();
	}
}
