/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.UsersType;


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
public class UsersTypeRecord extends UpdatableRecordImpl<UsersTypeRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = -1942394443;

    /**
     * Setter for <code>isy.users_type.users_type_id</code>.
     */
    public void setUsersTypeId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.users_type.users_type_id</code>.
     */
    @NotNull
    public Integer getUsersTypeId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>isy.users_type.users_type_name</code>.
     */
    public void setUsersTypeName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.users_type.users_type_name</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getUsersTypeName() {
        return (String) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return UsersType.USERS_TYPE.USERS_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return UsersType.USERS_TYPE.USERS_TYPE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getUsersTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUsersTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersTypeRecord value1(Integer value) {
        setUsersTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersTypeRecord value2(String value) {
        setUsersTypeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersTypeRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersTypeRecord
     */
    public UsersTypeRecord() {
        super(UsersType.USERS_TYPE);
    }

    /**
     * Create a detached, initialised UsersTypeRecord
     */
    public UsersTypeRecord(Integer usersTypeId, String usersTypeName) {
        super(UsersType.USERS_TYPE);

        set(0, usersTypeId);
        set(1, usersTypeName);
    }
}
