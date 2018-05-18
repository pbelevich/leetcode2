package _834_Sum_of_Distances_in_Tree;

import java.util.*;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private Collection<Integer>[] adj;
    private int[] result;
    private Map<Integer, Integer>[] cache;

    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        adj = new Collection[N];
        for (int v = 0; v < N; v++) {
            adj[v] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int v = edge[0];
            int w = edge[1];
            adj[v].add(w);
            adj[w].add(v);
        }

        cache = new HashMap[N];
        for (int v = 0; v < N; v++) {
            cache[v] = new HashMap<>();
        }

        result = new int[N];
        initZero(-1, 0);
        traverseRemaining(-1, 0);

        return result;
    }

    private void traverseRemaining(int prev, int v) {
        for (int w : adj[v]) {
            if (w != prev) {
                result[w] = result[v] - size(v, w) + size(w, v);
                traverseRemaining(v, w);
            }
        }
    }

    private void initZero(int prev, int v) {
        for (int w : adj[v]) {
            if (w != prev) {
                result[0] += size(v, w);
                initZero(v, w);
            }
        }
    }

    private int size(int prev, int v) {
        Integer result = cache[v].get(prev);
        if (result == null) {
            result = 1;
            for (int w : adj[v]) {
                if (w != prev) {
                    result += size(v, w);
                }
            }
            cache[v].put(prev, result);
        }
        return result;
    }

}
