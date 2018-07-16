package _200_Number_of_Islands.bfs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private int[][] DIR = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        final int N = grid.length;
        final int M = grid[0].length;
        boolean[][] visited = new boolean[N][M];
        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(grid, i, j, visited);
                    result++;
                }
            }
        }
        return result;
    }

    private void bfs(char[][] grid, int i, int j, boolean[][] visited) {
        final int N = grid.length;
        final int M = grid[0].length;
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(index(i, j, M));
        while (!q.isEmpty()) {
            int index = q.poll();
            int r = index / M;
            int c = index % M;
            for (int[] dir : DIR) {
                int nextR = r + dir[0];
                int nextC = c + dir[1];
                if (0 <= nextR && nextR < N && 0 <= nextC && nextC < M && grid[nextR][nextC] == '1' && !visited[nextR][nextC]) {
                    q.offer(index(nextR, nextC, M));
                    visited[nextR][nextC] = true;
                }
            }
        }
    }

    private int index(int i, int j, int M) {
        return i * M + j;
    }

}
