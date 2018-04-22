package _494_Target_Sum.dp;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private int[][] dp;
    private int half = 1000;

    public int findTargetSumWays(int[] nums, int S) {
        if (S > 1000) {
            return 0;
        }
        dp = new int[nums.length + 1][1 + (half << 1)];

        set(nums.length, 0, 1);

        for (int k = nums.length - 1; k >= 0; k--) {
            for (int s = 0; s <= half; s++) {
                set(k, s, get(k + 1, s - nums[k]) + get(k + 1, s + nums[k]));
                set(k, -s, get(k + 1, -s - nums[k]) + get(k + 1, -s + nums[k]));
            }
        }

        return get(0, S);
    }

    int get(int k, int s) {
        return k >= 0 && Math.abs(s) <= half ? dp[k][s + half] : 0;
    }

    void set(int k, int s, int val) {
        dp[k][s + half] = val;
    }

}
