package _287_Find_the_Duplicate_Number;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        int len = 0;
        for (slow = 0; slow != fast; slow++) {
            len++;
        }
        slow = 0;
        fast = len;
        do {
            slow = nums[slow];
            fast = nums[fast];
        } while (slow != fast);
        return slow;
    }

}
