/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class SystemAlertType implements Serializable {

    private static final long serialVersionUID = -276713574;

    private Integer systemAlertTypeId;
    private String  name;
    private String  icon;

    public SystemAlertType() {}

    public SystemAlertType(SystemAlertType value) {
        this.systemAlertTypeId = value.systemAlertTypeId;
        this.name = value.name;
        this.icon = value.icon;
    }

    public SystemAlertType(
        Integer systemAlertTypeId,
        String  name,
        String  icon
    ) {
        this.systemAlertTypeId = systemAlertTypeId;
        this.name = name;
        this.icon = icon;
    }

    @NotNull
    public Integer getSystemAlertTypeId() {
        return this.systemAlertTypeId;
    }

    public void setSystemAlertTypeId(Integer systemAlertTypeId) {
        this.systemAlertTypeId = systemAlertTypeId;
    }

    @NotNull
    @Size(max = 10)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull
    @Size(max = 30)
    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SystemAlertType (");

        sb.append(systemAlertTypeId);
        sb.append(", ").append(name);
        sb.append(", ").append(icon);

        sb.append(")");
        return sb.toString();
    }
}
