package array;

public class MoveNegatives {
    public static void main(String[] args) {
        int[] arr = {4, -1, 3, -2, -5, 7};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index++] = temp;
            }
        }

        for (int n : arr) System.out.print(n + " ");
    }
}
