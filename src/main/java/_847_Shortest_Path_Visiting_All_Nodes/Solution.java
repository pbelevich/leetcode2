package _847_Shortest_Path_Visiting_All_Nodes;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Path {
        final int v;
        final int visited;
        final int cost;

        public Path(int v, int visited, int cost) {
            this.v = v;
            this.visited = visited;
            this.cost = cost;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Path path = (Path) o;

            if (v != path.v) return false;
            return visited == path.visited;
        }

        @Override
        public int hashCode() {
            int result = v;
            result = 31 * result + visited;
            return result;
        }
    }

    public int shortestPathLength(int[][] graph) {
        final int n = graph.length;
        Queue<Path> queue = new LinkedList<>();
        for (int v = 0; v < n; v++) {
            queue.offer(new Path(v, 1 << v, 0));
        }
        Set<Path> set = new HashSet<>();
        while (!queue.isEmpty()) {
            final Path path = queue.poll();
            if (path.visited == ((1 << n) - 1)) {
                return path.cost;
            }
            final int v = path.v;
            for (int w : graph[v]) {
                final Path newPath = new Path(w, path.visited | (1 << w), path.cost + 1);
                if (!set.contains(newPath)) {
                    queue.offer(newPath);
                    set.add(newPath);
                }
            }
        }
        return -1;
    }

}
