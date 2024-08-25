
package ams;
import javax.swing.JTextArea;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class StudentManagement {
    
    private static ArrayList <Student> students = new ArrayList<>();
    
    public void addStudent (String studentId , String studentName , String studentPhone , String studentAddress){
    
        Student student = new Student(studentId, studentName, studentPhone, studentAddress);
        students.add(student);
        JOptionPane j = new JOptionPane();
        JOptionPane.showMessageDialog(j, "Student added successfully.");
    }
    
    public void updateStudent (String studentId , String studentName , String studentPhone , String studentAddress){
        for (Student student : students){
            if (student.getS_id().equals(studentId)) {
                student.setName(studentName);
                student.setPh_no(studentPhone);
                student.setEmail_address(studentAddress);
                JOptionPane j = new JOptionPane();
                JOptionPane.showMessageDialog(j, "Student has been updated.");
                return;
            } else {
                JOptionPane j2 = new JOptionPane();
                JOptionPane.showMessageDialog(j2, "Student id not found...");
            }
        }
    }
    
    public void deleteStudent (String studentName){
        for (Student student : students){
            if (student.getName().equalsIgnoreCase(studentName)) {
                students.remove(student);
                JOptionPane j = new JOptionPane();
                JOptionPane.showMessageDialog(j, "Student deleted successfully.");
            } else {
                JOptionPane j2 = new JOptionPane();
                JOptionPane.showMessageDialog(j2, "Student not found...");
            }
        }
    }
    
    public void listStudents(JTextArea area){
        area.setText("");
        for (Student student : students){
            area.append(student.getS_id() + "-" + student.getName() + "\n");
        }
    }
    
}
