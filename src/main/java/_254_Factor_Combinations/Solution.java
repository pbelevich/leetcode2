package _254_Factor_Combinations;

import java.util.*;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(n, 2, new ArrayDeque<>(), result);
        result.remove(Collections.singletonList(n));
        return result;
    }

    private void helper(int n, int x, Deque<Integer> stack, List<List<Integer>> result) {
        if (n == 1 && !stack.isEmpty()) {
            List<Integer> a = new ArrayList<>(stack);
            Collections.reverse(a);
            result.add(a);
        } else {
            for (int d = x; d <= n; d++) {
                if (n % d == 0) {
                    stack.push(d);
                    int r = n / d;
                    helper(r, d, stack, result);
                    stack.pop();
                }
            }
        }
    }

}
