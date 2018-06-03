package _213_House_Robber_II;

import java.util.Arrays;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        final int n = nums.length;
        nums = Arrays.copyOf(nums, n + 3);

        int[] dp = new int[n + 3];
        for (int i = n - 1; i >= 1; i--) {
            dp[i] = Math.max(
                    nums[i] + dp[i + 2],
                    nums[i + 1] + dp[i + 3]
            );
        }
        final int first = dp[1];

        nums[n - 1] = 0;
        dp = new int[n + 2];
        for (int i = n - 2; i >= 0; i--) {
            dp[i] = Math.max(
                    nums[i] + dp[i + 2],
                    nums[i + 1] + dp[i + 3]
            );
        }
        final int second = dp[0];

        return Math.max(first, second);
    }

}
