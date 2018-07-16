package _200_Number_of_Islands.dfs;

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
                    dfs(grid, i, j, visited);
                    result++;
                }
            }
        }
        return result;
    }

    private void dfs(char[][] grid, int i, int j, boolean[][] visited) {
        final int N = grid.length;
        final int M = grid[0].length;
        visited[i][j] = true;
        for (int[] dir : DIR) {
            int nextR = i + dir[0];
            int nextC = j + dir[1];
            if (0 <= nextR && nextR < N && 0 <= nextC && nextC < M && grid[nextR][nextC] == '1' && !visited[nextR][nextC]) {
                dfs(grid, nextR, nextC, visited);
                visited[nextR][nextC] = true;
            }
        }
    }

}
