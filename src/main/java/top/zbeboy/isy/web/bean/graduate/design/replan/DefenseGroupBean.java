package top.zbeboy.isy.web.bean.graduate.design.replan;

import lombok.Data;
import lombok.EqualsAndHashCode;
import top.zbeboy.isy.domain.tables.pojos.DefenseGroup;

/**
 * Created by zbeboy on 2017/7/11.
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class DefenseGroupBean extends DefenseGroup {
    private String buildingName;
    private String buildingCode;
    private String staffName;
    private String studentName;
}
