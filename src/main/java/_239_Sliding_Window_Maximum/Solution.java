package _239_Sliding_Window_Maximum;

import java.util.LinkedList;
import java.util.TreeMap;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0) {
            return new int[0];
        }
        TreeMap<Integer, Integer> set = new TreeMap<>();
        LinkedList<Integer> list = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        int i = 0;
        for (int n : nums) {
            if (list.size() == k) {
                int toRemove = list.removeFirst();
                final Integer val = set.get(toRemove);
                if (val == 1) {
                    set.remove(toRemove);
                } else {
                    set.put(toRemove, val - 1);
                }
            }
            set.put(n, set.getOrDefault(n, 0) + 1);
            list.addLast(n);
            if (list.size() == k) {
                result[i++] = set.lastKey();
            }
        }
        return result;
    }

}
