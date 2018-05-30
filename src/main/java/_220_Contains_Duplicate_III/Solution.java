package _220_Contains_Duplicate_III;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k < 0 || t < 0) {
            return false;
        }
        NavigableSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i - k - 1;
            if (j >= 0) {
                set.remove((long) nums[j]);
            }
            int n = nums[i];
            if (!set.subSet((long) n - t, true, (long) n + t, true).isEmpty()) {
                return true;
            }
            set.add((long) n);
        }
        return false;
    }

}
