package _746_Min_Cost_Climbing_Stairs;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 3];
        for (int i = cost.length - 1; i >= 0; i--) {
            dp[i] = Math.min(
                    cost(cost, i) + cost(cost, i + 2) + dp[i + 3],
                    cost(cost, i + 1) + dp[i + 2]
            );
        }
        return dp[0];
    }

    private int cost(int[] cost, int i) {
        return i < cost.length ? cost[i] : 0;
    }

}
