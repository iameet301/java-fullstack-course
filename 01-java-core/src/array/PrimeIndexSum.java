package array;

public class PrimeIndexSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80}; // Indexes: 0 to 7
        int sum = 0;

        for (int i = 2; i < arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i];
                System.out.println("Index " + i + " is prime. Adding value: " + arr[i]);
            }
        }

        System.out.println("Total sum at prime indexes: " + sum);
    }

  
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
