package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderProcessorDemo {
    public static void main(String[] args) {

        // STEP 1: Create the Thread Pool (3 permanent worker threads)
        ExecutorService manager = Executors.newFixedThreadPool(3);

        // STEP 2: Submit 5 orders to the manager
        for (int i = 1; i <= 5; i++) {
            int orderId = i;
            
            manager.execute(() -> {
                System.out.println("Processing Order #" + orderId 
                        + " on thread: " + Thread.currentThread().getName());
            });
        }

        // STEP 3: Shut down the manager once all queued orders finish
        manager.shutdown();
    }
}
