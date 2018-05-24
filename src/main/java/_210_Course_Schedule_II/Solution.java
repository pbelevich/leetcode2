package _210_Course_Schedule_II;

import java.util.*;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Collection<Integer>[] adj = new Collection[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : prerequisites) {
            adj[edge[0]].add(edge[1]);
        }

        boolean[] visited = new boolean[numCourses];
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        try {
            for (int i = 0; i < numCourses; i++) {
                if (!visited[i]) {
                    dfs(adj, i, visited, result, stack);
                }
            }
        } catch (Exception e) {
            return new int[]{};
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private void dfs(Collection<Integer>[] adj, int i, boolean[] visited, List<Integer> result, Stack<Integer> stack) throws Exception {
        stack.push(i);
        visited[i] = true;
        for (int j : adj[i]) {
            if (stack.contains(j)) {
                throw new Exception();
            }
            if (!visited[j]) {
                dfs(adj, j, visited, result, stack);
            }
        }
        result.add(i);
        stack.pop();
    }

}
