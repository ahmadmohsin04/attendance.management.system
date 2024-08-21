
package ams;

public class Course {
    
    private String c_code;
    private String name;

    public Course(String c_code, String name) {
        this.c_code = c_code;
        this.name = name;
    }

    public String getC_code() {
        return c_code;
    }

    public String getName() {
        return name;
    }

    public void setC_code(String c_code) {
        this.c_code = c_code;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
