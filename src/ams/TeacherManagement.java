
package ams;

import java.util.ArrayList;

public class TeacherManagement {
    private static ArrayList<Teacher> teachers = new ArrayList<>();

    public static void addTeacher(String emp_code, String name, String salary, String depart, String address, String ph_no) {
        Teacher teacher = new Teacher(emp_code, name, salary, depart, address, ph_no);
        teachers.add(teacher);
        System.out.println("Teacher added successfully.");
    }

    public static void updateTeacher(String emp_code, String newName, String newSalary, String newDepart, String newAddress, String newPh_no) {
        for (Teacher teacher : teachers) {
            if (teacher.getEmp_code().equals(emp_code)) {
                teacher.setName(newName);
                teacher.setSalary(newSalary);
                teacher.setDepart(newDepart);
                teacher.setAddress(newAddress);
                teacher.setPh_no(newPh_no);
                System.out.println("Teacher updated successfully.");
                return;
            }
        }
        System.out.println("Teacher not found: " + emp_code);
    }

    public static void deleteTeacher(String emp_code) {
        teachers.removeIf(teacher -> teacher.getEmp_code().equals(emp_code));
        System.out.println("Teacher deleted successfully.");
    }

    public static void listTeachers() {
        System.out.println("Teachers Available:");
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getEmp_code() + " - " + teacher.getName());
        }
    }
}

