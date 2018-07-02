package _188_Best_Time_to_Buy_and_Sell_Stock_IV;

/**
 * @author Pavel Belevich
 */
public class Solution {

    /**
     * dp[i][j] = max(
     * dp[i][j-1],                                           // no transaction on j-th day
     * (prices[j]-price[m]) + dp[i-1][m]  foreach m=0..j-1   // sell on j-th day what you bought on m-th day
     * )
     */
    public int maxProfit(int k, int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        if (k >= prices.length >> 1) {
            return maxProfit(prices);
        }

        final int n = prices.length;
        int[][] dp = new int[k + 1][n];
        for (int i = 1; i <= k; i++) {
            int maxDiff = Integer.MIN_VALUE;
            for (int j = 1; j < n; j++) {
                maxDiff = Math.max(maxDiff, dp[i - 1][j - 1] - prices[j - 1]);
                dp[i][j] = Math.max(dp[i][j - 1], prices[j] + maxDiff);
            }
        }
        return dp[k][n - 1];
    }

    private int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit += Math.max(0, prices[i] - prices[i - 1]);
        }
        return maxProfit;
    }

//    public int maxProfit(int k, int[] prices) {
//        if (prices == null || prices.length < 2) {
//            return 0;
//        }
//        final int n = prices.length;
//        int[][] dp = new int[k + 1][n];
//        for (int i = 1; i <= k; i++) {
//            for (int j = 1; j < n; j++) {
//                dp[i][j] = dp[i][j - 1];
//                for (int m = 0; m < j; m++) {
//                    dp[i][j] = Math.max(dp[i][j], prices[j] - prices[m] + dp[i - 1][m]);
//                }
//            }
//        }
//        return dp[k][n - 1];
//    }

}
