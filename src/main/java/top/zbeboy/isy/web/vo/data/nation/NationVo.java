package top.zbeboy.isy.web.vo.data.nation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by lenovo on 2016-11-02.
 */
public class NationVo {
    private Integer nationId;
    @NotNull
    @Size(max = 30)
    private String  nationName;

    public Integer getNationId() {
        return nationId;
    }

    public void setNationId(Integer nationId) {
        this.nationId = nationId;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }
}
