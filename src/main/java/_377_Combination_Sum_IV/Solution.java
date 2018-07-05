package _377_Combination_Sum_IV;

import java.util.Arrays;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int t = 1; t <= target; t++) {
            for (int n : nums) {
                if (n > t) {
                    break;
                }
                dp[t] += dp[t - n];
            }
        }

        return dp[target];
    }

}
