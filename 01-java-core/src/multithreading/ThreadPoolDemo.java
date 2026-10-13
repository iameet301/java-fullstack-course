package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 1. Create a pool with 3 reusable worker threads
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // 2. Submit 6 tasks to the pool
        for (int i = 1; i <= 6; i++) {
            int taskId = i;
            pool.execute(() -> {
                System.out.println("Task " + taskId + " executed by: " 
                        + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulating 1 second of work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        // 3. Gracefully stop accepting new tasks and finish pending ones
        pool.shutdown();
    }
}
