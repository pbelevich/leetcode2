package _46_Permutations.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        permute(Collections.emptyList(), set, result);
        return result;
    }

    private void permute(List<Integer> res, Set<Integer> remaining, List<List<Integer>> result) {
        if (remaining.isEmpty()) {
            result.add(res);
        } else {
            for (int r : remaining) {
                Set<Integer> newRemaining = new HashSet<>(remaining);
                newRemaining.remove(r);
                List<Integer> newRes = new ArrayList<>(res);
                newRes.add(r);
                permute(newRes, newRemaining, result);
            }
        }
    }

}
