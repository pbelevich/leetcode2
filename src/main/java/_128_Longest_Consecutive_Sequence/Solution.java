package _128_Longest_Consecutive_Sequence;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int longestConsecutive(int[] nums) {
        final Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int max = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                for (int i = n; set.contains(i); i++) {
                    max = Math.max(max, i - n + 1);
                }
            }
        }
        return max;
    }

}
