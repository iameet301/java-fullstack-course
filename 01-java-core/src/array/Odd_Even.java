package array;

public class Odd_Even {
    public static void main(String[] args) {
        int[] numbers = {12, 7, -5, 18, 0, 9, 24, -4};

        System.out.print("Even Numbers: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.print("Odd Numbers: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}