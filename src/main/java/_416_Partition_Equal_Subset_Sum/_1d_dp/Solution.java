package _416_Partition_Equal_Subset_Sum._1d_dp;

import java.util.Arrays;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean canPartition(int[] nums) {
        final int sum = Arrays.stream(nums).sum();
        if ((sum & 1) == 1) {
            return false;
        }
        final int half = sum >> 1;
        boolean[] dp = new boolean[half + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int s = half; s > 0; s--) {
                if (s >= num) {
                    dp[s] = dp[s] || dp[s - num];
                }
            }
        }

        return dp[half];
    }

}
