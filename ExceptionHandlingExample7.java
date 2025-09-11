// Example to demonstrate use of try-catch-finally block
import java.util.Scanner;

class ExceptionHandlingExample7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Scanner to take user input

        int a = sc.nextInt(); // First number
        int b = sc.nextInt(); // Second number

        try {
            // Risky operation: division (may cause ArithmeticException if b=0)
            int c = a / b;
            System.out.println("Division is: " + c);
        } 
        catch (Exception e) {
            // This block executes if an exception occurs inside try
            System.out.println("You cannot divide number by zero! ---- " + e);
        } 
        finally {
            // This block always executes whether exception occurs or not
            System.out.println("Inputs are: " + a + " & " + b);
            System.out.println("Addition is: " + (a + b));
        }

        sc.close(); // Closing scanner (good practice)
    }
}
