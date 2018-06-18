package _518_Coin_Change_2.second;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int change(int amount, int[] coins) {
        if (coins == null || coins.length == 0) {
            return amount == 0 ? 1 : 0;
        }
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int a = 0; a <= amount; a++) {
                if (a - coin >= 0) {
                    dp[a] += dp[a - coin];
                }
            }
        }
        return dp[amount];
    }

}
