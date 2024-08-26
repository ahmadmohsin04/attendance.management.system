
package ams;
import javax.swing.JTextArea;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class CourseEnrollmentManagement {
    
    private static ArrayList <Course_Enrollment> courseEnrollManage = new ArrayList<>();
    
    public void enrollStudent (String courseCode , String sid , LocalDate date , String time , String status){
        Course_Enrollment enrollment = new Course_Enrollment(courseCode, sid, date, time, status);
        courseEnrollManage.add(enrollment);
        JOptionPane j = new JOptionPane();
        JOptionPane.showMessageDialog(j, "Student enrolled successfully.");
    }
    
    public void approveEnrollment (String courseCode , String studentId){
        for(Course_Enrollment course : courseEnrollManage){
            if (course.getC_code().equals(courseCode) && course.getSid().equals(studentId)) {
                course.setStatus("Approved.");
                JOptionPane j = new JOptionPane();
                JOptionPane.showMessageDialog(j, "Enrollment approved for student with id : " + studentId + " , in course : " + courseCode);
                return; 
            } else {
                JOptionPane j = new JOptionPane();
                JOptionPane.showMessageDialog(j, "Course code or Student id not found.");
            }
        }
    }
    
    public void listEnrollments (JTextArea area){
        area.setText("");
        for(Course_Enrollment course : courseEnrollManage){
            area.append("Course : " + course.getC_code() + ", Student : " + course.getSid() + ", Date : " + course.getDate() + ", Status : " + course.getStatus()+"\n");
        }
    }
    
    
}
