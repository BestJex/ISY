/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables;


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
import top.zbeboy.isy.domain.tables.records.InternshipReleaseScienceRecord;


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
public class InternshipReleaseScience extends TableImpl<InternshipReleaseScienceRecord> {

    private static final long serialVersionUID = -142634284;

    /**
     * The reference instance of <code>isy.internship_release_science</code>
     */
    public static final InternshipReleaseScience INTERNSHIP_RELEASE_SCIENCE = new InternshipReleaseScience();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InternshipReleaseScienceRecord> getRecordType() {
        return InternshipReleaseScienceRecord.class;
    }

    /**
     * The column <code>isy.internship_release_science.internship_release_id</code>.
     */
    public final TableField<InternshipReleaseScienceRecord, String> INTERNSHIP_RELEASE_ID = createField("internship_release_id", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.internship_release_science.science_id</code>.
     */
    public final TableField<InternshipReleaseScienceRecord, Integer> SCIENCE_ID = createField("science_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>isy.internship_release_science</code> table reference
     */
    public InternshipReleaseScience() {
        this("internship_release_science", null);
    }

    /**
     * Create an aliased <code>isy.internship_release_science</code> table reference
     */
    public InternshipReleaseScience(String alias) {
        this(alias, INTERNSHIP_RELEASE_SCIENCE);
    }

    private InternshipReleaseScience(String alias, Table<InternshipReleaseScienceRecord> aliased) {
        this(alias, aliased, null);
    }

    private InternshipReleaseScience(String alias, Table<InternshipReleaseScienceRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<InternshipReleaseScienceRecord> getPrimaryKey() {
        return Keys.KEY_INTERNSHIP_RELEASE_SCIENCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InternshipReleaseScienceRecord>> getKeys() {
        return Arrays.<UniqueKey<InternshipReleaseScienceRecord>>asList(Keys.KEY_INTERNSHIP_RELEASE_SCIENCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InternshipReleaseScienceRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InternshipReleaseScienceRecord, ?>>asList(Keys.INTERNSHIP_RELEASE_SCIENCE_IBFK_1, Keys.INTERNSHIP_RELEASE_SCIENCE_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipReleaseScience as(String alias) {
        return new InternshipReleaseScience(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InternshipReleaseScience rename(String name) {
        return new InternshipReleaseScience(name, null);
    }
}
