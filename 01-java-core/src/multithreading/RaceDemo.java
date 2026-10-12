package multithreading;

public class RaceDemo {
    public static void main(String[] args) {
        
        // ---------------- ZONE 1: 100% GUARANTEED SEQUENTIAL ----------------
        System.out.println("A. Setup DB connection");
        System.out.println("B. Validate user credentials");

        Thread worker = new Thread(() -> {
            System.out.println("--> WORKER: Downloading heavy file");
        });

        // ---------------- THE BOUNDARY LINE ----------------
        worker.start(); // The Starting Gun fires HERE!
        // ---------------------------------------------------

        // ---------------- ZONE 2: THE UNPREDICTABLE RACE ----------------
        System.out.println("C. Main thread handling user clicks");
    }
}