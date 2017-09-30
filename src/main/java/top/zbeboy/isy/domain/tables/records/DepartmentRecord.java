/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.Department;


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
public class DepartmentRecord extends UpdatableRecordImpl<DepartmentRecord> implements Record4<Integer, String, Byte, Integer> {

    private static final long serialVersionUID = 1053874185;

    /**
     * Setter for <code>isy.department.department_id</code>.
     */
    public void setDepartmentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.department.department_id</code>.
     */
    @NotNull
    public Integer getDepartmentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>isy.department.department_name</code>.
     */
    public void setDepartmentName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.department.department_name</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getDepartmentName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>isy.department.department_is_del</code>.
     */
    public void setDepartmentIsDel(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.department.department_is_del</code>.
     */
    public Byte getDepartmentIsDel() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>isy.department.college_id</code>.
     */
    public void setCollegeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>isy.department.college_id</code>.
     */
    @NotNull
    public Integer getCollegeId() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Byte, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Byte, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Department.DEPARTMENT.DEPARTMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Department.DEPARTMENT.DEPARTMENT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return Department.DEPARTMENT.DEPARTMENT_IS_DEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Department.DEPARTMENT.COLLEGE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDepartmentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDepartmentName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getDepartmentIsDel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getCollegeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartmentRecord value1(Integer value) {
        setDepartmentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartmentRecord value2(String value) {
        setDepartmentName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartmentRecord value3(Byte value) {
        setDepartmentIsDel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartmentRecord value4(Integer value) {
        setCollegeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartmentRecord values(Integer value1, String value2, Byte value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DepartmentRecord
     */
    public DepartmentRecord() {
        super(Department.DEPARTMENT);
    }

    /**
     * Create a detached, initialised DepartmentRecord
     */
    public DepartmentRecord(Integer departmentId, String departmentName, Byte departmentIsDel, Integer collegeId) {
        super(Department.DEPARTMENT);

        set(0, departmentId);
        set(1, departmentName);
        set(2, departmentIsDel);
        set(3, collegeId);
    }
}
