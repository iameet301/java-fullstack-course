package array;

public class MissingNumber {

    public static void main(String[] args) {
        int N = 5; 
        int[] arr = {1, 2, 4, 5}; 

        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;

        System.out.println("Missing number: " + (expectedSum - actualSum));
    }
}