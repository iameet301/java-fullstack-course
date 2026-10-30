package functionalInterface;

import java.util.Optional;

public class MoreOptionalExamples {
    public static void main(String[] args) {


        Optional<Double> cartBill = Optional.of(1500.0);

        Double finalPayable = cartBill
                .filter(bill -> bill >= 1000.0)      // Predicate: Is 1500 >= 1000? (true)
                .map(bill -> bill - (bill * 0.10))   // Function:  1500 - 150 = 1350.0
                .orElse(0.0);                        // Fallback if filter was false

        System.out.println("Example 1 (Discounted Bill): Rs." + finalPayable);


        // =================================================================
        // EXAMPLE 2: Safe Null Handling with ofNullable() (Promo Code Check)
        // =================================================================
        String userPromoInput = null; // Imagine user left the text box blank!

        // Optional.ofNullable() safely handles null without crashing
        Optional<String> promoBox = Optional.ofNullable(userPromoInput);

        String appliedCode = promoBox
                .filter(code -> code.startsWith("PUNE")) // Skipped safely because box is empty!
                .map(String::toLowerCase)                // Skipped safely!
                .orElse("DEFAULT_WELCOME_50");           // Returns fallback because input was null

        System.out.println("Example 2 (Applied Promo):   " + appliedCode);


      
        Optional<Integer> accountBalance = Optional.of(5000);

        Integer remainingBalance = accountBalance
                .filter(bal -> bal >= 2000)          
                .map(bal -> bal - 2000)              
                .orElseThrow(() -> new RuntimeException("Insufficient Balance!")); // Supplier<Exception>

        System.out.println("Example 3 (New Balance):     Rs." + remainingBalance);
    }
}