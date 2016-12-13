package top.zbeboy.isy.service;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.zbeboy.isy.domain.tables.daos.InternshipChangeHistoryDao;
import top.zbeboy.isy.domain.tables.daos.InternshipCollegeDao;
import top.zbeboy.isy.domain.tables.pojos.InternshipChangeHistory;

import java.util.Optional;

import static top.zbeboy.isy.domain.Tables.*;
import static top.zbeboy.isy.domain.Tables.INTERNSHIP_RELEASE;

/**
 * Created by lenovo on 2016-12-12.
 */
@Service("internshipChangeHistoryService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class InternshipChangeHistoryServiceImpl implements InternshipChangeHistoryService {

    private final Logger log = LoggerFactory.getLogger(InternshipChangeHistoryServiceImpl.class);

    private final DSLContext create;

    private InternshipChangeHistoryDao internshipChangeHistoryDao;

    @Autowired
    public InternshipChangeHistoryServiceImpl(DSLContext dslContext, Configuration configuration) {
        this.create = dslContext;
        this.internshipChangeHistoryDao = new InternshipChangeHistoryDao(configuration);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Override
    public void save(InternshipChangeHistory internshipChangeHistory) {
        internshipChangeHistoryDao.insert(internshipChangeHistory);
    }

    @Override
    public Result<Record> findByInternshipReleaseIdAndStudentId(String internshipReleaseId, int studentId) {
        return create.select()
                .from(INTERNSHIP_CHANGE_HISTORY)
                .join(STUDENT)
                .on(INTERNSHIP_CHANGE_HISTORY.STUDENT_ID.eq(STUDENT.STUDENT_ID))
                .join(ORGANIZE)
                .on(STUDENT.ORGANIZE_ID.eq(ORGANIZE.ORGANIZE_ID))
                .join(USERS)
                .on(STUDENT.USERNAME.eq(USERS.USERNAME))
                .join(INTERNSHIP_RELEASE)
                .on(INTERNSHIP_CHANGE_HISTORY.INTERNSHIP_RELEASE_ID.eq(INTERNSHIP_RELEASE.INTERNSHIP_RELEASE_ID))
                .where(INTERNSHIP_CHANGE_HISTORY.INTERNSHIP_RELEASE_ID.eq(internshipReleaseId).and(INTERNSHIP_CHANGE_HISTORY.STUDENT_ID.eq(studentId)))
                .fetch();
    }
}