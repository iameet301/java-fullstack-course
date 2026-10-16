package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolCallableDemo {
    public static void main(String[] args) throws Exception {
        // 1. Create a Thread Pool with 2 reusable worker threads
        ExecutorService pool = Executors.newFixedThreadPool(2);

        // 2. Define two Callable tasks that return an Integer result
        Callable<Integer> taxCalculation = () -> {
            System.out.println("Calculating tax on: " + Thread.currentThread().getName());
            Thread.sleep(1000);
            return 1800; // Returns calculated tax
        };

        Callable<Integer> discountCalculation = () -> {
            System.out.println("Calculating discount on: " + Thread.currentThread().getName());
            Thread.sleep(1000);
            return 500; // Returns calculated discount
        };

        // 3. Submit both tasks to run in parallel and hold their Future tickets
        Future<Integer> taxFuture = pool.submit(taxCalculation);
        Future<Integer> discountFuture = pool.submit(discountCalculation);

        System.out.println("Main Thread: Waiting for parallel calculations to finish...");

        // 4. .get() blocks until the result is ready (Total time = ~1 sec instead of 2 sec)
        int finalPrice = 10000 + taxFuture.get() - discountFuture.get();
        System.out.println("Final Invoice Amount: Rs." + finalPrice);

        // 5. Shut down the pool
        pool.shutdown();
    }
}
