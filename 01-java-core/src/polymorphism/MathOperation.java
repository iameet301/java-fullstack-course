package polymorphism;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b); // Single abstract method

    // Default method is allowed
    default void printInfo() {
        System.out.println("Executing operation...");
    }
}

