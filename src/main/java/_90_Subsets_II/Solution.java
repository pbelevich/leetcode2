package _90_Subsets_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        res.add(Collections.emptyList());
        helper(nums, 0, new ArrayList<>(), res);
        return res;
    }

    private void helper(int[] nums, int n, List<Integer> acc, List<List<Integer>> res) {
        for (int i = n; i < nums.length; i++) {
            if (i > n && nums[i] == nums[i - 1]) {
                continue;
            }
            final ArrayList<Integer> acc1 = new ArrayList<>(acc);
            acc1.add(nums[i]);
            res.add(acc1);
            helper(nums, i + 1, acc1, res);
        }
    }

}
