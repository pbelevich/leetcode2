package _480_Sliding_Window_Median;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public double[] medianSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> right = new PriorityQueue<>(Comparator.naturalOrder());
        LinkedList<Integer> list = new LinkedList<>();
        double[] result = new double[nums.length - k + 1];
        int i = 0;
        for (int n : nums) {
            if (list.size() == k) {
                int toRemove = list.removeFirst();
                assert left.remove(toRemove) || right.remove(toRemove);
            }

            if (left.size() <= right.size()) {
                right.offer(n);
                left.offer(right.poll());
            } else {
                left.offer(n);
                right.offer(left.poll());
            }

            assert left.size() >= right.size();

            list.addLast(n);
            if (list.size() == k) {
                if (left.size() == right.size()) {
                    result[i++] = ((double) left.peek() + right.peek()) / 2.0;
                } else {
                    result[i++] = left.peek();
                }
            }
        }
        return result;
    }

}
