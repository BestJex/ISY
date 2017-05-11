/*
 * This file is generated by jOOQ.
*/
package top.zbeboy.isy.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import top.zbeboy.isy.domain.tables.AcademicTitle;
import top.zbeboy.isy.domain.tables.Application;
import top.zbeboy.isy.domain.tables.Authorities;
import top.zbeboy.isy.domain.tables.Building;
import top.zbeboy.isy.domain.tables.College;
import top.zbeboy.isy.domain.tables.CollegeApplication;
import top.zbeboy.isy.domain.tables.CollegeRole;
import top.zbeboy.isy.domain.tables.DefenseArrangement;
import top.zbeboy.isy.domain.tables.DefenseGroup;
import top.zbeboy.isy.domain.tables.DefenseGroupMember;
import top.zbeboy.isy.domain.tables.DefenseOrder;
import top.zbeboy.isy.domain.tables.Department;
import top.zbeboy.isy.domain.tables.Files;
import top.zbeboy.isy.domain.tables.GraduateArchives;
import top.zbeboy.isy.domain.tables.GraduateBill;
import top.zbeboy.isy.domain.tables.GraduationDesignDatum;
import top.zbeboy.isy.domain.tables.GraduationDesignDatumType;
import top.zbeboy.isy.domain.tables.GraduationDesignDeclare;
import top.zbeboy.isy.domain.tables.GraduationDesignDeclareData;
import top.zbeboy.isy.domain.tables.GraduationDesignHopeTutor;
import top.zbeboy.isy.domain.tables.GraduationDesignPlan;
import top.zbeboy.isy.domain.tables.GraduationDesignPresubject;
import top.zbeboy.isy.domain.tables.GraduationDesignRelease;
import top.zbeboy.isy.domain.tables.GraduationDesignReleaseFile;
import top.zbeboy.isy.domain.tables.GraduationDesignSubjectOriginType;
import top.zbeboy.isy.domain.tables.GraduationDesignSubjectType;
import top.zbeboy.isy.domain.tables.GraduationDesignTeacher;
import top.zbeboy.isy.domain.tables.GraduationDesignTutor;
import top.zbeboy.isy.domain.tables.GraduationPracticeCollege;
import top.zbeboy.isy.domain.tables.GraduationPracticeCompany;
import top.zbeboy.isy.domain.tables.GraduationPracticeUnify;
import top.zbeboy.isy.domain.tables.InternshipApply;
import top.zbeboy.isy.domain.tables.InternshipChangeCompanyHistory;
import top.zbeboy.isy.domain.tables.InternshipChangeHistory;
import top.zbeboy.isy.domain.tables.InternshipCollege;
import top.zbeboy.isy.domain.tables.InternshipCompany;
import top.zbeboy.isy.domain.tables.InternshipFile;
import top.zbeboy.isy.domain.tables.InternshipJournal;
import top.zbeboy.isy.domain.tables.InternshipRegulate;
import top.zbeboy.isy.domain.tables.InternshipRelease;
import top.zbeboy.isy.domain.tables.InternshipReleaseScience;
import top.zbeboy.isy.domain.tables.InternshipTeacherDistribution;
import top.zbeboy.isy.domain.tables.InternshipType;
import top.zbeboy.isy.domain.tables.Nation;
import top.zbeboy.isy.domain.tables.OauthAccessToken;
import top.zbeboy.isy.domain.tables.OauthClientDetails;
import top.zbeboy.isy.domain.tables.OauthClientToken;
import top.zbeboy.isy.domain.tables.OauthCode;
import top.zbeboy.isy.domain.tables.OauthRefreshToken;
import top.zbeboy.isy.domain.tables.Organize;
import top.zbeboy.isy.domain.tables.PersistentLogins;
import top.zbeboy.isy.domain.tables.PoliticalLandscape;
import top.zbeboy.isy.domain.tables.Role;
import top.zbeboy.isy.domain.tables.RoleApplication;
import top.zbeboy.isy.domain.tables.SchemaVersion;
import top.zbeboy.isy.domain.tables.School;
import top.zbeboy.isy.domain.tables.Schoolroom;
import top.zbeboy.isy.domain.tables.Science;
import top.zbeboy.isy.domain.tables.ScoreType;
import top.zbeboy.isy.domain.tables.Staff;
import top.zbeboy.isy.domain.tables.Student;
import top.zbeboy.isy.domain.tables.SyncElastic;
import top.zbeboy.isy.domain.tables.SystemAlert;
import top.zbeboy.isy.domain.tables.SystemAlertType;
import top.zbeboy.isy.domain.tables.SystemLog;
import top.zbeboy.isy.domain.tables.SystemMailbox;
import top.zbeboy.isy.domain.tables.SystemMessage;
import top.zbeboy.isy.domain.tables.SystemSms;
import top.zbeboy.isy.domain.tables.Users;
import top.zbeboy.isy.domain.tables.UsersType;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Isy extends SchemaImpl {

    private static final long serialVersionUID = 1815720388;

    /**
     * The reference instance of <code>isy</code>
     */
    public static final Isy ISY = new Isy();

    /**
     * The table <code>isy.academic_title</code>.
     */
    public final AcademicTitle ACADEMIC_TITLE = top.zbeboy.isy.domain.tables.AcademicTitle.ACADEMIC_TITLE;

    /**
     * The table <code>isy.application</code>.
     */
    public final Application APPLICATION = top.zbeboy.isy.domain.tables.Application.APPLICATION;

    /**
     * The table <code>isy.authorities</code>.
     */
    public final Authorities AUTHORITIES = top.zbeboy.isy.domain.tables.Authorities.AUTHORITIES;

    /**
     * The table <code>isy.building</code>.
     */
    public final Building BUILDING = top.zbeboy.isy.domain.tables.Building.BUILDING;

    /**
     * The table <code>isy.college</code>.
     */
    public final College COLLEGE = top.zbeboy.isy.domain.tables.College.COLLEGE;

    /**
     * The table <code>isy.college_application</code>.
     */
    public final CollegeApplication COLLEGE_APPLICATION = top.zbeboy.isy.domain.tables.CollegeApplication.COLLEGE_APPLICATION;

    /**
     * The table <code>isy.college_role</code>.
     */
    public final CollegeRole COLLEGE_ROLE = top.zbeboy.isy.domain.tables.CollegeRole.COLLEGE_ROLE;

    /**
     * The table <code>isy.defense_arrangement</code>.
     */
    public final DefenseArrangement DEFENSE_ARRANGEMENT = top.zbeboy.isy.domain.tables.DefenseArrangement.DEFENSE_ARRANGEMENT;

    /**
     * The table <code>isy.defense_group</code>.
     */
    public final DefenseGroup DEFENSE_GROUP = top.zbeboy.isy.domain.tables.DefenseGroup.DEFENSE_GROUP;

    /**
     * The table <code>isy.defense_group_member</code>.
     */
    public final DefenseGroupMember DEFENSE_GROUP_MEMBER = top.zbeboy.isy.domain.tables.DefenseGroupMember.DEFENSE_GROUP_MEMBER;

    /**
     * The table <code>isy.defense_order</code>.
     */
    public final DefenseOrder DEFENSE_ORDER = top.zbeboy.isy.domain.tables.DefenseOrder.DEFENSE_ORDER;

    /**
     * The table <code>isy.department</code>.
     */
    public final Department DEPARTMENT = top.zbeboy.isy.domain.tables.Department.DEPARTMENT;

    /**
     * The table <code>isy.files</code>.
     */
    public final Files FILES = top.zbeboy.isy.domain.tables.Files.FILES;

    /**
     * The table <code>isy.graduate_archives</code>.
     */
    public final GraduateArchives GRADUATE_ARCHIVES = top.zbeboy.isy.domain.tables.GraduateArchives.GRADUATE_ARCHIVES;

    /**
     * The table <code>isy.graduate_bill</code>.
     */
    public final GraduateBill GRADUATE_BILL = top.zbeboy.isy.domain.tables.GraduateBill.GRADUATE_BILL;

    /**
     * The table <code>isy.graduation_design_datum</code>.
     */
    public final GraduationDesignDatum GRADUATION_DESIGN_DATUM = top.zbeboy.isy.domain.tables.GraduationDesignDatum.GRADUATION_DESIGN_DATUM;

    /**
     * The table <code>isy.graduation_design_datum_type</code>.
     */
    public final GraduationDesignDatumType GRADUATION_DESIGN_DATUM_TYPE = top.zbeboy.isy.domain.tables.GraduationDesignDatumType.GRADUATION_DESIGN_DATUM_TYPE;

    /**
     * The table <code>isy.graduation_design_declare</code>.
     */
    public final GraduationDesignDeclare GRADUATION_DESIGN_DECLARE = top.zbeboy.isy.domain.tables.GraduationDesignDeclare.GRADUATION_DESIGN_DECLARE;

    /**
     * The table <code>isy.graduation_design_declare_data</code>.
     */
    public final GraduationDesignDeclareData GRADUATION_DESIGN_DECLARE_DATA = top.zbeboy.isy.domain.tables.GraduationDesignDeclareData.GRADUATION_DESIGN_DECLARE_DATA;

    /**
     * The table <code>isy.graduation_design_hope_tutor</code>.
     */
    public final GraduationDesignHopeTutor GRADUATION_DESIGN_HOPE_TUTOR = top.zbeboy.isy.domain.tables.GraduationDesignHopeTutor.GRADUATION_DESIGN_HOPE_TUTOR;

    /**
     * The table <code>isy.graduation_design_plan</code>.
     */
    public final GraduationDesignPlan GRADUATION_DESIGN_PLAN = top.zbeboy.isy.domain.tables.GraduationDesignPlan.GRADUATION_DESIGN_PLAN;

    /**
     * The table <code>isy.graduation_design_presubject</code>.
     */
    public final GraduationDesignPresubject GRADUATION_DESIGN_PRESUBJECT = top.zbeboy.isy.domain.tables.GraduationDesignPresubject.GRADUATION_DESIGN_PRESUBJECT;

    /**
     * The table <code>isy.graduation_design_release</code>.
     */
    public final GraduationDesignRelease GRADUATION_DESIGN_RELEASE = top.zbeboy.isy.domain.tables.GraduationDesignRelease.GRADUATION_DESIGN_RELEASE;

    /**
     * The table <code>isy.graduation_design_release_file</code>.
     */
    public final GraduationDesignReleaseFile GRADUATION_DESIGN_RELEASE_FILE = top.zbeboy.isy.domain.tables.GraduationDesignReleaseFile.GRADUATION_DESIGN_RELEASE_FILE;

    /**
     * The table <code>isy.graduation_design_subject_origin_type</code>.
     */
    public final GraduationDesignSubjectOriginType GRADUATION_DESIGN_SUBJECT_ORIGIN_TYPE = top.zbeboy.isy.domain.tables.GraduationDesignSubjectOriginType.GRADUATION_DESIGN_SUBJECT_ORIGIN_TYPE;

    /**
     * The table <code>isy.graduation_design_subject_type</code>.
     */
    public final GraduationDesignSubjectType GRADUATION_DESIGN_SUBJECT_TYPE = top.zbeboy.isy.domain.tables.GraduationDesignSubjectType.GRADUATION_DESIGN_SUBJECT_TYPE;

    /**
     * The table <code>isy.graduation_design_teacher</code>.
     */
    public final GraduationDesignTeacher GRADUATION_DESIGN_TEACHER = top.zbeboy.isy.domain.tables.GraduationDesignTeacher.GRADUATION_DESIGN_TEACHER;

    /**
     * The table <code>isy.graduation_design_tutor</code>.
     */
    public final GraduationDesignTutor GRADUATION_DESIGN_TUTOR = top.zbeboy.isy.domain.tables.GraduationDesignTutor.GRADUATION_DESIGN_TUTOR;

    /**
     * The table <code>isy.graduation_practice_college</code>.
     */
    public final GraduationPracticeCollege GRADUATION_PRACTICE_COLLEGE = top.zbeboy.isy.domain.tables.GraduationPracticeCollege.GRADUATION_PRACTICE_COLLEGE;

    /**
     * The table <code>isy.graduation_practice_company</code>.
     */
    public final GraduationPracticeCompany GRADUATION_PRACTICE_COMPANY = top.zbeboy.isy.domain.tables.GraduationPracticeCompany.GRADUATION_PRACTICE_COMPANY;

    /**
     * The table <code>isy.graduation_practice_unify</code>.
     */
    public final GraduationPracticeUnify GRADUATION_PRACTICE_UNIFY = top.zbeboy.isy.domain.tables.GraduationPracticeUnify.GRADUATION_PRACTICE_UNIFY;

    /**
     * The table <code>isy.internship_apply</code>.
     */
    public final InternshipApply INTERNSHIP_APPLY = top.zbeboy.isy.domain.tables.InternshipApply.INTERNSHIP_APPLY;

    /**
     * The table <code>isy.internship_change_company_history</code>.
     */
    public final InternshipChangeCompanyHistory INTERNSHIP_CHANGE_COMPANY_HISTORY = top.zbeboy.isy.domain.tables.InternshipChangeCompanyHistory.INTERNSHIP_CHANGE_COMPANY_HISTORY;

    /**
     * The table <code>isy.internship_change_history</code>.
     */
    public final InternshipChangeHistory INTERNSHIP_CHANGE_HISTORY = top.zbeboy.isy.domain.tables.InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY;

    /**
     * The table <code>isy.internship_college</code>.
     */
    public final InternshipCollege INTERNSHIP_COLLEGE = top.zbeboy.isy.domain.tables.InternshipCollege.INTERNSHIP_COLLEGE;

    /**
     * The table <code>isy.internship_company</code>.
     */
    public final InternshipCompany INTERNSHIP_COMPANY = top.zbeboy.isy.domain.tables.InternshipCompany.INTERNSHIP_COMPANY;

    /**
     * The table <code>isy.internship_file</code>.
     */
    public final InternshipFile INTERNSHIP_FILE = top.zbeboy.isy.domain.tables.InternshipFile.INTERNSHIP_FILE;

    /**
     * The table <code>isy.internship_journal</code>.
     */
    public final InternshipJournal INTERNSHIP_JOURNAL = top.zbeboy.isy.domain.tables.InternshipJournal.INTERNSHIP_JOURNAL;

    /**
     * The table <code>isy.internship_regulate</code>.
     */
    public final InternshipRegulate INTERNSHIP_REGULATE = top.zbeboy.isy.domain.tables.InternshipRegulate.INTERNSHIP_REGULATE;

    /**
     * The table <code>isy.internship_release</code>.
     */
    public final InternshipRelease INTERNSHIP_RELEASE = top.zbeboy.isy.domain.tables.InternshipRelease.INTERNSHIP_RELEASE;

    /**
     * The table <code>isy.internship_release_science</code>.
     */
    public final InternshipReleaseScience INTERNSHIP_RELEASE_SCIENCE = top.zbeboy.isy.domain.tables.InternshipReleaseScience.INTERNSHIP_RELEASE_SCIENCE;

    /**
     * The table <code>isy.internship_teacher_distribution</code>.
     */
    public final InternshipTeacherDistribution INTERNSHIP_TEACHER_DISTRIBUTION = top.zbeboy.isy.domain.tables.InternshipTeacherDistribution.INTERNSHIP_TEACHER_DISTRIBUTION;

    /**
     * The table <code>isy.internship_type</code>.
     */
    public final InternshipType INTERNSHIP_TYPE = top.zbeboy.isy.domain.tables.InternshipType.INTERNSHIP_TYPE;

    /**
     * The table <code>isy.nation</code>.
     */
    public final Nation NATION = top.zbeboy.isy.domain.tables.Nation.NATION;

    /**
     * The table <code>isy.oauth_access_token</code>.
     */
    public final OauthAccessToken OAUTH_ACCESS_TOKEN = top.zbeboy.isy.domain.tables.OauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>isy.oauth_client_details</code>.
     */
    public final OauthClientDetails OAUTH_CLIENT_DETAILS = top.zbeboy.isy.domain.tables.OauthClientDetails.OAUTH_CLIENT_DETAILS;

    /**
     * The table <code>isy.oauth_client_token</code>.
     */
    public final OauthClientToken OAUTH_CLIENT_TOKEN = top.zbeboy.isy.domain.tables.OauthClientToken.OAUTH_CLIENT_TOKEN;

    /**
     * The table <code>isy.oauth_code</code>.
     */
    public final OauthCode OAUTH_CODE = top.zbeboy.isy.domain.tables.OauthCode.OAUTH_CODE;

    /**
     * The table <code>isy.oauth_refresh_token</code>.
     */
    public final OauthRefreshToken OAUTH_REFRESH_TOKEN = top.zbeboy.isy.domain.tables.OauthRefreshToken.OAUTH_REFRESH_TOKEN;

    /**
     * The table <code>isy.organize</code>.
     */
    public final Organize ORGANIZE = top.zbeboy.isy.domain.tables.Organize.ORGANIZE;

    /**
     * The table <code>isy.persistent_logins</code>.
     */
    public final PersistentLogins PERSISTENT_LOGINS = top.zbeboy.isy.domain.tables.PersistentLogins.PERSISTENT_LOGINS;

    /**
     * The table <code>isy.political_landscape</code>.
     */
    public final PoliticalLandscape POLITICAL_LANDSCAPE = top.zbeboy.isy.domain.tables.PoliticalLandscape.POLITICAL_LANDSCAPE;

    /**
     * The table <code>isy.role</code>.
     */
    public final Role ROLE = top.zbeboy.isy.domain.tables.Role.ROLE;

    /**
     * The table <code>isy.role_application</code>.
     */
    public final RoleApplication ROLE_APPLICATION = top.zbeboy.isy.domain.tables.RoleApplication.ROLE_APPLICATION;

    /**
     * The table <code>isy.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = top.zbeboy.isy.domain.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>isy.school</code>.
     */
    public final School SCHOOL = top.zbeboy.isy.domain.tables.School.SCHOOL;

    /**
     * The table <code>isy.schoolroom</code>.
     */
    public final Schoolroom SCHOOLROOM = top.zbeboy.isy.domain.tables.Schoolroom.SCHOOLROOM;

    /**
     * The table <code>isy.science</code>.
     */
    public final Science SCIENCE = top.zbeboy.isy.domain.tables.Science.SCIENCE;

    /**
     * The table <code>isy.score_type</code>.
     */
    public final ScoreType SCORE_TYPE = top.zbeboy.isy.domain.tables.ScoreType.SCORE_TYPE;

    /**
     * The table <code>isy.staff</code>.
     */
    public final Staff STAFF = top.zbeboy.isy.domain.tables.Staff.STAFF;

    /**
     * The table <code>isy.student</code>.
     */
    public final Student STUDENT = top.zbeboy.isy.domain.tables.Student.STUDENT;

    /**
     * The table <code>isy.sync_elastic</code>.
     */
    public final SyncElastic SYNC_ELASTIC = top.zbeboy.isy.domain.tables.SyncElastic.SYNC_ELASTIC;

    /**
     * The table <code>isy.system_alert</code>.
     */
    public final SystemAlert SYSTEM_ALERT = top.zbeboy.isy.domain.tables.SystemAlert.SYSTEM_ALERT;

    /**
     * The table <code>isy.system_alert_type</code>.
     */
    public final SystemAlertType SYSTEM_ALERT_TYPE = top.zbeboy.isy.domain.tables.SystemAlertType.SYSTEM_ALERT_TYPE;

    /**
     * The table <code>isy.system_log</code>.
     */
    public final SystemLog SYSTEM_LOG = top.zbeboy.isy.domain.tables.SystemLog.SYSTEM_LOG;

    /**
     * The table <code>isy.system_mailbox</code>.
     */
    public final SystemMailbox SYSTEM_MAILBOX = top.zbeboy.isy.domain.tables.SystemMailbox.SYSTEM_MAILBOX;

    /**
     * The table <code>isy.system_message</code>.
     */
    public final SystemMessage SYSTEM_MESSAGE = top.zbeboy.isy.domain.tables.SystemMessage.SYSTEM_MESSAGE;

    /**
     * The table <code>isy.system_sms</code>.
     */
    public final SystemSms SYSTEM_SMS = top.zbeboy.isy.domain.tables.SystemSms.SYSTEM_SMS;

    /**
     * The table <code>isy.users</code>.
     */
    public final Users USERS = top.zbeboy.isy.domain.tables.Users.USERS;

    /**
     * The table <code>isy.users_type</code>.
     */
    public final UsersType USERS_TYPE = top.zbeboy.isy.domain.tables.UsersType.USERS_TYPE;

    /**
     * No further instances allowed
     */
    private Isy() {
        super("isy", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            AcademicTitle.ACADEMIC_TITLE,
            Application.APPLICATION,
            Authorities.AUTHORITIES,
            Building.BUILDING,
            College.COLLEGE,
            CollegeApplication.COLLEGE_APPLICATION,
            CollegeRole.COLLEGE_ROLE,
            DefenseArrangement.DEFENSE_ARRANGEMENT,
            DefenseGroup.DEFENSE_GROUP,
            DefenseGroupMember.DEFENSE_GROUP_MEMBER,
            DefenseOrder.DEFENSE_ORDER,
            Department.DEPARTMENT,
            Files.FILES,
            GraduateArchives.GRADUATE_ARCHIVES,
            GraduateBill.GRADUATE_BILL,
            GraduationDesignDatum.GRADUATION_DESIGN_DATUM,
            GraduationDesignDatumType.GRADUATION_DESIGN_DATUM_TYPE,
            GraduationDesignDeclare.GRADUATION_DESIGN_DECLARE,
            GraduationDesignDeclareData.GRADUATION_DESIGN_DECLARE_DATA,
            GraduationDesignHopeTutor.GRADUATION_DESIGN_HOPE_TUTOR,
            GraduationDesignPlan.GRADUATION_DESIGN_PLAN,
            GraduationDesignPresubject.GRADUATION_DESIGN_PRESUBJECT,
            GraduationDesignRelease.GRADUATION_DESIGN_RELEASE,
            GraduationDesignReleaseFile.GRADUATION_DESIGN_RELEASE_FILE,
            GraduationDesignSubjectOriginType.GRADUATION_DESIGN_SUBJECT_ORIGIN_TYPE,
            GraduationDesignSubjectType.GRADUATION_DESIGN_SUBJECT_TYPE,
            GraduationDesignTeacher.GRADUATION_DESIGN_TEACHER,
            GraduationDesignTutor.GRADUATION_DESIGN_TUTOR,
            GraduationPracticeCollege.GRADUATION_PRACTICE_COLLEGE,
            GraduationPracticeCompany.GRADUATION_PRACTICE_COMPANY,
            GraduationPracticeUnify.GRADUATION_PRACTICE_UNIFY,
            InternshipApply.INTERNSHIP_APPLY,
            InternshipChangeCompanyHistory.INTERNSHIP_CHANGE_COMPANY_HISTORY,
            InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY,
            InternshipCollege.INTERNSHIP_COLLEGE,
            InternshipCompany.INTERNSHIP_COMPANY,
            InternshipFile.INTERNSHIP_FILE,
            InternshipJournal.INTERNSHIP_JOURNAL,
            InternshipRegulate.INTERNSHIP_REGULATE,
            InternshipRelease.INTERNSHIP_RELEASE,
            InternshipReleaseScience.INTERNSHIP_RELEASE_SCIENCE,
            InternshipTeacherDistribution.INTERNSHIP_TEACHER_DISTRIBUTION,
            InternshipType.INTERNSHIP_TYPE,
            Nation.NATION,
            OauthAccessToken.OAUTH_ACCESS_TOKEN,
            OauthClientDetails.OAUTH_CLIENT_DETAILS,
            OauthClientToken.OAUTH_CLIENT_TOKEN,
            OauthCode.OAUTH_CODE,
            OauthRefreshToken.OAUTH_REFRESH_TOKEN,
            Organize.ORGANIZE,
            PersistentLogins.PERSISTENT_LOGINS,
            PoliticalLandscape.POLITICAL_LANDSCAPE,
            Role.ROLE,
            RoleApplication.ROLE_APPLICATION,
            SchemaVersion.SCHEMA_VERSION,
            School.SCHOOL,
            Schoolroom.SCHOOLROOM,
            Science.SCIENCE,
            ScoreType.SCORE_TYPE,
            Staff.STAFF,
            Student.STUDENT,
            SyncElastic.SYNC_ELASTIC,
            SystemAlert.SYSTEM_ALERT,
            SystemAlertType.SYSTEM_ALERT_TYPE,
            SystemLog.SYSTEM_LOG,
            SystemMailbox.SYSTEM_MAILBOX,
            SystemMessage.SYSTEM_MESSAGE,
            SystemSms.SYSTEM_SMS,
            Users.USERS,
            UsersType.USERS_TYPE);
    }
}
