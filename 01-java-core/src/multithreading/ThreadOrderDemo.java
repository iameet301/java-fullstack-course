package multithreading;

public class ThreadOrderDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread task1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Task 1 (Downloading data) - Step " + i);
                try {
                    Thread.sleep(500); // Pauses for 0.5 seconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread task2 = new Thread(() -> {
            System.out.println("Task 2 (Processing downloaded data) - Completed!");
        });

        task1.start();
        
        // Forces main thread to WAIT here until task1 finishes completely
        task1.join(); 

        // task2 only starts AFTER task1 is 100% done
        task2.start(); 
        task2.join();

        System.out.println("Main Thread: All tasks finished in strict order.");
    }
}
