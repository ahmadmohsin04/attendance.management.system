
package ams;
import javax.swing.JTextArea;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TeacherManagement {
    private static ArrayList<Teacher> teachers = new ArrayList<>();

    public void addTeacher(String emp_code, String name, String salary, String depart, String address, String ph_no) {
        Teacher teacher = new Teacher(emp_code, name, salary, depart, address, ph_no);
        teachers.add(teacher);
        JOptionPane j = new JOptionPane();
        JOptionPane.showMessageDialog(j, "Teacher added successfully.");
    }

    public void updateTeacher(String emp_code, String newName, String newSalary, String newDepart, String newAddress, String newPh_no) {
        for (Teacher teacher : teachers) {
            if (teacher.getEmp_code().equals(emp_code)) {
                teacher.setName(newName);
                teacher.setSalary(newSalary);
                teacher.setDepart(newDepart);
                teacher.setAddress(newAddress);
                teacher.setPh_no(newPh_no);
                JOptionPane j = new JOptionPane();
                JOptionPane.showMessageDialog(j, "Teacher updated successfully.");
                return;
            } else {
                JOptionPane j = new JOptionPane();
                JOptionPane.showMessageDialog(j, "Teacher with the following code " + emp_code +" was not found.");
            }
        }
    }

    public void deleteTeacher(String emp_code) {
        teachers.removeIf(teacher -> teacher.getEmp_code().equals(emp_code));
        JOptionPane j = new JOptionPane();
        JOptionPane.showMessageDialog(j, "Teacher deleted successfully.");
    }

    public void listTeachers(JTextArea area) {
        area.setText("");
        for (Teacher teacher : teachers) {
            area.append(teacher.getEmp_code() + " - " + teacher.getName() + "\n");
        }
    }
}

