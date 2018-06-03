package _198_House_Robber;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 3];

        for (int i = nums.length - 1; i >= 0; i--) {
            dp[i] = Math.max(
                    nums(nums, i) + dp[i + 2],
                    nums(nums, i + 1) + dp[i + 3]
            );
        }

        return dp[0];
    }

    private int nums(int[] nums, int i) {
        return i < nums.length ? nums[i] : 0;
    }

}
