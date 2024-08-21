
package ams;

import java.util.ArrayList;


public class StudentManagement {
    
    private static ArrayList <Student> students = new ArrayList<>();
    
    public void addStudent (String studentId , String studentName , String studentPhone , String studentAddress){
    
        Student student = new Student(studentId, studentName, studentPhone, studentAddress);
        students.add(student);
        System.out.println("Student added successfully.");
    }
    
    public void updateStudent (String studentId , String studentName , String studentPhone , String studentAddress){
        for (Student student : students){
            if (student.getS_id().equals(studentId)) {
                student.setName(studentName);
                student.setPh_no(studentPhone);
                student.setEmail_address(studentAddress);
                System.out.println("Student Updated Successfully.");
                return;
            } else {
                System.out.println("Student not found.");
            }
        }
    }
    
    public void deleteStudent (String studentName){
        for (Student student : students){
            if (student.getName().equals(studentName)) {
                students.remove(student);
                System.out.println("Student Deleted Successfully.");
            }
        }
    }
    
    public void listStudents(){
        System.out.println("Students Available : ");
        for (Student student : students){
            System.out.println(student.getS_id() + "-" + student.getName() );
        }
    }
    
}
