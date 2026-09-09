package array;

public class ReverseArrayPrint {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Array in reverse order: ");
        
        // Start from the last index and decrement down to 0
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
