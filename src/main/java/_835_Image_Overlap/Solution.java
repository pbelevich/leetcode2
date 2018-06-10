package _835_Image_Overlap;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Matrix {

        final int[][] m;
        final int dr;
        final int dc;

        Matrix(int[][] m, int dr, int dc) {
            this.m = m;
            this.dr = dr;
            this.dc = dc;
        }

        int get(int r, int c) {
            final int row = r - dr;
            final int col = c - dc;
            if (0 <= row && row < m.length && 0 <= col && col < m[0].length) {
                return m[row][col];
            } else {
                return 0;
            }
        }

    }

    public int largestOverlap(int[][] A, int[][] B) {
        int largest = 0;
        for (int dr = -B.length; dr <= B.length; dr++) {
            for (int dc = -B[0].length; dc <= B[0].length; dc++) {
                Matrix b = new Matrix(B, dr, dc);
                int overlap = 0;
                for (int r = 0; r < A.length; r++) {
                    for (int c = 0; c < A[r].length; c++) {
                        if (A[r][c] == 1 && b.get(r, c) == 1) {
                            overlap++;
                        }
                    }
                }
                largest = Math.max(largest, overlap);
            }
        }
        return largest;
    }

}
