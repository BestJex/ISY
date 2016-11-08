package top.zbeboy.isy.service;

import com.alibaba.fastjson.JSONObject;
import org.jooq.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import top.zbeboy.isy.domain.tables.daos.NationDao;
import top.zbeboy.isy.domain.tables.pojos.Nation;
import top.zbeboy.isy.domain.tables.records.NationRecord;
import top.zbeboy.isy.service.plugin.DataTablesPlugin;
import top.zbeboy.isy.service.util.SQLQueryUtils;
import top.zbeboy.isy.web.util.DataTablesUtils;

import java.util.List;

import static top.zbeboy.isy.domain.Tables.NATION;

/**
 * Created by lenovo on 2016-10-30.
 */
@Service("NationService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class NationServiceImpl extends DataTablesPlugin<Nation> implements NationService {

    private final Logger log = LoggerFactory.getLogger(NationServiceImpl.class);

    private final DSLContext create;

    private NationDao nationDao;

    @Autowired
    public NationServiceImpl(DSLContext dslContext, Configuration configuration) {
        this.create = dslContext;
        this.nationDao = new NationDao(configuration);
    }

    @Override
    public List<Nation> findAll() {
        return nationDao.findAll();
    }

    @Override
    public Nation findById(int id) {
        return nationDao.findById(id);
    }

    @Override
    public List<Nation> findByNationName(String nationName) {
        return nationDao.fetchByNationName(nationName);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Override
    public void save(Nation nation) {
        nationDao.insert(nation);
    }

    @Override
    public void update(Nation nation) {
        nationDao.update(nation);
    }

    @Override
    public Result<NationRecord> findByNationNameNeNationId(String nationName, int nationId) {
        return create.selectFrom(NATION)
                .where(NATION.NATION_NAME.eq(nationName).and(NATION.NATION_ID.ne(nationId)))
                .fetch();
    }

    @Override
    public Result<Record> findAllByPage(DataTablesUtils<Nation> dataTablesUtils) {
        return dataPagingQueryAll(dataTablesUtils, create, NATION);
    }

    @Override
    public int countAll() {
        return statisticsAll(create, NATION);
    }

    @Override
    public int countByCondition(DataTablesUtils<Nation> dataTablesUtils) {
        return statisticsWithCondition(dataTablesUtils, create, NATION);
    }

    /**
     * 全局搜索条件
     *
     * @param dataTablesUtils
     * @return 搜索条件
     */
    @Override
    public Condition searchCondition(DataTablesUtils<Nation> dataTablesUtils) {
        Condition a = null;
        JSONObject search = dataTablesUtils.getSearch();
        if (!ObjectUtils.isEmpty(search)) {
            String nationName = StringUtils.trimWhitespace(search.getString("nationName"));
            if (StringUtils.hasLength(nationName)) {
                a = NATION.NATION_NAME.like(SQLQueryUtils.likeAllParam(nationName));
            }
        }
        return a;
    }

    /**
     * 数据排序
     *
     * @param dataTablesUtils
     * @param selectConditionStep
     */
    @Override
    public void sortCondition(DataTablesUtils<Nation> dataTablesUtils, SelectConditionStep<Record> selectConditionStep, SelectJoinStep<Record> selectJoinStep, int type) {
        String orderColumnName = dataTablesUtils.getOrderColumnName();
        String orderDir = dataTablesUtils.getOrderDir();
        boolean isAsc = "asc".equalsIgnoreCase(orderDir);
        SortField<Integer> a = null;
        SortField<String> b = null;
        SortField<Byte> c = null;
        if (StringUtils.hasLength(orderColumnName)) {
            if ("nation_id".equalsIgnoreCase(orderColumnName)) {
                if (isAsc) {
                    a = NATION.NATION_ID.asc();
                } else {
                    a = NATION.NATION_ID.desc();
                }
            }

            if ("nation_name".equalsIgnoreCase(orderColumnName)) {
                if (isAsc) {
                    b = NATION.NATION_NAME.asc();
                } else {
                    b = NATION.NATION_NAME.desc();
                }
            }
        }

        if (!ObjectUtils.isEmpty(a)) {
            if (type == CONDITION_TYPE) {
                selectConditionStep.orderBy(a);
            }

            if (type == JOIN_TYPE) {
                selectJoinStep.orderBy(a);
            }

        } else if (!ObjectUtils.isEmpty(b)) {
            if (type == CONDITION_TYPE) {
                selectConditionStep.orderBy(b);
            }

            if (type == JOIN_TYPE) {
                selectJoinStep.orderBy(b);
            }
        } else if (!ObjectUtils.isEmpty(c)) {
            if (type == CONDITION_TYPE) {
                selectConditionStep.orderBy(c);
            }

            if (type == JOIN_TYPE) {
                selectJoinStep.orderBy(c);
            }
        } else {
            if (type == CONDITION_TYPE) {
                selectConditionStep.orderBy(NATION.NATION_ID.desc());
            }

            if (type == JOIN_TYPE) {
                selectJoinStep.orderBy(NATION.NATION_ID.desc());
            }
        }
    }
}