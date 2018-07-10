package _448_Find_All_Numbers_Disappeared_in_an_Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            final int j = Math.abs(nums[i]) - 1;
            if (nums[j] > 0) {
                nums[j] = -nums[j];
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

}
