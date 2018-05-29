package _219_Contains_Duplicate_II;

import java.util.*;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        final Map<Integer, NavigableSet<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            NavigableSet<Integer> indices = map.get(n);
            if (indices == null) {
                indices = new TreeSet<>();
                map.put(n, indices);
            }
            if (!indices.isEmpty()) {
                Integer c = indices.ceiling(i);
                c = c != null ? c : Integer.MAX_VALUE;
                Integer f = indices.floor(i);
                f = f != null ? f : Integer.MIN_VALUE;
                if ((long) c - i <= k || (long) i - f <= k) {
                    return true;
                }
            }
            indices.add(i);
        }
        return false;
    }

}
