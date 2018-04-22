package _494_Target_Sum.memoization;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Key {
        final int k;
        final int s;

        Key(int k, int s) {
            this.k = k;
            this.s = s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Key key = (Key) o;

            if (k != key.k) return false;
            return s == key.s;
        }

        @Override
        public int hashCode() {
            int result = k;
            result = 31 * result + s;
            return result;
        }

    }

    public int findTargetSumWays(int[] nums, int s) {
        return findTargetSumWays(new HashMap<>(), nums, 0, s);
    }

    private int findTargetSumWays(Map<Key, Integer> cache, int[] nums, int k, int s) {
        return cache.computeIfAbsent(new Key(k, s), key -> {
            if (k == nums.length) {
                return s == 0 ? 1 : 0;
            } else {
                return findTargetSumWays(cache, nums, k + 1, s - nums[k]) + findTargetSumWays(cache, nums, k + 1, s + nums[k]);
            }
        });
    }

}
