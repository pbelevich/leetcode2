package _57_Insert_Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();

        boolean b = false;

        for (Interval i : intervals) {
            if (i.end < newInterval.start) {
                result.add(i);
            } else if (i.start > newInterval.end) {
                if (!b) {
                    result.add(newInterval);
                    b = true;
                }
                result.add(i);
            } else if (i.start >= newInterval.start && i.end <= newInterval.end) {
                continue;
            } else {
                newInterval.start = Math.min(newInterval.start, i.start);
                newInterval.end = Math.max(newInterval.end, i.end);
            }
        }

        if (!b) {
            result.add(newInterval);
        }

        return result;
    }

}
