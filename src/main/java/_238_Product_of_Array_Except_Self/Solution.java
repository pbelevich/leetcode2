package _238_Product_of_Array_Except_Self;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {
        final int n = nums.length;
        int[] res = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int prev = 1;
        for (int j = n - 1; j >= 0; j--) {
            res[j] *= prev;
            prev *= nums[j];
        }

        return res;
    }

}
