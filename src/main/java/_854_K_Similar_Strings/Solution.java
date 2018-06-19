package _854_K_Similar_Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int kSimilarity(String a, String b) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(a);
        Set<String> visited = new HashSet<>();
        visited.add(a);
        Map<String, Integer> distTo = new HashMap<>();
        distTo.put(a, 0);
        final char[] bChars = b.toCharArray();
        while (!queue.isEmpty()) {
            final String s = queue.poll();
            int distToS = distTo.get(s);
            if (s.equals(b)) {
                return distToS;
            }
            for (String adj : adj(s.toCharArray(), bChars)) {
                if (!visited.contains(adj)) {
                    queue.offer(adj);
                    visited.add(adj);
                    distTo.put(adj, distToS + 1);
                }
            }
        }
        return -1;
    }

    private Iterable<String> adj(char[] s, char[] b) {
        int i = 0;
        while (s[i] == b[i]) {
            i++;
        }
        List<String> result = new ArrayList<>();
        for (int j = i + 1; j < s.length; j++) {
            if (s[j] == b[i]) {
                swap(s, i, j);
                result.add(new String(s));
                swap(s, i, j);
            }
        }
        return result;
    }

    private void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
