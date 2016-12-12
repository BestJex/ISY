/**
 * This class is generated by jOOQ
 */
package top.zbeboy.isy.domain;


import javax.annotation.Generated;

import top.zbeboy.isy.domain.tables.Application;
import top.zbeboy.isy.domain.tables.Authorities;
import top.zbeboy.isy.domain.tables.College;
import top.zbeboy.isy.domain.tables.CollegeApplication;
import top.zbeboy.isy.domain.tables.CollegeRole;
import top.zbeboy.isy.domain.tables.Department;
import top.zbeboy.isy.domain.tables.Files;
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
import top.zbeboy.isy.domain.tables.Organize;
import top.zbeboy.isy.domain.tables.PersistentLogins;
import top.zbeboy.isy.domain.tables.PoliticalLandscape;
import top.zbeboy.isy.domain.tables.Role;
import top.zbeboy.isy.domain.tables.RoleApplication;
import top.zbeboy.isy.domain.tables.SchemaVersion;
import top.zbeboy.isy.domain.tables.School;
import top.zbeboy.isy.domain.tables.Science;
import top.zbeboy.isy.domain.tables.Staff;
import top.zbeboy.isy.domain.tables.Student;
import top.zbeboy.isy.domain.tables.SystemLog;
import top.zbeboy.isy.domain.tables.SystemMailbox;
import top.zbeboy.isy.domain.tables.SystemSms;
import top.zbeboy.isy.domain.tables.Users;
import top.zbeboy.isy.domain.tables.UsersType;


