
package ams;

public class Student {
    
    private String s_id;
    private String name;
    private String ph_no;
    private String email_address;

    public Student(String s_id, String name, String ph_no, String email_address) {
        this.s_id = s_id;
        this.name = name;
        this.ph_no = ph_no;
        this.email_address = email_address;
    }

    public String getS_id() {
        return s_id;
    }

    public String getName() {
        return name;
    }

    public String getPh_no() {
        return ph_no;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
    
    
    
}
