package _463_Island_Perimeter;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int islandPerimeter(int[][] grid) {
        final int N = grid.length;
        final int M = grid[0].length;
        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == 1) {
                    for (int[] dir : DIR) {
                        int x = i + dir[0];
                        int y = j + dir[1];
                        if (x < 0 || x >= N || y < 0 || y >= M || grid[x][y] == 0) {
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }

    private int[][] DIR = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

}
