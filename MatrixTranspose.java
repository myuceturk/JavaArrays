package Arrays;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
        };

        int m = array.length;
        int n = array[0].length;

        int[][] transposedMatrix = new int[n][m];

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                transposedMatrix[x][y] = array[y][x];
                System.out.print(transposedMatrix[x][y] + " ");
            }
            System.out.println();
        }
    }
}
