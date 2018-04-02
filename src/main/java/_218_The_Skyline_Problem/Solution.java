package _218_The_Skyline_Problem;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> result = new ArrayList<>();

        final int[][] points = Arrays.stream(buildings)
                .flatMap(b -> Stream.of(new int[]{b[0], b[2], 1}, new int[]{b[1], b[2], -1}))
                .sorted(Comparator.<int[], Integer>comparing(p -> p[0]).thenComparing(p -> -p[2] * p[1]))
                .toArray(int[][]::new);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(0);

        for (int[] p : points) {
            if (p[2] > 0) {
                if (pq.isEmpty() || p[1] > pq.peek()) {
                    result.add(new int[]{p[0], p[1]});
                }
                pq.add(p[1]);
            } else {
                if (p[1] == pq.peek()) {
                    pq.remove(p[1]);
                    if (p[1] != pq.peek()) {
                        result.add(new int[]{p[0], pq.peek()});
                    }
                } else {
                    pq.remove(p[1]);
                }
            }
        }

        return result;
    }

}
