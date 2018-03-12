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
import top.zbeboy.isy.domain.tables.records.InternshipChangeCompanyHistoryRecord;


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
public class InternshipChangeCompanyHistory extends TableImpl<InternshipChangeCompanyHistoryRecord> {

    private static final long serialVersionUID = 2086090286;

    /**
     * The reference instance of <code>isy.internship_change_company_history</code>
     */
    public static final InternshipChangeCompanyHistory INTERNSHIP_CHANGE_COMPANY_HISTORY = new InternshipChangeCompanyHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InternshipChangeCompanyHistoryRecord> getRecordType() {
        return InternshipChangeCompanyHistoryRecord.class;
    }

    /**
     * The column <code>isy.internship_change_company_history.internship_change_company_history_id</code>.
     */
    public final TableField<InternshipChangeCompanyHistoryRecord, String> INTERNSHIP_CHANGE_COMPANY_HISTORY_ID = createField("internship_change_company_history_id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>isy.internship_change_company_history.student_id</code>.
     */
    public final TableField<InternshipChangeCompanyHistoryRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.internship_change_company_history.internship_release_id</code>.
     */
    public final TableField<InternshipChangeCompanyHistoryRecord, String> INTERNSHIP_RELEASE_ID = createField("internship_release_id", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>isy.internship_change_company_history.company_name</code>.
     */
    public final TableField<InternshipChangeCompanyHistoryRecord, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>isy.internship_change_company_history.company_address</code>.
     */
    public final TableField<InternshipChangeCompanyHistoryRecord, String> COMPANY_ADDRESS = createField("company_address", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>isy.internship_change_company_history.company_contacts</code>.
     */
    public final TableField<InternshipChangeCompanyHistoryRecord, String> COMPANY_CONTACTS = createField("company_contacts", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>isy.internship_change_company_history.company_tel</code>.
     */
    public final TableField<InternshipChangeCompanyHistoryRecord, String> COMPANY_TEL = createField("company_tel", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>isy.internship_change_company_history.change_time</code>.
     */
    public final TableField<InternshipChangeCompanyHistoryRecord, Timestamp> CHANGE_TIME = createField("change_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>isy.internship_change_company_history</code> table reference
     */
    public InternshipChangeCompanyHistory() {
        this(DSL.name("internship_change_company_history"), null);
    }

    /**
     * Create an aliased <code>isy.internship_change_company_history</code> table reference
     */
    public InternshipChangeCompanyHistory(String alias) {
        this(DSL.name(alias), INTERNSHIP_CHANGE_COMPANY_HISTORY);
    }

    /**
     * Create an aliased <code>isy.internship_change_company_history</code> table reference
     */
    public InternshipChangeCompanyHistory(Name alias) {
        this(alias, INTERNSHIP_CHANGE_COMPANY_HISTORY);
    }

    private InternshipChangeCompanyHistory(Name alias, Table<InternshipChangeCompanyHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private InternshipChangeCompanyHistory(Name alias, Table<InternshipChangeCompanyHistoryRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.INTERNSHIP_CHANGE_COMPANY_HISTORY_INTERNSHIP_RELEASE_ID, Indexes.INTERNSHIP_CHANGE_COMPANY_HISTORY_PRIMARY, Indexes.INTERNSHIP_CHANGE_COMPANY_HISTORY_STUDENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<InternshipChangeCompanyHistoryRecord> getPrimaryKey() {
        return Keys.KEY_INTERNSHIP_CHANGE_COMPANY_HISTORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InternshipChangeCompanyHistoryRecord>> getKeys() {
        return Arrays.<UniqueKey<InternshipChangeCompanyHistoryRecord>>asList(Keys.KEY_INTERNSHIP_CHANGE_COMPANY_HISTORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InternshipChangeCompanyHistoryRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InternshipChangeCompanyHistoryRecord, ?>>asList(Keys.INTERNSHIP_CHANGE_COMPANY_HISTORY_IBFK_1, Keys.INTERNSHIP_CHANGE_COMPANY_HISTORY_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipChangeCompanyHistory as(String alias) {
        return new InternshipChangeCompanyHistory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipChangeCompanyHistory as(Name alias) {
        return new InternshipChangeCompanyHistory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InternshipChangeCompanyHistory rename(String name) {
        return new InternshipChangeCompanyHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InternshipChangeCompanyHistory rename(Name name) {
        return new InternshipChangeCompanyHistory(name, null);
    }
}
