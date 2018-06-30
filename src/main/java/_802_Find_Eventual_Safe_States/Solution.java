package _802_Find_Eventual_Safe_States;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        final int N = graph.length;
        List<Integer> result = new ArrayList<>();
        boolean[] cycle = new boolean[N];
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(graph, i, new boolean[N], visited, cycle);
            }
            if (!cycle[i]) {
                result.add(i);
            }
        }
        return result;
    }

    private void dfs(int[][] graph, int i, boolean[] stack, boolean[] visited, boolean[] cycle) {
        visited[i] = true;

        stack[i] = true;
        for (int j : graph[i]) {
            if (!visited[j]) {
                dfs(graph, j, stack, visited, cycle);
            }
            if (stack[j]) {
                cycle[j] = true;
            }
            if (cycle[j]) {
                cycle[i] = true;
                break;
            }
        }
        stack[i] = false;
    }

}
