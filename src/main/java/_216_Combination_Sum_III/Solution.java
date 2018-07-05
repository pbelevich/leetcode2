package _216_Combination_Sum_III;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combinationSum3(k, n, 1, result, new ArrayList<>());
        return result;
    }

    private void combinationSum3(int k, int n, int i, List<List<Integer>> result, ArrayList<Integer> res) {
        if (k == 0 && n == 0) {
            result.add(res);
        } else {
            for (int j = i; j < 10 && j <= n; j++) {
                final ArrayList<Integer> res1 = new ArrayList<>(res);
                res1.add(j);
                combinationSum3(k - 1, n - j, j + 1, result, res1);
            }
        }
    }

}
