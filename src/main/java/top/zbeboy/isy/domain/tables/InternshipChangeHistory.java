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
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import top.zbeboy.isy.domain.Indexes;
import top.zbeboy.isy.domain.Isy;
import top.zbeboy.isy.domain.Keys;
import top.zbeboy.isy.domain.tables.records.InternshipChangeHistoryRecord;


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
public class InternshipChangeHistory extends TableImpl<InternshipChangeHistoryRecord> {

    private static final long serialVersionUID = 1813209965;

    /**
     * The reference instance of <code>isy.internship_change_history</code>
     */
    public static final InternshipChangeHistory INTERNSHIP_CHANGE_HISTORY = new InternshipChangeHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InternshipChangeHistoryRecord> getRecordType() {
        return InternshipChangeHistoryRecord.class;
    }

    /**
     * The column <code>isy.internship_change_history.internship_change_history_id</code>.
     */
    public final TableField<InternshipChangeHistoryRecord, String> INTERNSHIP_CHANGE_HISTORY_ID = createField("internship_change_history_id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>isy.internship_change_history.reason</code>.
     */
    public final TableField<InternshipChangeHistoryRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>isy.internship_change_history.change_fill_start_time</code>.
     */
    public final TableField<InternshipChangeHistoryRecord, Timestamp> CHANGE_FILL_START_TIME = createField("change_fill_start_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>isy.internship_change_history.change_fill_end_time</code>.
     */
    public final TableField<InternshipChangeHistoryRecord, Timestamp> CHANGE_FILL_END_TIME = createField("change_fill_end_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>isy.internship_change_history.student_id</code>.
     */
    public final TableField<InternshipChangeHistoryRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.internship_change_history.internship_release_id</code>.
     */
    public final TableField<InternshipChangeHistoryRecord, String> INTERNSHIP_RELEASE_ID = createField("internship_release_id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>isy.internship_change_history.apply_time</code>.
     */
    public final TableField<InternshipChangeHistoryRecord, Timestamp> APPLY_TIME = createField("apply_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>isy.internship_change_history.state</code>.
     */
    public final TableField<InternshipChangeHistoryRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>isy.internship_change_history</code> table reference
     */
    public InternshipChangeHistory() {
        this(DSL.name("internship_change_history"), null);
    }

    /**
     * Create an aliased <code>isy.internship_change_history</code> table reference
     */
    public InternshipChangeHistory(String alias) {
        this(DSL.name(alias), INTERNSHIP_CHANGE_HISTORY);
    }

    /**
     * Create an aliased <code>isy.internship_change_history</code> table reference
     */
    public InternshipChangeHistory(Name alias) {
        this(alias, INTERNSHIP_CHANGE_HISTORY);
    }

    private InternshipChangeHistory(Name alias, Table<InternshipChangeHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private InternshipChangeHistory(Name alias, Table<InternshipChangeHistoryRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.INTERNSHIP_CHANGE_HISTORY_INTERNSHIP_RELEASE_ID, Indexes.INTERNSHIP_CHANGE_HISTORY_PRIMARY, Indexes.INTERNSHIP_CHANGE_HISTORY_STUDENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InternshipChangeHistoryRecord> getPrimaryKey() {
        return Keys.KEY_INTERNSHIP_CHANGE_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InternshipChangeHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<InternshipChangeHistoryRecord>>asList(Keys.KEY_INTERNSHIP_CHANGE_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InternshipChangeHistoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InternshipChangeHistoryRecord, ?>>asList(Keys.INTERNSHIP_CHANGE_HISTORY_IBFK_1, Keys.INTERNSHIP_CHANGE_HISTORY_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipChangeHistory as(String alias) {
        return new InternshipChangeHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipChangeHistory as(Name alias) {
        return new InternshipChangeHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InternshipChangeHistory rename(String name) {
        return new InternshipChangeHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InternshipChangeHistory rename(Name name) {
        return new InternshipChangeHistory(name, null);
    }
}
