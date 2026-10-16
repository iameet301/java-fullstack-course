package multithreading;

class BankAccount {
    private int balance = 1000;

    // 'synchronized' ensures only ONE thread can execute this method at a time
    public synchronized void withdraw(String user, int amount) {
        System.out.println(user + " is trying to withdraw Rs." + amount);

        if (balance >= amount) {
            System.out.println(user + " verified sufficient balance. Processing...");
            try {
                Thread.sleep(500); // Simulates network/database delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            balance -= amount;
            System.out.println("SUCCESS: " + user + " withdrew Rs." + amount + " | Remaining Balance: Rs." + balance);
        } else {
            System.out.println("FAILED: Insufficient balance for " + user + " | Current Balance: Rs." + balance);
        }
    }
}

