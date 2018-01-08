/*
 * This file is generated by jOOQ.
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
import top.zbeboy.isy.domain.tables.records.GraduationPracticeCollegeRecord;


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
public class GraduationPracticeCollege extends TableImpl<GraduationPracticeCollegeRecord> {

    private static final long serialVersionUID = 453556422;

    /**
     * The reference instance of <code>isy.graduation_practice_college</code>
     */
    public static final GraduationPracticeCollege GRADUATION_PRACTICE_COLLEGE = new GraduationPracticeCollege();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GraduationPracticeCollegeRecord> getRecordType() {
        return GraduationPracticeCollegeRecord.class;
    }

    /**
     * The column <code>isy.graduation_practice_college.graduation_practice_college_id</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> GRADUATION_PRACTICE_COLLEGE_ID = createField("graduation_practice_college_id", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.student_name</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> STUDENT_NAME = createField("student_name", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.college_class</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> COLLEGE_CLASS = createField("college_class", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.student_sex</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> STUDENT_SEX = createField("student_sex", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.student_number</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> STUDENT_NUMBER = createField("student_number", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.phone_number</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> PHONE_NUMBER = createField("phone_number", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.qq_mailbox</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> QQ_MAILBOX = createField("qq_mailbox", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.parental_contact</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> PARENTAL_CONTACT = createField("parental_contact", org.jooq.impl.SQLDataType.VARCHAR.length(48).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.headmaster</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> HEADMASTER = createField("headmaster", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.headmaster_contact</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> HEADMASTER_CONTACT = createField("headmaster_contact", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.graduation_practice_college_name</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> GRADUATION_PRACTICE_COLLEGE_NAME = createField("graduation_practice_college_name", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.graduation_practice_college_address</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> GRADUATION_PRACTICE_COLLEGE_ADDRESS = createField("graduation_practice_college_address", org.jooq.impl.SQLDataType.VARCHAR.length(500).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.graduation_practice_college_contacts</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> GRADUATION_PRACTICE_COLLEGE_CONTACTS = createField("graduation_practice_college_contacts", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.graduation_practice_college_tel</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> GRADUATION_PRACTICE_COLLEGE_TEL = createField("graduation_practice_college_tel", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.school_guidance_teacher</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> SCHOOL_GUIDANCE_TEACHER = createField("school_guidance_teacher", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.school_guidance_teacher_tel</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> SCHOOL_GUIDANCE_TEACHER_TEL = createField("school_guidance_teacher_tel", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.start_time</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, Date> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.end_time</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, Date> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.commitment_book</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, Byte> COMMITMENT_BOOK = createField("commitment_book", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.graduation_practice_college.safety_responsibility_book</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, Byte> SAFETY_RESPONSIBILITY_BOOK = createField("safety_responsibility_book", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.graduation_practice_college.practice_agreement</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, Byte> PRACTICE_AGREEMENT = createField("practice_agreement", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.graduation_practice_college.internship_application</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, Byte> INTERNSHIP_APPLICATION = createField("internship_application", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.graduation_practice_college.practice_receiving</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, Byte> PRACTICE_RECEIVING = createField("practice_receiving", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.graduation_practice_college.security_education_agreement</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, Byte> SECURITY_EDUCATION_AGREEMENT = createField("security_education_agreement", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.graduation_practice_college.parental_consent</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, Byte> PARENTAL_CONSENT = createField("parental_consent", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>isy.graduation_practice_college.student_id</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, Integer> STUDENT_ID = createField("student_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.student_username</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> STUDENT_USERNAME = createField("student_username", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * The column <code>isy.graduation_practice_college.internship_release_id</code>.
     */
    public final TableField<GraduationPracticeCollegeRecord, String> INTERNSHIP_RELEASE_ID = createField("internship_release_id", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

    /**
     * Create a <code>isy.graduation_practice_college</code> table reference
     */
    public GraduationPracticeCollege() {
        this("graduation_practice_college", null);
    }

    /**
     * Create an aliased <code>isy.graduation_practice_college</code> table reference
     */
    public GraduationPracticeCollege(String alias) {
        this(alias, GRADUATION_PRACTICE_COLLEGE);
    }

    private GraduationPracticeCollege(String alias, Table<GraduationPracticeCollegeRecord> aliased) {
        this(alias, aliased, null);
    }

    private GraduationPracticeCollege(String alias, Table<GraduationPracticeCollegeRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<GraduationPracticeCollegeRecord> getPrimaryKey() {
        return Keys.KEY_GRADUATION_PRACTICE_COLLEGE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GraduationPracticeCollegeRecord>> getKeys() {
        return Arrays.<UniqueKey<GraduationPracticeCollegeRecord>>asList(Keys.KEY_GRADUATION_PRACTICE_COLLEGE_PRIMARY, Keys.KEY_GRADUATION_PRACTICE_COLLEGE_STUDENT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<GraduationPracticeCollegeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<GraduationPracticeCollegeRecord, ?>>asList(Keys.GRADUATION_PRACTICE_COLLEGE_IBFK_1, Keys.GRADUATION_PRACTICE_COLLEGE_IBFK_2, Keys.GRADUATION_PRACTICE_COLLEGE_IBFK_3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GraduationPracticeCollege as(String alias) {
        return new GraduationPracticeCollege(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public GraduationPracticeCollege rename(String name) {
        return new GraduationPracticeCollege(name, null);
    }
}
