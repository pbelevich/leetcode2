package _207_Course_Schedule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Collection<Integer>[] adj = new Collection[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : prerequisites) {
            adj[edge[0]].add(edge[1]);
        }

        boolean[] visited = new boolean[numCourses];
        Stack<Integer> stack = new Stack<>();
        try {
            for (int i = 0; i < numCourses; i++) {
                if (!visited[i]) {
                    dfs(adj, i, visited, stack);
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private void dfs(Collection<Integer>[] adj, int i, boolean[] visited, Stack<Integer> stack) throws Exception {
        stack.push(i);
        visited[i] = true;
        for (int j : adj[i]) {
            if (stack.contains(j)) {
                throw new Exception();
            }
            if (!visited[j]) {
                dfs(adj, j, visited, stack);
            }
        }
        stack.pop();
    }

}
