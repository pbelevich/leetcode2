package _55_Jump_Game;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean canJump(int[] nums) {
        int i, j;
        for (i = -1, j = 0; ; ) {
            int max = 0;
            for (int k = i + 1; k <= j; k++) {
                max = Math.max(max, k + nums[k]);
            }
            if (j == i) {
                return false;
            }
            if (max >= nums.length - 1) {
                return true;
            }
            i = j;
            j = max;
        }
    }

}
