package _46_Permutations.second;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int n : nums) {
            res.add(n);
        }
        permute(res, 0, result);
        return result;
    }

    private void permute(List<Integer> res, int i, List<List<Integer>> result) {
        if (i == res.size()) {
            result.add(new ArrayList<>(res));
        } else {
            for (int j = i; j < res.size(); j++) {
                swap(res, i, j);
                permute(res, i + 1, result);
                swap(res, i, j);
            }
        }
    }

    private void swap(List<Integer> res, int i, int j) {
        int t = res.get(i);
        res.set(i, res.get(j));
        res.set(j, t);
    }

}
