package exception;

public class MiniExceptionDemo {
    // 'throws' delegates, 'throw' creates the exception instance[cite: 2, 10]
    static void check(int num) throws Exception {
        if (num < 0) throw new Exception("Negative value!");[cite: 2, 10]
    }

    public static void main(String[] args) {
        try {
            check(-5); // Risky call[cite: 11]
        } catch (Exception e) {
            // Alternative handling[cite: 11]
            System.out.println("Handled: " + e.getMessage());[cite: 4]
        } finally {
            // Guaranteed cleanup execution[cite: 2, 10]
            System.out.println("Cleanup done.");
        }
    }
}