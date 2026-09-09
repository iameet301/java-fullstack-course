package array;

public class Frequency_of_element {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 8, 3, 2, 5, -1, -1};
        boolean[] visited = new boolean[arr.length];

        System.out.println("Element | Frequency");
        System.out.println("-------------------");

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true; 
                    count++;
                }
            }

            System.out.println("   " + arr[i] + "    |    " + count);
        }
    }
}