package multithreading;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // Callable returns an Integer result instead of void
        Callable<Integer> task = () -> {
            TimeUnit.SECONDS.sleep(1);
            return 123;
        };

        Future<Integer> future = executor.submit(task);
        System.out.println("Task done? " + future.isDone()); // false

        Integer result = future.get(); // Waits 1 second for completion
        System.out.println("Task done? " + future.isDone()); // true
        System.out.println("Result: " + result);             // 123

        executor.shutdown();
    }
}