/**
 * Convenience access to all tables in isy
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table isy.application
	 */
	public static final Application APPLICATION = top.zbeboy.isy.domain.tables.Application.APPLICATION;

	/**
	 * The table isy.authorities
	 */
	public static final Authorities AUTHORITIES = top.zbeboy.isy.domain.tables.Authorities.AUTHORITIES;

	/**
	 * The table isy.college
	 */
	public static final College COLLEGE = top.zbeboy.isy.domain.tables.College.COLLEGE;

	/**
	 * The table isy.college_application
	 */
	public static final CollegeApplication COLLEGE_APPLICATION = top.zbeboy.isy.domain.tables.CollegeApplication.COLLEGE_APPLICATION;

	/**
	 * The table isy.college_role
	 */
	public static final CollegeRole COLLEGE_ROLE = top.zbeboy.isy.domain.tables.CollegeRole.COLLEGE_ROLE;

	/**
	 * The table isy.department
	 */
	public static final Department DEPARTMENT = top.zbeboy.isy.domain.tables.Department.DEPARTMENT;

	/**
	 * The table isy.files
	 */
	public static final Files FILES = top.zbeboy.isy.domain.tables.Files.FILES;

	/**
	 * The table isy.graduation_practice_college
	 */
	public static final GraduationPracticeCollege GRADUATION_PRACTICE_COLLEGE = top.zbeboy.isy.domain.tables.GraduationPracticeCollege.GRADUATION_PRACTICE_COLLEGE;

	/**
	 * The table isy.graduation_practice_company
	 */
	public static final GraduationPracticeCompany GRADUATION_PRACTICE_COMPANY = top.zbeboy.isy.domain.tables.GraduationPracticeCompany.GRADUATION_PRACTICE_COMPANY;

	/**
	 * The table isy.graduation_practice_unify
	 */
	public static final GraduationPracticeUnify GRADUATION_PRACTICE_UNIFY = top.zbeboy.isy.domain.tables.GraduationPracticeUnify.GRADUATION_PRACTICE_UNIFY;

	/**
	 * The table isy.internship_apply
	 */
	public static final InternshipApply INTERNSHIP_APPLY = top.zbeboy.isy.domain.tables.InternshipApply.INTERNSHIP_APPLY;

	/**
	 * The table isy.internship_change_company_history
	 */
	public static final InternshipChangeCompanyHistory INTERNSHIP_CHANGE_COMPANY_HISTORY = top.zbeboy.isy.domain.tables.InternshipChangeCompanyHistory.INTERNSHIP_CHANGE_COMPANY_HISTORY;

	/**
	 * The table isy.internship_change_history
	 */
	public static final InternshipChangeHistory INTERNSHIP_CHANGE_HISTORY = top.zbeboy.isy.domain.tables.InternshipChangeHistory.INTERNSHIP_CHANGE_HISTORY;

	/**
	 * The table isy.internship_college
	 */
	public static final InternshipCollege INTERNSHIP_COLLEGE = top.zbeboy.isy.domain.tables.InternshipCollege.INTERNSHIP_COLLEGE;

	/**
	 * The table isy.internship_company
	 */
	public static final InternshipCompany INTERNSHIP_COMPANY = top.zbeboy.isy.domain.tables.InternshipCompany.INTERNSHIP_COMPANY;

	/**
	 * The table isy.internship_file
	 */
	public static final InternshipFile INTERNSHIP_FILE = top.zbeboy.isy.domain.tables.InternshipFile.INTERNSHIP_FILE;

	/**
	 * The table isy.internship_journal
	 */
	public static final InternshipJournal INTERNSHIP_JOURNAL = top.zbeboy.isy.domain.tables.InternshipJournal.INTERNSHIP_JOURNAL;

	/**
	 * The table isy.internship_regulate
	 */
	public static final InternshipRegulate INTERNSHIP_REGULATE = top.zbeboy.isy.domain.tables.InternshipRegulate.INTERNSHIP_REGULATE;

	/**
	 * The table isy.internship_release
	 */
	public static final InternshipRelease INTERNSHIP_RELEASE = top.zbeboy.isy.domain.tables.InternshipRelease.INTERNSHIP_RELEASE;

	/**
	 * The table isy.internship_release_science
	 */
	public static final InternshipReleaseScience INTERNSHIP_RELEASE_SCIENCE = top.zbeboy.isy.domain.tables.InternshipReleaseScience.INTERNSHIP_RELEASE_SCIENCE;

	/**
	 * The table isy.internship_teacher_distribution
	 */
	public static final InternshipTeacherDistribution INTERNSHIP_TEACHER_DISTRIBUTION = top.zbeboy.isy.domain.tables.InternshipTeacherDistribution.INTERNSHIP_TEACHER_DISTRIBUTION;

	/**
	 * The table isy.internship_type
	 */
	public static final InternshipType INTERNSHIP_TYPE = top.zbeboy.isy.domain.tables.InternshipType.INTERNSHIP_TYPE;

	/**
	 * The table isy.nation
	 */
	public static final Nation NATION = top.zbeboy.isy.domain.tables.Nation.NATION;

	/**
	 * The table isy.organize
	 */
	public static final Organize ORGANIZE = top.zbeboy.isy.domain.tables.Organize.ORGANIZE;

	/**
	 * The table isy.persistent_logins
	 */
	public static final PersistentLogins PERSISTENT_LOGINS = top.zbeboy.isy.domain.tables.PersistentLogins.PERSISTENT_LOGINS;

	/**
	 * The table isy.political_landscape
	 */
	public static final PoliticalLandscape POLITICAL_LANDSCAPE = top.zbeboy.isy.domain.tables.PoliticalLandscape.POLITICAL_LANDSCAPE;

	/**
	 * The table isy.role
	 */
	public static final Role ROLE = top.zbeboy.isy.domain.tables.Role.ROLE;

	/**
	 * The table isy.role_application
	 */
	public static final RoleApplication ROLE_APPLICATION = top.zbeboy.isy.domain.tables.RoleApplication.ROLE_APPLICATION;

	/**
	 * The table isy.schema_version
	 */
	public static final SchemaVersion SCHEMA_VERSION = top.zbeboy.isy.domain.tables.SchemaVersion.SCHEMA_VERSION;

	/**
	 * The table isy.school
	 */
	public static final School SCHOOL = top.zbeboy.isy.domain.tables.School.SCHOOL;

	/**
	 * The table isy.science
	 */
	public static final Science SCIENCE = top.zbeboy.isy.domain.tables.Science.SCIENCE;

	/**
	 * The table isy.staff
	 */
	public static final Staff STAFF = top.zbeboy.isy.domain.tables.Staff.STAFF;

	/**
	 * The table isy.student
	 */
	public static final Student STUDENT = top.zbeboy.isy.domain.tables.Student.STUDENT;

	/**
	 * The table isy.system_log
	 */
	public static final SystemLog SYSTEM_LOG = top.zbeboy.isy.domain.tables.SystemLog.SYSTEM_LOG;

	/**
	 * The table isy.system_mailbox
	 */
	public static final SystemMailbox SYSTEM_MAILBOX = top.zbeboy.isy.domain.tables.SystemMailbox.SYSTEM_MAILBOX;

	/**
	 * The table isy.system_sms
	 */
	public static final SystemSms SYSTEM_SMS = top.zbeboy.isy.domain.tables.SystemSms.SYSTEM_SMS;

	/**
	 * The table isy.users
	 */
	public static final Users USERS = top.zbeboy.isy.domain.tables.Users.USERS;

	/**
	 * The table isy.users_type
	 */
	public static final UsersType USERS_TYPE = top.zbeboy.isy.domain.tables.UsersType.USERS_TYPE;
}
