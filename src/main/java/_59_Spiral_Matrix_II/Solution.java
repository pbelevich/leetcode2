package _59_Spiral_Matrix_II;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        generateMatrix(matrix, 0, 0, n - 1, n - 1, 1);
        return matrix;
    }

    private void generateMatrix(int[][] matrix, int r1, int c1, int r2, int c2, int i) {
        if (r1 == r2) {
            for (int c = c1; c <= c2; c++) {
                matrix[r1][c] = i++;
            }
        } else if (c1 == c2) {
            for (int r = r1; r <= r2; r++) {
                matrix[r][c1] = i++;
            }
        } else if (r2 > r1 && c2 > c1) {
            for (int c = c1; c < c2; c++) {
                matrix[r1][c] = i++;
            }
            for (int r = r1; r < r2; r++) {
                matrix[r][c2] = i++;
            }
            for (int c = c2; c > c1; c--) {
                matrix[r2][c] = i++;
            }
            for (int r = r2; r > r1; r--) {
                matrix[r][c1] = i++;
            }
            generateMatrix(matrix, r1 + 1, c1 + 1, r2 - 1, c2 - 1, i);
        }
    }

}
