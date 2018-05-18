package _542_01_Matrix;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private static final int[][] DIR = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    static class Cell {
        final int r;
        final int c;

        Cell(int r, int c) {
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
            return "(" + r + "," + c + ')';
        }
    }

    private int[][] matrix;

    public int[][] updateMatrix(int[][] matrix) {
        this.matrix = matrix;
        Set<Cell> level = new HashSet<>();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (c(r, c) == 1 && (c(r + 1, c) == 0 || c(r - 1, c) == 0 || c(r, c + 1) == 0 || c(r, c - 1) == 0)) {
                    level.add(new Cell(r, c));
                }
            }
        }
        Set<Cell> visited = new HashSet<>(level);
        int levelNo = 2;
        while (!level.isEmpty()) {
            Set<Cell> newLevel = new HashSet<>();
            for (Cell cell : level) {
                for (int[] dir : DIR) {
                    int r = cell.r + dir[0];
                    int c = cell.c + dir[1];
                    final Cell neighbor = new Cell(r, c);
                    if (c(r, c) == 1 && !visited.contains(neighbor)) {
                        newLevel.add(neighbor);
                        visited.add(neighbor);
                        matrix[r][c] = levelNo;
                    }
                }
            }
            level = newLevel;
            levelNo++;
        }

        return matrix;
    }

    private int c(int r, int c) {
        if (r >= 0 && r < matrix.length && c >= 0 && c < matrix[r].length) {
            return matrix[r][c];
        } else {
            return -1;
        }
    }

}
