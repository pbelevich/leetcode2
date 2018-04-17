package _406_Queue_Reconstruction_by_Height;

import java.util.*;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, Comparator.<int[], Integer>comparing(p -> p[0], Comparator.reverseOrder()).thenComparing(p -> p[1]));
        List<int[]> list = new LinkedList<>();
        for (int[] p : people) {
            list.add(p[1], p);
        }
        return list.toArray(new int[list.size()][]);
    }

}
