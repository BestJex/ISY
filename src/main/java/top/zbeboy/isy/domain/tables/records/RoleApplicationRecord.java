/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.RoleApplication;


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
public class RoleApplicationRecord extends UpdatableRecordImpl<RoleApplicationRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1252080822;

    /**
     * Setter for <code>isy.role_application.role_id</code>.
     */
    public void setRoleId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.role_application.role_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getRoleId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.role_application.application_id</code>.
     */
    public void setApplicationId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.role_application.application_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getApplicationId() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return RoleApplication.ROLE_APPLICATION.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RoleApplication.ROLE_APPLICATION.APPLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleApplicationRecord value1(String value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleApplicationRecord value2(String value) {
        setApplicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RoleApplicationRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleApplicationRecord
     */
    public RoleApplicationRecord() {
        super(RoleApplication.ROLE_APPLICATION);
    }

    /**
     * Create a detached, initialised RoleApplicationRecord
     */
    public RoleApplicationRecord(String roleId, String applicationId) {
        super(RoleApplication.ROLE_APPLICATION);

        set(0, roleId);
        set(1, applicationId);
    }
}
