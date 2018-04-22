package _64_Minimum_Path_Sum;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private int[][] grid;

    public int minPathSum(int[][] grid) {
        this.grid = grid;
        int h = grid.length;
        int w = grid[0].length;

        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                grid[r][c] += Math.min(f(r - 1, c), f(r, c - 1));
            }
        }

        return grid[h - 1][w - 1];
    }

    private int f(int r, int c) {
        if ((r == -1 && c == 0) || (r == 0 && c == -1)) {
            return 0;
        } else if (r < 0 || c < 0) {
            return Integer.MAX_VALUE;
        } else {
            return grid[r][c];
        }
    }

}
