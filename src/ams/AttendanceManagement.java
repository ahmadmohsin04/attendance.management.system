
package ams;
import javax.swing.JTextArea;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class AttendanceManagement {
    private static ArrayList <Attendance> attendance = new ArrayList<>();
    
    public void MarkAttendance (Boolean mark , LocalDate date , String time){
       Attendance attend = new Attendance(mark, date, time);
       attendance.add(attend);
        JOptionPane j = new JOptionPane();
        JOptionPane.showMessageDialog(j, "Attendance marked successfully.");
    }
    
    public void viewAttendance (JTextArea area){
        area.setText("");
        for (Attendance attend : attendance){
            area.append("Date : " + attend.getDate() + ", Time : " + attend.getTime() + ", Mark : " + (attend.isAttendance_mark() ? "Present" : "Absent" + "\n"));
        }
    }
    
}
