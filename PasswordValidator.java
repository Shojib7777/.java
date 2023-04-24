import java.util.Scanner; 
 
public class PasswordValidator { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
         
        System.out.print("Enter password: "); 
        String password = input.nextLine(); 
         
        try { 
            if (password.length() < 8) { 
                throw new Exception("Password must be at least 8 characters long."); 
            } 
             
            boolean containsNumber = false; 
            for (int i = 0; i < password.length(); i++) { 
                if (Character.isDigit(password.charAt(i))) { 
                    containsNumber = true; 
                    break; 
                } 
            } 
             
            if (!containsNumber) { 
                throw new Exception("Password must contain at least one number."); 
            } 
             
            System.out.println("Password is valid."); 
             
        } catch (Exception e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
    } 
}