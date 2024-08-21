
package ams;

import java.util.ArrayList;


public class CourseManagement {
    
    private static ArrayList <Course> courses = new ArrayList<>();
    
    public static void createCourse (String courseCode , String name){
        
        Course course = new Course(courseCode, name);
        courses.add(course);
        System.out.println("Course added successfully.");
        
    }
    
    public static void updateCourse (String c_Code , String newName){
        for (Course course : courses){
            if (course.getC_code().equals(c_Code)) {
                course.setName(newName);
                System.out.println("Course Modified Successfully.");
                return;
            } else {
                System.out.println("Following course was not found.");
            }
        }
    }
    
    public static void deleteCourse (String cd_Code){
        for (Course course : courses){
            if (course.getC_code().equals(cd_Code)) {
                courses.remove(course);
                System.out.println("Course removed successfully.");
            }
        }
    }
    
    public static void listCourses () {
        for (Course course : courses){
            System.out.println(course.getC_code() + " " + course.getName());
        }
    }
    
}
