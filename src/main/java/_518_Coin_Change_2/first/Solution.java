package _518_Coin_Change_2.first;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int change(int amount, int[] coins) {
        if (coins == null || coins.length == 0) {
            return amount == 0 ? 1 : 0;
        }
        int[][] dp = new int[amount + 1][coins.length + 1];
        for (int a = 0; a <= amount; a++) {
            for (int j = 0; j < coins.length; j++) {
                if (a == 0) {
                    dp[a][j] = 1;
                } else {
                    if (j - 1 >= 0) {
                        dp[a][j] += dp[a][j - 1];
                    }
                    if (a - coins[j] >= 0) {
                        dp[a][j] += dp[a - coins[j]][j];
                    }
                }
            }
        }
        return dp[amount][coins.length - 1];
    }

}
