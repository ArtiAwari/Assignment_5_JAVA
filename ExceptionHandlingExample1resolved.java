public class ExceptionHandlingExample1resolved {
    public static void main(String args[]) {
        int a = 19, b = 0;   // declare and initialize variables
        int c = a + b;       // perform addition
        System.out.println("Addition is: " + c);  // print addition result

        try {
            int d = a / b;   // this will throw ArithmeticException (division by zero)
            System.out.println("Division is: " + d);  // print division result
        } catch (Exception w) {   // catch the exception
            System.out.println("We cannot devide number by zero " + w);  // print error message
        }

        int e = a - b;   // perform subtraction
        System.out.println("Substraction is: " + e);  // print subtraction result
    }
}
