package exception;

public class Demo {

    // Overriding the finalize() method from Object class
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called by Garbage Collector before reclaiming memory.");
    }

    public static void main(String[] args) {
        // 1. Demo of finally block
        try {
            int result = 10 / 2;
            System.out.println("Try block executed: " + result);
        } catch (Exception e) {
            System.out.println("Catch block executed.");
        } finally {
            // ALWAYS executes
            System.out.println("finally block executed.");
        }

        // 2. Demo of finalize()
        Demo obj = new Demo();
        obj = null; // Object is now eligible for GC

        System.gc(); // Requesting JVM to trigger GC (not guaranteed to run immediately)
    }
}