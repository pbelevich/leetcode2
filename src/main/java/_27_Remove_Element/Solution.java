package _27_Remove_Element;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        int newLen;
        int i;
        for (i = 0, newLen = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newLen++] = nums[i];
            }
        }
        return newLen;
    }

}
