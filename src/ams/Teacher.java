
package ams;

public class Teacher {
    
 
    private String emp_code;
    private String name;
    private String salary;
    private String depart;
    private String address;
    private String ph_no;

    public Teacher(String emp_code, String name, String salary, String depart, String address, String ph_no) {
        this.emp_code = emp_code;
        this.name = name;
        this.salary = salary;
        this.depart = depart;
        this.address = address;
        this.ph_no = ph_no;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getDepart() {
        return depart;
    }

    public String getAddress() {
        return address;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }
}