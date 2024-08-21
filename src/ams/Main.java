import ams.AttendanceManagement;
import ams.CourseEnrollmentManagement;
import ams.CourseManagement;
import ams.StudentManagement;
import ams.TeacherManagement;
import ams.UserManagement;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Admin and Teacher Account Management
        UserManagement.adminSignup("ahmad", "pass123");
        UserManagement.teacherSignup("Sir Bilal Arif", "teachpass");

        // Course Management
        CourseManagement.createCourse("CCL120", "Introduction to Computer Science");
        CourseManagement.listCourses();

        // Student Management
        StudentManagement s1 = new StudentManagement();
        s1.addStudent("2023065123", "Ali Akbar", "1234567890", "aliakbar@hotmail.com");
        s1.listStudents();

        // Teacher Management
        TeacherManagement.addTeacher("T1", "Sir Amir", "50000", "Computer Science", "Wapda Town", "0987654321");
        TeacherManagement.listTeachers();

        // Course Enrollment
        CourseEnrollmentManagement.enrollStudent("CCL120", "2023065123", new Date(), "10:00 AM", "Pending");
        CourseEnrollmentManagement.approveEnrollment("CCL120", "2023065123");
        CourseEnrollmentManagement.listEnrollments();

        // Attendance Management
        AttendanceManagement.MarkAttendance(true, new Date(), "10:15 AM");
        AttendanceManagement.viewAttendance();
    }
}
