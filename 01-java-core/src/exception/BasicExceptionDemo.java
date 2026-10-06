package exception;

public class BasicExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Throws ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero -> " + e.getMessage());
        } finally {
            System.out.println("Cleanup: Execution completed.");
        }
    }
}
