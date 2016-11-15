package top.zbeboy.isy.service;

import org.jooq.Record;
import org.jooq.Result;
import top.zbeboy.isy.domain.tables.pojos.InternshipRelease;

import java.util.List;

/**
 * Created by lenovo on 2016-11-12.
 */
public interface InternshipReleaseService {

    /**
     * 通过标题查询
     *
     * @param releaseTitle 实习标题
     * @return 实习
     */
    List<InternshipRelease> findByReleaseTitle(String releaseTitle);

    /**
     * 保存
     *
     * @param internshipRelease 实习
     */
    void save(InternshipRelease internshipRelease);

    /**
     * 分页查询全部
     *
     * @return 分页数据
     */
    Result<Record> findAllByPage();
}