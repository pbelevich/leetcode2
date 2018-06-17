package _47_Permutations_II;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int n : nums) {
            res.add(n);
        }
        permuteUnique(res, 0, result);
        return result;
    }

    private void permuteUnique(List<Integer> res, int i, List<List<Integer>> result) {
        if (i == res.size()) {
            result.add(new ArrayList<>(res));
        } else {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < res.size(); j++) {
                if (seen.add(res.get(j))) {
                    swap(res, i, j);
                    permuteUnique(res, i + 1, result);
                    swap(res, i, j);
                }
            }
        }
    }

    private void swap(List<Integer> res, int i, int j) {
        int t = res.get(i);
        res.set(i, res.get(j));
        res.set(j, t);
    }

}
