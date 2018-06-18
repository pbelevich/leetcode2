package _855_Exam_Room;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Pavel Belevich
 */
public class ExamRoom {

    private int N;
    private SortedSet<Integer> seats;

    public ExamRoom(int N) {
        this.N = N;
        this.seats = new TreeSet<>();
    }

    public int seat() {
        int result;
        int lo = 0;
        int hi = 0;

        int prev = -1;
        for (int seat : seats) {
            if (prev != -1) {
                if (dist(prev, seat) > dist(lo, hi)) {
                    lo = prev;
                    hi = seat;
                }
            }
            prev = seat + 1;
        }

        if (!seats.isEmpty()) {
            if (dist(0, seats.first()) >= dist(lo, hi)) {
                lo = 0;
                hi = seats.first();
            }
            if (dist(seats.last() + 1, N) > dist(lo, hi)) {
                lo = seats.last() + 1;
                hi = N;
            }
        }

        if (lo == 0) {
            result = 0;
        } else if (hi == N) {
            result = N - 1;
        } else {
            result = (lo + hi - 1) >>> 1;
        }
        seats.add(result);
        return result;
    }

    public void leave(int p) {
        seats.remove(p);
    }

    private int dist(int lo, int hi) {
        if (lo == 0 || hi == N) {
            return hi - lo;
        } else {
            return (hi - lo + 1) / 2;
        }
    }

}
