/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import top.zbeboy.isy.domain.Isy;
import top.zbeboy.isy.domain.Keys;
import top.zbeboy.isy.domain.tables.records.GraduationDesignReleaseRecord;


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
public class GraduationDesignRelease extends TableImpl<GraduationDesignReleaseRecord> {

    private static final long serialVersionUID = -318101012;

    /**
     * The reference instance of <code>isy.graduation_design_release</code>
     */
    public static final GraduationDesignRelease GRADUATION_DESIGN_RELEASE = new GraduationDesignRelease();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GraduationDesignReleaseRecord> getRecordType() {
        return GraduationDesignReleaseRecord.class;
    }

    /**
     * The column <code>isy.graduation_design_release.graduation_design_release_id</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, String> GRADUATION_DESIGN_RELEASE_ID = createField("graduation_design_release_id", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_release.graduation_design_title</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, String> GRADUATION_DESIGN_TITLE = createField("graduation_design_title", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_release.release_time</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, Timestamp> RELEASE_TIME = createField("release_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>isy.graduation_design_release.username</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_release.start_time</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, Timestamp> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_release.end_time</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, Timestamp> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_release.fill_teacher_start_time</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, Timestamp> FILL_TEACHER_START_TIME = createField("fill_teacher_start_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_release.fill_teacher_end_time</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, Timestamp> FILL_TEACHER_END_TIME = createField("fill_teacher_end_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_release.graduation_design_is_del</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, Byte> GRADUATION_DESIGN_IS_DEL = createField("graduation_design_is_del", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_release.allow_grade</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, String> ALLOW_GRADE = createField("allow_grade", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_release.is_ok_teacher</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, Byte> IS_OK_TEACHER = createField("is_ok_teacher", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>isy.graduation_design_release.is_ok_teacher_adjust</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, Byte> IS_OK_TEACHER_ADJUST = createField("is_ok_teacher_adjust", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>isy.graduation_design_release.department_id</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, Integer> DEPARTMENT_ID = createField("department_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_release.science_id</code>.
     */
    public final TableField<GraduationDesignReleaseRecord, Integer> SCIENCE_ID = createField("science_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>isy.graduation_design_release</code> table reference
     */
    public GraduationDesignRelease() {
        this("graduation_design_release", null);
    }

    /**
     * Create an aliased <code>isy.graduation_design_release</code> table reference
     */
    public GraduationDesignRelease(String alias) {
        this(alias, GRADUATION_DESIGN_RELEASE);
    }

    private GraduationDesignRelease(String alias, Table<GraduationDesignReleaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private GraduationDesignRelease(String alias, Table<GraduationDesignReleaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Isy.ISY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GraduationDesignReleaseRecord> getPrimaryKey() {
        return Keys.KEY_GRADUATION_DESIGN_RELEASE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GraduationDesignReleaseRecord>> getKeys() {
        return Arrays.<UniqueKey<GraduationDesignReleaseRecord>>asList(Keys.KEY_GRADUATION_DESIGN_RELEASE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GraduationDesignReleaseRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GraduationDesignReleaseRecord, ?>>asList(Keys.GRADUATION_DESIGN_RELEASE_IBFK_1, Keys.GRADUATION_DESIGN_RELEASE_IBFK_2, Keys.GRADUATION_DESIGN_RELEASE_IBFK_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignRelease as(String alias) {
        return new GraduationDesignRelease(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GraduationDesignRelease rename(String name) {
        return new GraduationDesignRelease(name, null);
    }
}
