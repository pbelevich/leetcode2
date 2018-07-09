package _868_Transpose_Matrix;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[][] transpose(int[][] A) {
        final int N = A.length;
        final int M = A[0].length;
        final int[][] T = new int[M][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

}
