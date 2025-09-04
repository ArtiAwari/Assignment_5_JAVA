public class ExceptionHandlingExample1 {
    public static void main(String args[]) {
        int a = 19, b = 0, c = a + b;
        System.out.println(" Addition is: " + c);
        int d = a / b;  // This will cause ArithmeticException
        System.out.println("Division is: " + d);
    }
}
