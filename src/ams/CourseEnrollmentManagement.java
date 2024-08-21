
package ams;

import java.util.ArrayList;
import java.util.Date;

public class CourseEnrollmentManagement {
    
    private static ArrayList <Course_Enrollment> courseEnrollManage = new ArrayList<>();
    
    public static void enrollStudent (String courseCode , String sid , Date date , String time , String status){
        Course_Enrollment enrollment = new Course_Enrollment(courseCode, sid, date, time, status);
        courseEnrollManage.add(enrollment);
        System.out.println("Course Enrolled Successfully.");
    }
    
    public static void approveEnrollment (String courseCode , String studentId){
        for(Course_Enrollment course : courseEnrollManage){
            if (course.getC_code().equals(courseCode) && course.getSid().equals(studentId)) {
                course.setStatus("Approved.");
                System.out.println("Enrollment approved for student with id : " + studentId + " , in course : " + courseCode);
                return; 
            } else {
                System.out.println("Enrollment not found.");
            }
        }
    }
    
    public static void listEnrollments (){
        for(Course_Enrollment course : courseEnrollManage){
            System.out.println("Course : " + course.getC_code() + "Student : " + course.getSid() + "Date : " + course.getDate() + "Status : " + course.getStatus());
        }
    }
    
    
}
