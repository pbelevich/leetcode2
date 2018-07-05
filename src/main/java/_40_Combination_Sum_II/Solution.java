package _40_Combination_Sum_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(candidates, 0, target, result, new ArrayList<>());
        return result;
    }

    private void combinationSum(int[] candidates, int i, int target, List<List<Integer>> result, ArrayList<Integer> res) {
        if (target == 0) {
            result.add(res);
        } else {
            for (int j = i; j < candidates.length && candidates[j] <= target; j++) {
                if (j > i && candidates[j] == candidates[j - 1]) {
                    continue;
                }
                final ArrayList<Integer> res1 = new ArrayList<>(res);
                res1.add(candidates[j]);
                combinationSum(candidates, j + 1, target - candidates[j], result, res1);
            }
        }
    }
}
