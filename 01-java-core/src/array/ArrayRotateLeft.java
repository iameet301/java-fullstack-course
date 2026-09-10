package array;

public class ArrayRotateLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Number of positions to shift left

        int n = arr.length;
        k = k % n; // Handle cases where k is greater than array length

        System.out.print("Original: ");
        printArray(arr);

        // Perform rotation
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }

        System.out.print("Rotated:  ");
        printArray(rotated);
    }

    public static void printArray(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
