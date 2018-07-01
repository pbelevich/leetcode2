package _861_Score_After_Flipping_Matrix;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int matrixScore(int[][] A) {
        final int N = A.length;
        final int M = A[0].length;
        for (int i = 0; i < N; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < M; j++) {
                    A[i][j] = A[i][j] == 0 ? 1 : 0;
                }
            }
        }
        int result = 0;
        for (int j = M - 1; j >= 1; j--) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += A[i][j];
            }
            sum = Math.max(sum, N - sum);
            int col = sum << (M - 1 - j);
            result += col;
        }
        result += N << (M - 1);
        return result;
    }

}
