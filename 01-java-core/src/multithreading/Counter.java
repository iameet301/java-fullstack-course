package multithreading;

class Counter {
    private int count = 0;

    // Synchronized method prevents race conditions on shared heap state
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Implementing Runnable via lambda
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join(); // Wait for t1 to complete
        t2.join(); // Wait for t2 to complete

        System.out.println("Final Safe Count: " + counter.getCount()); // Always 2000
    }
}
