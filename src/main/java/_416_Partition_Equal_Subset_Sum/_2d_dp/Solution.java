package _416_Partition_Equal_Subset_Sum._2d_dp;

import java.util.Arrays;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private int n;
    private boolean[][] dp;

    public boolean canPartition(int[] nums) {
        final int sum = Arrays.stream(nums).sum();
        if ((sum & 1) == 1) {
            return false;
        }
        final int half = sum >> 1;

        n = nums.length;
        dp = new boolean[n][half + 1];

        for (int k = n - 1; k >= 0; k--) {
            for (int s = 0; s <= half; s++) {
                dp[k][s] = get(k + 1, s) || get(k + 1, s - nums[k]);
            }
        }

        return get(0, half);
    }

    boolean get(int k, int s) {
        if (s < 0) {
            return false;
        } else if (k == n) {
            return s == 0;
        } else {
            return dp[k][s];
        }
    }

//    private boolean canPartition(int[] nums, int k, int s) {
//        if (s < 0) {
//            return false;
//        } else if (k == nums.length) {
//            return s == 0;
//        } else {
//            return canPartition(nums, k + 1, s) || canPartition(nums, k + 1, s - nums[k]);
//        }
//    }

}
