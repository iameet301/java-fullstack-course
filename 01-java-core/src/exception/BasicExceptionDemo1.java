package exception;

public class BasicExceptionDemo1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("1. Inside try block");
            
            // Scenario A: Division by zero (ArithmeticException)
            int result = numbers[1] / 0; 
            System.out.println("Result: " + result);

            // Scenario B: Index out of range (bypassed once line above throws)
            System.out.println(numbers[5]);

        } catch (ArithmeticException e) {
            // Catches the specific math error[cite: 3, 11]
            System.err.println("Caught ArithmeticException: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            // Catches array index boundary errors[cite: 3, 11]
            System.err.println("Caught Index Error: " + e.getMessage());

        } catch (Exception e) {
            // Parent fallback catch-all block[cite: 3, 11]
            System.err.println("Caught General Exception: " + e.getMessage());

        } finally {
            // Always executes regardless of an exception occurring or being caught[cite: 10]
            System.out.println("2. Finally block: Cleanup and resource release executed[cite: 10].");
        }

        System.out.println("3. Program continues execution smoothly[cite: 1].");
    }
}
