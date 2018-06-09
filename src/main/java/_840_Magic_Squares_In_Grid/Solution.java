package _840_Magic_Squares_In_Grid;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int numMagicSquaresInside(int[][] grid) {
        int res = 0;
        for (int r = 0; r < grid.length - 2; r++) {
            for (int c = 0; c < grid[r].length - 2; c++) {
                if (magic(grid, r, c)) {
                    res++;
                }
            }
        }
        return res;
    }

    private boolean magic(int[][] grid, int r, int c) {
        return check(grid, r, c) &&
                15 == row(grid, r, c) &&
                15 == row(grid, r + 1, c) &&
                15 == row(grid, r + 2, c) &&
                15 == col(grid, r, c) &&
                15 == col(grid, r, c + 1) &&
                15 == col(grid, r, c + 2) &&
                15 == diag1(grid, r + 1, c + 1) &&
                15 == diag2(grid, r + 1, c + 1);
    }

    private int row(int[][] grid, int r, int c) {
        return grid[r][c] + grid[r][c + 1] + grid[r][c + 2];
    }

    private int col(int[][] grid, int r, int c) {
        return grid[r][c] + grid[r + 1][c] + grid[r + 2][c];
    }

    private int diag1(int[][] grid, int r, int c) {
        return grid[r - 1][c - 1] + grid[r][c] + grid[r + 1][c + 1];
    }

    private int diag2(int[][] grid, int r, int c) {
        return grid[r - 1][c + 1] + grid[r][c] + grid[r + 1][c - 1];
    }

    private boolean check(int[][] grid, int r, int c) {
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9) {
                    return false;
                }
            }
        }
        return true;
    }

}
