
package ams;

import java.util.ArrayList;
import java.util.Date;


public class AttendanceManagement {
    private static ArrayList <Attendance> attendance = new ArrayList<>();
    
    public static void MarkAttendance (Boolean mark , Date date , String time){
       Attendance attend = new Attendance(mark, date, time);
       attendance.add(attend);
        System.out.println("Attendance Marked Successfully.");
    }
    
    public static void viewAttendance (){
        for (Attendance attend : attendance){
            System.out.println("Date : " + attend.getDate() + ", Time : " + attend.getTime() + ", Mark : " + (attend.isAttendance_mark() ? "Present" : "Absent"));
        }
    }
    
}
