package _870_Advantage_Shuffle;

import java.util.*;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] advantageCount(int[] A, int[] B) {
        final int N = A.length;
        SortedMap<Integer, List<Integer>> bMap = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            bMap.computeIfAbsent(B[i], b -> new ArrayList<>()).add(i);
        }
        Arrays.sort(A);
        int[] newA = new int[N];
        Collection<Integer> remaining = new ArrayList<>();
        for (int a : A) {
            int bMin = bMap.firstKey();
            if (a > bMin) {
                final List<Integer> indices = bMap.get(bMin);
                final int index = indices.remove(indices.size() - 1);
                if (indices.isEmpty()) {
                    bMap.remove(bMin);
                }
                newA[index] = a;
            } else {
                remaining.add(a);
            }
        }
        int[] remainingIndices = bMap.values().stream().flatMap(Collection::stream).mapToInt(i -> i).toArray();
        int i = 0;
        for (int a : remaining) {
            newA[remainingIndices[i++]] = a;
        }
        return newA;
    }

}
