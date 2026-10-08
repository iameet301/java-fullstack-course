package exception;

public class UncheckedExample {
    public static void main(String[] args) {
        // NullPointerException: Calling a method on a null reference
        String itemName = null;
        // System.out.println(itemName.length()); // Throws NullPointerException

        // ArithmeticException: Illegal math operation
        int stock = 10;
        int zeroCount = 0;
        // int result = stock / zeroCount; // Throws ArithmeticException: / by zero

        // ArrayIndexOutOfBoundsException: Accessing an invalid index
        int[] scores = {90, 85, 78};
        System.out.println(scores[5]); // Throws ArrayIndexOutOfBoundsException: Index 5 out of bounds
    }
}
