package _532_K_diff_Pairs_in_an_Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            Integer c = map.get(n);
            if (c == null) {
                c = 0;
            }
            map.put(n, c + 1);
        }
        if (k == 0) {
            int res = 0;
            for (int c : map.values()) {
                res += c > 1 ? 1 : 0;
            }
            return res;
        } else {
            nums = new int[map.size()];
            int x = 0;
            for (int n : map.keySet()) {
                nums[x++] = n;
            }
            Arrays.sort(nums);
            int res = 0;
            for (int i = 0, j = 0, diff; j < nums.length; ) {
                diff = Math.abs(nums[i] - nums[j]);
                if (diff < k) {
                    j++;
                } else if (diff > k) {
                    i++;
                } else {
                    res++;
                    i++;
                }
            }
            return res;
        }
    }

}
