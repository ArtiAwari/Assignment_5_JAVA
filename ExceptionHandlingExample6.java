//Use of "throw" block in exception handling
import java.util.Scanner;

class ExceptionHandlingExample6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Scanner object to take input from user

        int a = sc.nextInt(); // Read first integer
        int b = sc.nextInt(); // Read second integer

        // Check if denominator is zero
        if (b == 0) {
            // Throw an ArithmeticException if division by zero is attempted
            throw new ArithmeticException("You cannot divide a number by zero");
        } else {
            // Perform division when denominator is not zero
            int c = a / b;
            System.out.println("Division is: " + c);
        }

        // Perform addition regardless of division result
        System.out.println("Addition is: " + (a + b));

        sc.close(); // Close the scanner 
    }
}
