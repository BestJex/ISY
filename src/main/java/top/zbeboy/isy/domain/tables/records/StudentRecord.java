/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables.records;


import java.sql.Date;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.Student;


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
public class StudentRecord extends UpdatableRecordImpl<StudentRecord> implements Record14<Integer, String, Date, String, String, String, Integer, Integer, String, String, String, String, Integer, String> {

    private static final long serialVersionUID = 2037155548;

    /**
     * Setter for <code>isy.student.student_id</code>.
     */
    public void setStudentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.student.student_id</code>.
     */
    @NotNull
    public Integer getStudentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>isy.student.student_number</code>.
     */
    public void setStudentNumber(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.student.student_number</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getStudentNumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>isy.student.birthday</code>.
     */
    public void setBirthday(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.student.birthday</code>.
     */
    public Date getBirthday() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>isy.student.sex</code>.
     */
    public void setSex(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>isy.student.sex</code>.
     */
    @Size(max = 2)
    public String getSex() {
        return (String) get(3);
    }

    /**
     * Setter for <code>isy.student.id_card</code>.
     */
    public void setIdCard(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>isy.student.id_card</code>.
     */
    @Size(max = 20)
    public String getIdCard() {
        return (String) get(4);
    }

    /**
     * Setter for <code>isy.student.family_residence</code>.
     */
    public void setFamilyResidence(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>isy.student.family_residence</code>.
     */
    @Size(max = 600)
    public String getFamilyResidence() {
        return (String) get(5);
    }

    /**
     * Setter for <code>isy.student.political_landscape_id</code>.
     */
    public void setPoliticalLandscapeId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>isy.student.political_landscape_id</code>.
     */
    public Integer getPoliticalLandscapeId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>isy.student.nation_id</code>.
     */
    public void setNationId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>isy.student.nation_id</code>.
     */
    public Integer getNationId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>isy.student.dormitory_number</code>.
     */
    public void setDormitoryNumber(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>isy.student.dormitory_number</code>.
     */
    @Size(max = 15)
    public String getDormitoryNumber() {
        return (String) get(8);
    }

    /**
     * Setter for <code>isy.student.parent_name</code>.
     */
    public void setParentName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>isy.student.parent_name</code>.
     */
    @Size(max = 10)
    public String getParentName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>isy.student.parent_contact_phone</code>.
     */
    public void setParentContactPhone(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>isy.student.parent_contact_phone</code>.
     */
    @Size(max = 15)
    public String getParentContactPhone() {
        return (String) get(10);
    }

    /**
     * Setter for <code>isy.student.place_origin</code>.
     */
    public void setPlaceOrigin(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>isy.student.place_origin</code>.
     */
    @Size(max = 500)
    public String getPlaceOrigin() {
        return (String) get(11);
    }

    /**
     * Setter for <code>isy.student.organize_id</code>.
     */
    public void setOrganizeId(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>isy.student.organize_id</code>.
     */
    @NotNull
    public Integer getOrganizeId() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>isy.student.username</code>.
     */
    public void setUsername(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>isy.student.username</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getUsername() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, Date, String, String, String, Integer, Integer, String, String, String, String, Integer, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, String, Date, String, String, String, Integer, Integer, String, String, String, String, Integer, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Student.STUDENT.STUDENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Student.STUDENT.STUDENT_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return Student.STUDENT.BIRTHDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Student.STUDENT.SEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Student.STUDENT.ID_CARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Student.STUDENT.FAMILY_RESIDENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Student.STUDENT.POLITICAL_LANDSCAPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Student.STUDENT.NATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Student.STUDENT.DORMITORY_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Student.STUDENT.PARENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Student.STUDENT.PARENT_CONTACT_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Student.STUDENT.PLACE_ORIGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Student.STUDENT.ORGANIZE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Student.STUDENT.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getStudentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getStudentNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getBirthday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIdCard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getFamilyResidence();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getPoliticalLandscapeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getNationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDormitoryNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getParentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getParentContactPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getPlaceOrigin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getOrganizeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value1(Integer value) {
        setStudentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value2(String value) {
        setStudentNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value3(Date value) {
        setBirthday(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value4(String value) {
        setSex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value5(String value) {
        setIdCard(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value6(String value) {
        setFamilyResidence(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value7(Integer value) {
        setPoliticalLandscapeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value8(Integer value) {
        setNationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value9(String value) {
        setDormitoryNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value10(String value) {
        setParentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value11(String value) {
        setParentContactPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value12(String value) {
        setPlaceOrigin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value13(Integer value) {
        setOrganizeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value14(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord values(Integer value1, String value2, Date value3, String value4, String value5, String value6, Integer value7, Integer value8, String value9, String value10, String value11, String value12, Integer value13, String value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(Integer studentId, String studentNumber, Date birthday, String sex, String idCard, String familyResidence, Integer politicalLandscapeId, Integer nationId, String dormitoryNumber, String parentName, String parentContactPhone, String placeOrigin, Integer organizeId, String username) {
        super(Student.STUDENT);

        set(0, studentId);
        set(1, studentNumber);
        set(2, birthday);
        set(3, sex);
        set(4, idCard);
        set(5, familyResidence);
        set(6, politicalLandscapeId);
        set(7, nationId);
        set(8, dormitoryNumber);
        set(9, parentName);
        set(10, parentContactPhone);
        set(11, placeOrigin);
        set(12, organizeId);
        set(13, username);
    }
}
