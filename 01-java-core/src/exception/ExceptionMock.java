package exception;

public class ExceptionMock {
    public static int calculate() {
        int result = 10;
        try {
            int divide = result / 0;
            return result;
        } catch (ArithmeticException e) {
            result = 20;
            return result;
        } finally {
            result = 30;
            System.out.println("Finally block executed with result: " + result);
        }
    }

    public static void main(String[] args) {
        System.out.println("Returned value: " + calculate());
    }
}
