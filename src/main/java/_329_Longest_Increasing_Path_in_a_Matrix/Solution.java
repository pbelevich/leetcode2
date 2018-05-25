package _329_Longest_Increasing_Path_in_a_Matrix;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Cell {
        final int r;
        final int c;

        public Cell(int r, int c) {
            this.r = r;
            this.c = c;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Cell cell = (Cell) o;

            if (r != cell.r) return false;
            return c == cell.c;
        }

        @Override
        public int hashCode() {
            int result = r;
            result = 31 * result + c;
            return result;
        }

        @Override
        public String toString() {
            return "(" + r + "," + c + ")";
        }

    }

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        Collection<Cell> roots = new ArrayList<>();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (!visited[r][c]) {
                    dfs(matrix, visited, new Cell(r, c), roots);
                }
            }
        }
        visited = new boolean[matrix.length][matrix[0].length];
        int max = 0;
        Map<Cell, Integer> cache = new HashMap<>();
        for (Cell root : roots) {
            max = Math.max(max, max(cache, matrix, visited, root));
        }
        return max;
    }

    private int max(Map<Cell, Integer> cache, int[][] matrix, boolean[][] visited, Cell cell) {
        return cache.computeIfAbsent(cell, c -> {
            int max = 0;
            for (int[] dir : DIR) {
                final Cell n = new Cell(c.r + dir[0], c.c + dir[1]);
                if (n.r >= 0 && n.r < matrix.length && n.c >= 0 && n.c < matrix[n.r].length && matrix[n.r][n.c] > matrix[c.r][c.c]) {
                    max = Math.max(max, max(cache, matrix, visited, n));
                }
            }
            return max + 1;
        });
    }

    private final static int[][] DIR = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private void dfs(int[][] matrix, boolean[][] visited, Cell c, Collection<Cell> roots) {
        visited[c.r][c.c] = true;
        boolean root = true;
        for (int[] dir : DIR) {
            final Cell n = new Cell(c.r + dir[0], c.c + dir[1]);
            if (n.r >= 0 && n.r < matrix.length && n.c >= 0 && n.c < matrix[n.r].length && matrix[n.r][n.c] < matrix[c.r][c.c]) {
                root = false;
                if (!visited[n.r][n.c]) {
                    dfs(matrix, visited, n, roots);
                }
            }
        }
        if (root) {
            roots.add(c);
        }
    }

}
