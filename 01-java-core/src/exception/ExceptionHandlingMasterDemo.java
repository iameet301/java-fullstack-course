package exception;

import java.util.Scanner;

public class ExceptionHandlingMasterDemo {

    // 1. Custom Checked Exception defined as a static nested class[cite: 9]
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message); // Stores message in Throwable[cite: 4]
        }
    }

    // 2. Method demonstrating 'throw' and 'throws'[cite: 2, 9, 10]
    public static void validateVoter(int age) throws InvalidAgeException {
        if (age < 18) {
            // 'throw' explicitly instantiates and triggers the exception[cite: 9, 10]
            throw new InvalidAgeException("Age " + age + " is ineligible to vote.");
        }
        System.out.println("Voter eligible.");
    }

    // 3. Method demonstrating the 'finally' return override trap[cite: 15]
    public static int testReturnPrecedence() {
        try {
            return 10;
        } finally {
            // Overrides and discards the return value from the try block[cite: 15]
            return 20;
        }
    }

    public static void main(String[] args) {

        // --- Demo 1: Basic try-catch-finally ---
        try {
            System.out.println("--- 1. Testing try-catch-finally ---");
            int division = 100 / 0; // Throws ArithmeticException[cite: 1, 3]
            System.out.println("Result: " + division);
        } catch (ArithmeticException e) {
            // Catches runtime arithmetic failure[cite: 3, 11]
            System.err.println("Caught Exception: " + e.getMessage()); //[cite: 4]
        } finally {
            // Always executes whether an exception occurs or not[cite: 10]
            System.out.println("Finally block executed for cleanup.[cite: 10]");
        }

        // --- Demo 2: Multi-Catch Block (Java 7+) ---
        try {
            System.out.println("\n--- 2. Testing Multi-Catch ---");
            int[] numbers = new int[3];
            numbers[10] = 50; // Throws ArrayIndexOutOfBoundsException[cite: 3]
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Handles multiple disjoint exceptions; 'e' is implicitly final
            System.err.println("Multi-Catch handled: " + e.getClass().getSimpleName());
        }

        // --- Demo 3: Custom Exception & Throws Delegation ---
        try {
            System.out.println("\n--- 3. Testing Custom Exception ---");
            validateVoter(16); // Caller is forced to handle checked exception[cite: 5, 9]
        } catch (InvalidAgeException e) {
            System.err.println("Handled Custom Exception: " + e.getMessage()); //[cite: 4]
        }

        // --- Demo 4: try-with-resources (AutoCloseable) ---
        System.out.println("\n--- 4. Testing try-with-resources ---");
        // Resources declared in parentheses close automatically without a finally block[cite: 14, 15]
        try (Scanner scanner = new Scanner("Hello Tech Interview")) { //[cite: 14]
            System.out.println("Read token: " + scanner.next());
        } // scanner.close() is called automatically here[cite: 15]

        // --- Demo 5: Return Precedence Trap ---
        System.out.println("\n--- 5. Testing Return Precedence ---");
        int returnedValue = testReturnPrecedence();
        System.out.println("Returned value (finally wins): " + returnedValue); // Prints 20[cite: 15]

        System.out.println("\nProgram terminated smoothly without abnormal crash.[cite: 1]");
    }
}