
package ams;
import javax.swing.JTextArea;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CourseManagement {
    
    private static ArrayList <Course> courses = new ArrayList<>();
    
    public void createCourse (String courseCode , String name){
        
        Course course = new Course(courseCode, name);
        courses.add(course);
        System.out.println("Course added successfully.");
        
    }
    
    public void updateCourse (String c_Code , String newName){
        for (Course course : courses){
            if (course.getC_code().equals(c_Code)) {
                course.setName(newName);
                JOptionPane j = new JOptionPane();
                JOptionPane.showMessageDialog(j, "Course updated successfully.");
                return;
            } else {
                JOptionPane j2 = new JOptionPane();
                JOptionPane.showMessageDialog(j2, "Course code not found.");
            }
        }
    }
    
    public void deleteCourse (String cd_Code){
        for (Course course : courses){
            if (course.getC_code().equals(cd_Code)) {
                courses.remove(course);
                JOptionPane j2 = new JOptionPane();
                JOptionPane.showMessageDialog(j2, "Course deleted successfully.");
            } else {
                JOptionPane j = new JOptionPane();
                JOptionPane.showMessageDialog(j, "Course code not found.");
            }
        }
    }
    
    public void listCourses (JTextArea courseSystem) {
        courseSystem.setText("");
        for (Course course : courses){
            courseSystem.append(course.getC_code() + "-" + course.getName() + "\n");
        }
    }
    
}
