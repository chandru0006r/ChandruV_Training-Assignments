package JavaAssignment4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegrexFunction{
    public static void main(String[] args) {
        String pattern = "^(\\+\\d{1,3}-)?\\d{3}-\\d{3}-\\d{4}$";
        Pattern r = Pattern.compile(pattern);
        
        Scanner scanner = new Scanner(System.in);
        String input = "";
        
        while (true) {
            System.out.println("\nEnter a phone number to validate (or type 'exit' to quit):");
            input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            
            validate(r, input);
        }
        
        scanner.close();
        System.out.println("Validator closed.");
    }
    
    public static void validate(Pattern r, String phoneNumber) {
        Matcher m = r.matcher(phoneNumber);
        if (m.matches()) {
            System.out.println("Phone number " + phoneNumber + " is valid.");
        } else {
            System.out.println("Phone number " + phoneNumber + " is invalid.");
        }
    }
}