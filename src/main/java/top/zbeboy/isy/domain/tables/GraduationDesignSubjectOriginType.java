/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import top.zbeboy.isy.domain.Isy;
import top.zbeboy.isy.domain.Keys;
import top.zbeboy.isy.domain.tables.records.GraduationDesignSubjectOriginTypeRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GraduationDesignSubjectOriginType extends TableImpl<GraduationDesignSubjectOriginTypeRecord> {

    private static final long serialVersionUID = -1071788320;

    /**
     * The reference instance of <code>isy.graduation_design_subject_origin_type</code>
     */
    public static final GraduationDesignSubjectOriginType GRADUATION_DESIGN_SUBJECT_ORIGIN_TYPE = new GraduationDesignSubjectOriginType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GraduationDesignSubjectOriginTypeRecord> getRecordType() {
        return GraduationDesignSubjectOriginTypeRecord.class;
    }

    /**
     * The column <code>isy.graduation_design_subject_origin_type.origin_type_id</code>.
     */
    public final TableField<GraduationDesignSubjectOriginTypeRecord, Integer> ORIGIN_TYPE_ID = createField("origin_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.graduation_design_subject_origin_type.origin_type_name</code>.
     */
    public final TableField<GraduationDesignSubjectOriginTypeRecord, String> ORIGIN_TYPE_NAME = createField("origin_type_name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

    /**
     * Create a <code>isy.graduation_design_subject_origin_type</code> table reference
     */
    public GraduationDesignSubjectOriginType() {
        this("graduation_design_subject_origin_type", null);
    }

    /**
     * Create an aliased <code>isy.graduation_design_subject_origin_type</code> table reference
     */
    public GraduationDesignSubjectOriginType(String alias) {
        this(alias, GRADUATION_DESIGN_SUBJECT_ORIGIN_TYPE);
    }

    private GraduationDesignSubjectOriginType(String alias, Table<GraduationDesignSubjectOriginTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private GraduationDesignSubjectOriginType(String alias, Table<GraduationDesignSubjectOriginTypeRecord> aliased, Field<?>[] parameters) {
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
    public Identity<GraduationDesignSubjectOriginTypeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GRADUATION_DESIGN_SUBJECT_ORIGIN_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GraduationDesignSubjectOriginTypeRecord> getPrimaryKey() {
        return Keys.KEY_GRADUATION_DESIGN_SUBJECT_ORIGIN_TYPE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GraduationDesignSubjectOriginTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<GraduationDesignSubjectOriginTypeRecord>>asList(Keys.KEY_GRADUATION_DESIGN_SUBJECT_ORIGIN_TYPE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationDesignSubjectOriginType as(String alias) {
        return new GraduationDesignSubjectOriginType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GraduationDesignSubjectOriginType rename(String name) {
        return new GraduationDesignSubjectOriginType(name, null);
    }
}
