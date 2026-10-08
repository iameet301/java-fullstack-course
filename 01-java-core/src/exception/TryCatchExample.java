package exception;

public class TryCatchExample {
    public static void processOrder(String quantityStr) {
        try {
            int quantity = Integer.parseInt(quantityStr); // Might throw NumberFormatException
            int unitPrice = 100 / quantity;               // Might throw ArithmeticException
            System.out.println("Unit Price: " + unitPrice);
        } catch (NumberFormatException | ArithmeticException ex) {
            // Multi-catch block for cleaner code
            System.out.println("Invalid calculation: " + ex.getMessage());
        } catch (Exception ex) {
            // General catch-all fallback
            System.out.println("Unexpected error: " + ex.getMessage());
        } finally {
            System.out.println("Order transaction cleanup completed.");
        }
    }
}
