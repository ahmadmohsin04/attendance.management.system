
package ams;

import java.util.Date;


public class Section {
    
    private String name;
    private String day;
    private String room;

    public Section(String name, String day, String room) {
        this.name = name;
        this.day = day;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public String getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    
    
}
