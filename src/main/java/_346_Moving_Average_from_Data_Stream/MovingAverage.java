package _346_Moving_Average_from_Data_Stream;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Pavel Belevich
 */
public class MovingAverage {

    private double sum;
    private Deque<Integer> q;
    private int size;

    public MovingAverage(int size) {
        this.q = new ArrayDeque<>(size);
        this.size = size;
    }

    public double next(int val) {
        q.addLast(val);
        sum += val;
        if (q.size() > size) {
            sum -= q.removeFirst();
        }
        return sum / q.size();
    }

}
