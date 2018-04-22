package _75_Sort_Colors.quickSort;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public void sortColors(int[] nums) {
        int l = 0;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i != r) {
                    swap(nums, l, r);
                }
                swap(nums, l, i);
                l++;
                r++;
            } else if (nums[i] == 1) {
                swap(nums, i, r);
                r++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }

}
