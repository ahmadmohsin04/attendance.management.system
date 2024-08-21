
package ams;
import java.util.HashMap;
public class UserManagement {
    
    private static HashMap <String , String> adminAccounts = new HashMap<>();
    private static HashMap <String , String> teacherAccounts = new HashMap<>();
    
    // Admin signup 
    
    public static void adminSignup (String username , String password){
        adminAccounts.put(username, password);
        System.out.println("Account Created Successfully.");
    }
    
    // Admin login
    public static boolean adminLogin (String username , String password){
        return adminAccounts.getOrDefault(username, "").equals(password);
    }
    
    // Teacher Signup
    
    public static void teacherSignup (String username , String password){
        teacherAccounts.put(username, password);
        System.out.println("Account Created Successfully.");
    }
    
    public static boolean teacherLogin (String username , String password){
        return teacherAccounts.getOrDefault(username, "").equals(password);
    }
    
}
