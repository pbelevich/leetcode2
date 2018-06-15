package _813_Largest_Sum_of_Averages;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public double largestSumOfAverages(int[] A, int K) {
        int[][] sums = new int[A.length + 1][A.length + 1];
        for (int l = 1; l <= A.length; l++) {
            for (int i = 0; i < A.length - l + 1; i++) {
                int j = i + l;
                if (l == 1) {
                    sums[i][j] = A[i];
                } else {
                    sums[i][j] = sums[i][i + 1] + sums[i + 1][j];
                }
            }
        }
        double[][] dp = new double[K + 1][A.length + 1];
        for (int k = 1; k <= K; k++) {
            for (int i = A.length - k; i >= 0; i--) {
                if (k == 1) {
                    dp[k][i] = (double) sums[i][A.length] / (A.length - i);
                } else {
                    double max = 0;
                    for (int j = i + 1; j <= A.length - k + 1; j++) {
                        int sum = sums[i][j];
                        final double preSum = (double) sum / (j - i);
                        max = Math.max(max, preSum + dp[k - 1][j]);
                    }
                    dp[k][i] = max;
                }
            }
        }
        return dp[K][0];
    }

//    public double largestSumOfAverages(int[] A, int i, int[][] sums, int K) {
//        if (K == 1) {
//            int sum = sums[i][A.length];
//            return (double) sum / (A.length - i);
//        } else {
//            double max = 0;
//            for (int j = i + 1; j <= A.length - K + 1; j++) {
//                int sum = sums[i][j];
//                final double preSum = (double) sum / (j - i);
//                max = Math.max(max, preSum + largestSumOfAverages(A, j, sums, K - 1));
//            }
//            return max;
//        }
//    }

}
