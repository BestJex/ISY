/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.records;


import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import top.zbeboy.isy.domain.tables.Application;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ApplicationRecord extends UpdatableRecordImpl<ApplicationRecord> implements Record9<String, String, Integer, String, String, String, String, String, String> {

    private static final long serialVersionUID = 34748396;

    /**
     * Setter for <code>isy.application.application_id</code>.
     */
    public void setApplicationId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>isy.application.application_id</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getApplicationId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>isy.application.application_name</code>.
     */
    public void setApplicationName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>isy.application.application_name</code>.
     */
    @NotNull
    @Size(max = 30)
    public String getApplicationName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>isy.application.application_sort</code>.
     */
    public void setApplicationSort(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>isy.application.application_sort</code>.
     */
    public Integer getApplicationSort() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>isy.application.application_pid</code>.
     */
    public void setApplicationPid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>isy.application.application_pid</code>.
     */
    @NotNull
    @Size(max = 64)
    public String getApplicationPid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>isy.application.application_url</code>.
     */
    public void setApplicationUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>isy.application.application_url</code>.
     */
    @NotNull
    @Size(max = 300)
    public String getApplicationUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>isy.application.application_code</code>.
     */
    public void setApplicationCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>isy.application.application_code</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getApplicationCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>isy.application.application_en_name</code>.
     */
    public void setApplicationEnName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>isy.application.application_en_name</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getApplicationEnName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>isy.application.icon</code>.
     */
    public void setIcon(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>isy.application.icon</code>.
     */
    @Size(max = 20)
    public String getIcon() {
        return (String) get(7);
    }

    /**
     * Setter for <code>isy.application.application_data_url_start_with</code>.
     */
    public void setApplicationDataUrlStartWith(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>isy.application.application_data_url_start_with</code>.
     */
    @Size(max = 300)
    public String getApplicationDataUrlStartWith() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, Integer, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Application.APPLICATION.APPLICATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Application.APPLICATION.APPLICATION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Application.APPLICATION.APPLICATION_SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Application.APPLICATION.APPLICATION_PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Application.APPLICATION.APPLICATION_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Application.APPLICATION.APPLICATION_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Application.APPLICATION.APPLICATION_EN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Application.APPLICATION.ICON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Application.APPLICATION.APPLICATION_DATA_URL_START_WITH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getApplicationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getApplicationSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getApplicationPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getApplicationUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getApplicationCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getApplicationEnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getApplicationDataUrlStartWith();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getApplicationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getApplicationName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getApplicationSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getApplicationPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getApplicationUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getApplicationCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getApplicationEnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getIcon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getApplicationDataUrlStartWith();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value1(String value) {
        setApplicationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value2(String value) {
        setApplicationName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value3(Integer value) {
        setApplicationSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value4(String value) {
        setApplicationPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value5(String value) {
        setApplicationUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value6(String value) {
        setApplicationCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value7(String value) {
        setApplicationEnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value8(String value) {
        setIcon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord value9(String value) {
        setApplicationDataUrlStartWith(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationRecord values(String value1, String value2, Integer value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ApplicationRecord
     */
    public ApplicationRecord() {
        super(Application.APPLICATION);
    }

    /**
     * Create a detached, initialised ApplicationRecord
     */
    public ApplicationRecord(String applicationId, String applicationName, Integer applicationSort, String applicationPid, String applicationUrl, String applicationCode, String applicationEnName, String icon, String applicationDataUrlStartWith) {
        super(Application.APPLICATION);

        set(0, applicationId);
        set(1, applicationName);
        set(2, applicationSort);
        set(3, applicationPid);
        set(4, applicationUrl);
        set(5, applicationCode);
        set(6, applicationEnName);
        set(7, icon);
        set(8, applicationDataUrlStartWith);
    }
}
