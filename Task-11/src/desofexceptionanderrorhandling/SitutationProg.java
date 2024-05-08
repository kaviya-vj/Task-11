package desofexceptionanderrorhandling;
import java.util.Scanner;

public class SitutationProg {
    private static final String CORRECT_PASSWORD = "password123"; // Change this to your actual correct password
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        
        try {
            login(username, password);
            System.out.println("Login successful!");
        } catch (InvalidPasswordException e) {
            System.out.println("Invalid password. Please try again.");
        }
        
        scanner.close();
    }
    
    private static void login(String username, String password) throws InvalidPasswordException {
        if (!password.equals(CORRECT_PASSWORD)) {
            throw new InvalidPasswordException();
        }
        // Additional login logic can go here
    }
    
    // Custom exception class for invalid passwords
    static class InvalidPasswordException extends Exception {
        // You can add custom messages or behavior specific to this exception class if needed
    }
}
