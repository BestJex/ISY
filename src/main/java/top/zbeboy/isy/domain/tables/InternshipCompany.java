/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables;


import java.sql.Date;
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
import top.zbeboy.isy.domain.tables.records.InternshipCompanyRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InternshipCompany extends TableImpl<InternshipCompanyRecord> {

    private static final long serialVersionUID = 1008109108;

    /**
     * The reference instance of <code>isy.internship_company</code>
     */
    public static final InternshipCompany INTERNSHIP_COMPANY = new InternshipCompany();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InternshipCompanyRecord> getRecordType() {
        return InternshipCompanyRecord.class;
    }

    /**
     * The column <code>isy.internship_company.internship_company_id</code>.
     */
    public final TableField<InternshipCompanyRecord, String> INTERNSHIP_COMPANY_ID = createField("internship_company_id", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.student_name</code>.
     */
    public final TableField<InternshipCompanyRecord, String> STUDENT_NAME = createField("student_name", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.college_class</code>.
     */
    public final TableField<InternshipCompanyRecord, String> COLLEGE_CLASS = createField("college_class", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.student_sex</code>.
     */
    public final TableField<InternshipCompanyRecord, String> STUDENT_SEX = createField("student_sex", org.jooq.impl.SQLDataType.VARCHAR.length(2).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.student_number</code>.
     */
    public final TableField<InternshipCompanyRecord, String> STUDENT_NUMBER = createField("student_number", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.phone_number</code>.
     */
    public final TableField<InternshipCompanyRecord, String> PHONE_NUMBER = createField("phone_number", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.qq_mailbox</code>.
     */
    public final TableField<InternshipCompanyRecord, String> QQ_MAILBOX = createField("qq_mailbox", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.parental_contact</code>.
     */
    public final TableField<InternshipCompanyRecord, String> PARENTAL_CONTACT = createField("parental_contact", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.headmaster</code>.
     */
    public final TableField<InternshipCompanyRecord, String> HEADMASTER = createField("headmaster", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.headmaster_contact</code>.
     */
    public final TableField<InternshipCompanyRecord, String> HEADMASTER_CONTACT = createField("headmaster_contact", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.internship_company_name</code>.
     */
    public final TableField<InternshipCompanyRecord, String> INTERNSHIP_COMPANY_NAME = createField("internship_company_name", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.internship_company_address</code>.
     */
    public final TableField<InternshipCompanyRecord, String> INTERNSHIP_COMPANY_ADDRESS = createField("internship_company_address", org.jooq.impl.SQLDataType.VARCHAR.length(500).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.internship_company_contacts</code>.
     */
    public final TableField<InternshipCompanyRecord, String> INTERNSHIP_COMPANY_CONTACTS = createField("internship_company_contacts", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.internship_company_tel</code>.
     */
    public final TableField<InternshipCompanyRecord, String> INTERNSHIP_COMPANY_TEL = createField("internship_company_tel", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.school_guidance_teacher</code>.
     */
    public final TableField<InternshipCompanyRecord, String> SCHOOL_GUIDANCE_TEACHER = createField("school_guidance_teacher", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.school_guidance_teacher_tel</code>.
     */
    public final TableField<InternshipCompanyRecord, String> SCHOOL_GUIDANCE_TEACHER_TEL = createField("school_guidance_teacher_tel", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.start_time</code>.
     */
    public final TableField<InternshipCompanyRecord, Date> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.end_time</code>.
     */
    public final TableField<InternshipCompanyRecord, Date> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.commitment_book</code>.
     */
    public final TableField<InternshipCompanyRecord, Byte> COMMITMENT_BOOK = createField("commitment_book", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.internship_company.safety_responsibility_book</code>.
     */
    public final TableField<InternshipCompanyRecord, Byte> SAFETY_RESPONSIBILITY_BOOK = createField("safety_responsibility_book", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.internship_company.practice_agreement</code>.
     */
    public final TableField<InternshipCompanyRecord, Byte> PRACTICE_AGREEMENT = createField("practice_agreement", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.internship_company.internship_application</code>.
     */
    public final TableField<InternshipCompanyRecord, Byte> INTERNSHIP_APPLICATION = createField("internship_application", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.internship_company.practice_receiving</code>.
     */
    public final TableField<InternshipCompanyRecord, Byte> PRACTICE_RECEIVING = createField("practice_receiving", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.internship_company.security_education_agreement</code>.
     */
    public final TableField<InternshipCompanyRecord, Byte> SECURITY_EDUCATION_AGREEMENT = createField("security_education_agreement", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.internship_company.parental_consent</code>.
     */
    public final TableField<InternshipCompanyRecord, Byte> PARENTAL_CONSENT = createField("parental_consent", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.internship_company.student_id</code>.
     */
    public final TableField<InternshipCompanyRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.internship_company.internship_release_id</code>.
     */
    public final TableField<InternshipCompanyRecord, String> INTERNSHIP_RELEASE_ID = createField("internship_release_id", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * Create a <code>isy.internship_company</code> table reference
     */
    public InternshipCompany() {
        this("internship_company", null);
    }

    /**
     * Create an aliased <code>isy.internship_company</code> table reference
     */
    public InternshipCompany(String alias) {
        this(alias, INTERNSHIP_COMPANY);
    }

    private InternshipCompany(String alias, Table<InternshipCompanyRecord> aliased) {
        this(alias, aliased, null);
    }

    private InternshipCompany(String alias, Table<InternshipCompanyRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<InternshipCompanyRecord> getPrimaryKey() {
        return Keys.KEY_INTERNSHIP_COMPANY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<InternshipCompanyRecord>> getKeys() {
        return Arrays.<UniqueKey<InternshipCompanyRecord>>asList(Keys.KEY_INTERNSHIP_COMPANY_PRIMARY, Keys.KEY_INTERNSHIP_COMPANY_STUDENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<InternshipCompanyRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<InternshipCompanyRecord, ?>>asList(Keys.INTERNSHIP_COMPANY_IBFK_1, Keys.INTERNSHIP_COMPANY_IBFK_2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InternshipCompany as(String alias) {
        return new InternshipCompany(alias, this);
    }

    /**
     * Rename this table
     */
    public InternshipCompany rename(String name) {
        return new InternshipCompany(name, null);
    }
}
