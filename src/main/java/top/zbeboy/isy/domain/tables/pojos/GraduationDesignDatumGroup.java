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
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GraduationDesignDatumGroup implements Serializable {

    private static final long serialVersionUID = 615496746;

    private String    graduationDesignDatumGroupId;
    private String    fileId;
    private String    graduationDesignTeacherId;
    private Timestamp uploadTime;

    public GraduationDesignDatumGroup() {}

    public GraduationDesignDatumGroup(GraduationDesignDatumGroup value) {
        this.graduationDesignDatumGroupId = value.graduationDesignDatumGroupId;
        this.fileId = value.fileId;
        this.graduationDesignTeacherId = value.graduationDesignTeacherId;
        this.uploadTime = value.uploadTime;
    }

    public GraduationDesignDatumGroup(
        String    graduationDesignDatumGroupId,
        String    fileId,
        String    graduationDesignTeacherId,
        Timestamp uploadTime
    ) {
        this.graduationDesignDatumGroupId = graduationDesignDatumGroupId;
        this.fileId = fileId;
        this.graduationDesignTeacherId = graduationDesignTeacherId;
        this.uploadTime = uploadTime;
    }

    @NotNull
    @Size(max = 64)
    public String getGraduationDesignDatumGroupId() {
        return this.graduationDesignDatumGroupId;
    }

    public void setGraduationDesignDatumGroupId(String graduationDesignDatumGroupId) {
        this.graduationDesignDatumGroupId = graduationDesignDatumGroupId;
    }

    @NotNull
    @Size(max = 64)
    public String getFileId() {
        return this.fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
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
    public Timestamp getUploadTime() {
        return this.uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("GraduationDesignDatumGroup (");

        sb.append(graduationDesignDatumGroupId);
        sb.append(", ").append(fileId);
        sb.append(", ").append(graduationDesignTeacherId);
        sb.append(", ").append(uploadTime);

        sb.append(")");
        return sb.toString();
    }
}
