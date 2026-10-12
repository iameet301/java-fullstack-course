package polymorphism;

public class SimpleThreadDemo {
    public static void main(String[] args) {
        // Define the task and pass it to a new Thread using a lambda
        Thread worker = new Thread(() -> {
            System.out.println("Chef cooking in background thread: " + Thread.currentThread().getName());
        });

        worker.start(); // Spawns a new thread and calls run() internally

        System.out.println("Main thread free to take new orders: " + Thread.currentThread().getName());
    }
}
