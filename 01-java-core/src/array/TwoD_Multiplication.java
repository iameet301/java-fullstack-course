package array;

public class TwoD_Multiplication {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {4, 5}
        };
        int[][] b = {
            {7, 8},
            {2, 3}
        };

        int[][] result = new int[2][2];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print Result
        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}