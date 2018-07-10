package _295_Find_Median_from_Data_Stream;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Pavel Belevich
 */
public class MedianFinder {

    private PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());
    private PriorityQueue<Integer> right = new PriorityQueue<>(Comparator.naturalOrder());

    public MedianFinder() {
    }

    public void addNum(int num) {
        right.offer(num);
        left.offer(right.poll());
        if (left.size() > right.size()) {
            right.offer(left.poll());
        }
    }

    public double findMedian() {
        if (left.size() == right.size()) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return right.peek();
        }
    }

}
