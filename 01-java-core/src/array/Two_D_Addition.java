package array;

public class Two_D_Addition {
	public static void main(String[] args) {
		int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8, 9},
            {1, 2, 3}
        };

        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] sum = new int[rows][cols];

        // Perform matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // Display the output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}