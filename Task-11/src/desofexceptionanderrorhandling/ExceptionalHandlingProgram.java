package desofexceptionanderrorhandling;

import java.util.Scanner;

public class ExceptionalHandlingProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the integer value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the integer value of b: ");
        int b = sc.nextInt();

        try {
            int c = divide(a, b);
            System.out.println("The result is: " + c);
            
        } catch (ArithmeticException ae) {
          ae.printStackTrace();
        }

        // Code execution continues even if an exception occurred
        System.out.println("The program gets executed");
    }

    public static int divide(int dividend, int divisor) {
      
    	if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be Zero");
        }
        
    	return dividend / divisor;
    }
}
