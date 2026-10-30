package functionalInterface;



import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Default_Static_Methods {
    public static void main(String[] args) {

        // ==========================================
        // 1. PREDICATE: default (and, or, negate) & static (isEqual)
        // ==========================================
        Predicate<Integer> isGreaterThan10 = num -> num > 10;
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("--- Predicate Methods ---");
        System.out.println(isGreaterThan10.and(isEven).test(20)); // true
        System.out.println(isGreaterThan10.and(isEven).test(5));  // false
        System.out.println(isGreaterThan10.and(isEven).test(21)); // false

        System.out.println(isGreaterThan10.or(isEven).test(2));   // true
        System.out.println(isGreaterThan10.or(isEven).test(15));  // true
        System.out.println(isGreaterThan10.negate().test(15));    // false

        Predicate<String> lang = Predicate.isEqual("Java");
        System.out.println(lang.test("Java"));   // true
        System.out.println(lang.test("python")); // false

        // ==========================================
        // 2. FUNCTION: default (andThen, compose) & static (identity)
        // ==========================================
        System.out.println("\n--- Function Methods ---");
        Function<Integer, Integer> doubleIt = n -> n * 2;
        Function<Integer, Integer> cubeIt = n -> n * n * n;

        // andThen(): Runs doubleIt FIRST (2 * 2 = 4), then cubeIt (4 * 4 * 4 = 64)
        System.out.println("andThen(2): " + doubleIt.andThen(cubeIt).apply(2)); // 64

        // compose(): Runs cubeIt FIRST (2 * 2 * 2 = 8), then doubleIt (8 * 2 = 16)
        System.out.println("compose(2): " + doubleIt.compose(cubeIt).apply(2)); // 16

        // Static method identity(): Always returns the exact same input value
        Function<String, String> sameValue = Function.identity();
        System.out.println("identity:   " + sameValue.apply("Meet")); // Meet

        // ==========================================
        // 3. CONSUMER: default (andThen)
        // ==========================================
        System.out.println("\n--- Consumer Methods ---");
        Consumer<String> c1 = name -> System.out.println("Step 1: Welcome " + name);
        Consumer<String> c2 = name -> System.out.println("Step 2: Saving " + name + " to database");

        // Chains both consumers in sequence from left to right
        c1.andThen(c2).accept("Meet");
    }
}
