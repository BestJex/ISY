package top.zbeboy.isy.test;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.tools.jdbc.MockConnection;
import org.jooq.tools.jdbc.MockDataProvider;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ObjectUtils;
import top.zbeboy.isy.Application;
import top.zbeboy.isy.config.Workbook;
import top.zbeboy.isy.domain.tables.pojos.Role;
import top.zbeboy.isy.domain.tables.records.AuthoritiesRecord;
import top.zbeboy.isy.elastic.pojo.*;
import top.zbeboy.isy.elastic.repository.*;
import top.zbeboy.isy.service.platform.RoleService;
import top.zbeboy.isy.service.system.AuthoritiesService;

import java.util.ArrayList;
import java.util.List;

import static top.zbeboy.isy.domain.Tables.*;

/**
 * Created by lenovo on 2017-04-09.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Application.class)
public class ElasticSyncData {

    @Autowired
    DSLContext create;

    @Autowired
    OrganizeElasticRepository organizeElasticRepository;

    @Autowired
    SystemLogElasticRepository systemLogElasticRepository;

    @Autowired
    SystemMailboxElasticRepository systemMailboxElasticRepository;

    @Autowired
    SystemSmsElasticRepository systemSmsElasticRepository;

    @Autowired
    UsersElasticRepository usersElasticRepository;

    @Autowired
    AuthoritiesService authoritiesService;

    @Autowired
    RoleService roleService;

    @Test
    public void syncOrganizeData() {
        organizeElasticRepository.deleteAll();
        Result<Record> record = create.select()
                .from(ORGANIZE)
                .join(SCIENCE)
                .on(ORGANIZE.SCIENCE_ID.eq(SCIENCE.SCIENCE_ID))
                .join(DEPARTMENT)
                .on(SCIENCE.DEPARTMENT_ID.eq(DEPARTMENT.DEPARTMENT_ID))
                .join(COLLEGE)
                .on(DEPARTMENT.COLLEGE_ID.eq(COLLEGE.COLLEGE_ID))
                .join(SCHOOL)
                .on(COLLEGE.SCHOOL_ID.eq(SCHOOL.SCHOOL_ID))
                .fetch();

        if (record.isNotEmpty()) {
            List<OrganizeElastic> organizeElastics = record.into(OrganizeElastic.class);
            organizeElastics.forEach(i -> organizeElasticRepository.save(i));
        }
    }

    @Test
    public void syncSystemLogData() {
        systemLogElasticRepository.deleteAll();
        Result<Record> record = create.select()
                .from(SYSTEM_LOG)
                .fetch();

        if (record.isNotEmpty()) {
            List<SystemLogElastic> systemLogElastics = record.into(SystemLogElastic.class);
            systemLogElastics.forEach(i -> systemLogElasticRepository.save(i));
        }
    }

    @Test
    public void syncSystemMailboxData() {
        systemMailboxElasticRepository.deleteAll();
        Result<Record> record = create.select()
                .from(SYSTEM_MAILBOX)
                .fetch();

        if (record.isNotEmpty()) {
            List<SystemMailboxElastic> systemMailboxElastics = record.into(SystemMailboxElastic.class);
            systemMailboxElastics.forEach(i -> systemMailboxElasticRepository.save(i));
        }
    }

    @Test
    public void syncSystemSmsData() {
        systemSmsElasticRepository.deleteAll();
        Result<Record> record = create.select()
                .from(SYSTEM_SMS)
                .fetch();

        if (record.isNotEmpty()) {
            List<SystemSmsElastic> systemSmsElastics = record.into(SystemSmsElastic.class);
            systemSmsElastics.forEach(i -> systemSmsElasticRepository.save(i));
        }
    }

    @Test
    public void syncUsersData() {
        usersElasticRepository.deleteAll();
        Result<Record> record = create.select()
                .from(USERS)
                .join(USERS_TYPE)
                .on(USERS.USERS_TYPE_ID.eq(USERS_TYPE.USERS_TYPE_ID))
                .fetch();
        List<UsersElastic> usersElastics = new ArrayList<>();
        for (Record r : record) {
            UsersElastic usersElastic = r.into(UsersElastic.class);
            List<AuthoritiesRecord> authoritiesRecords = authoritiesService.findByUsername(r.get(USERS.USERNAME));
            /**
             * -1 : 无权限
             * 0 :  有权限
             * 1 : 系统
             * 2 : 管理员
             */
            if (!ObjectUtils.isEmpty(authoritiesRecords) && authoritiesRecords.size() > 0) {
                boolean hasUse = false;
                StringBuilder stringBuilder = new StringBuilder();
                for (AuthoritiesRecord a : authoritiesRecords) {
                    if (!hasUse && a.getAuthority().equals(Workbook.SYSTEM_AUTHORITIES)) {
                        usersElastic.setAuthorities(1);
                        hasUse = true;
                    }
                    if (!hasUse && a.getAuthority().equals(Workbook.ADMIN_AUTHORITIES)) {
                        usersElastic.setAuthorities(2);
                        hasUse = true;
                    }
                    Role tempRole = roleService.findByRoleEnName(a.getAuthority());
                    stringBuilder.append(tempRole.getRoleName()).append(" ");
                }
                if (!hasUse) {
                    usersElastic.setAuthorities(0);
                }
                usersElastic.setRoleName(stringBuilder.toString().trim());
            } else {
                usersElastic.setAuthorities(-1);
            }
            usersElastics.add(usersElastic);
        }
        usersElastics.forEach(users ->
                usersElasticRepository.save(users)
        );
    }
}
