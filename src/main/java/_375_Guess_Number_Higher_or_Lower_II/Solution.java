package _375_Guess_Number_Higher_or_Lower_II;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int getMoneyAmount(int N) {
        int[][] dp = new int[N + 1][N + 1];
        for (int n = 2; n <= N; n++) {
            for (int s = 0; s <= N - n; s++) {
                int min = Integer.MAX_VALUE;
                for (int i = 1; i <= n; i++) {
                    int both = s + i + Math.max(dp[i - 1][s], s + i <= N ? dp[n - i][s + i] : 0);
                    min = Math.min(min, both);
                }
                dp[n][s] = min;
            }
        }
        return dp[N][0];
//        return getMoneyAmount(N, 0);
    }

//    private int getMoneyAmount(int n, int s) {
//        if (n <= 1) {
//            return 0;
//        } else {
//            int min = Integer.MAX_VALUE;
//            for (int i = 1; i <= n; i++) {
//                int both = s + i + Math.max(
//                        getMoneyAmount(i - 1, s),
//                        getMoneyAmount(n - i, s + i)
//                );
//                min = Math.min(min, both);
//            }
//            return min;
//        }
//    }

}
