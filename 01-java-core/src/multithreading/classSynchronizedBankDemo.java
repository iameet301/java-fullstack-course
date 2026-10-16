package multithreading;

public class classSynchronizedBankDemo {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount(); // Single shared object in Heap

        // Two threads sharing the exact same BankAccount instance
        Thread user1 = new Thread(() -> sharedAccount.withdraw("User-A (ATM)", 800));
        Thread user2 = new Thread(() -> sharedAccount.withdraw("User-B (UPI)", 800));

        user1.start();
        user2.start();
    }
}
