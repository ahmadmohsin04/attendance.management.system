
package ams;

import java.util.Date;

public class Attendance {
    
    private boolean attendance_mark;
    private Date date;
    private String time;

    public Attendance(boolean attendance_mark, Date date, String time) {
        this.attendance_mark = attendance_mark;
        this.date = date;
        this.time = time;
    }

    public boolean isAttendance_mark() {
        return attendance_mark;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setAttendance_mark(boolean attendance_mark) {
        this.attendance_mark = attendance_mark;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    

  
    
    
}
