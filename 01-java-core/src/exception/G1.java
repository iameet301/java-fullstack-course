package exception;

public class G1 {
    public static int getResult() {
        try {
            int a = 10 / 2;
            return 100;
        } catch (ArithmeticException e) {
            return 200;
        } finally {
            return 300;
        }
    }

    public static void main(String[] args) {
        System.out.println("Result: " + getResult());
    }
}
