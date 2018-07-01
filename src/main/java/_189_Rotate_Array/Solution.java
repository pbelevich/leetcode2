package _189_Rotate_Array;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public void rotate(int[] nums, int k) {
        final int N = nums.length;
        k %= N;
        reverse(nums, 0, N - k);
        reverse(nums, N - k, N);
        reverse(nums, 0, N);
    }

    private void reverse(int[] nums, int lo, int hi) {
        for (int i = 0; i < (hi - lo) >>> 1; i++) {
            int temp = nums[lo + i];
            nums[lo + i] = nums[hi - 1 - i];
            nums[hi - 1 - i] = temp;
        }
    }

}
