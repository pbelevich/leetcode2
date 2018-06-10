package _851_Loud_and_Rich;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        final int N = quiet.length;
        List<Integer>[] adj = new List[N];
        for (int i = 0; i < N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] r : richer) {
            int from = r[1];
            int to = r[0];
            adj[from].add(to);
        }
        int[] answer = new int[N];
        Arrays.fill(answer, -1);
        for (int p = 0; p < N; p++) {
            dfs(adj, p, quiet, answer);
        }
        return answer;
    }

    private int dfs(Collection<Integer>[] adj, int i, int[] quiet, int[] answer) {
        if (answer[i] != -1) {
            return answer[i];
        }
        int leastQuiet = i;
        for (int j : adj[i]) {
            int k = dfs(adj, j, quiet, answer);
            if (quiet[k] < quiet[leastQuiet]) {
                leastQuiet = k;
            }
        }
        return answer[i] = leastQuiet;
    }

}
