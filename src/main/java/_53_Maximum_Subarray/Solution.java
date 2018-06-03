package _53_Maximum_Subarray;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(0, sum) + nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }

}
