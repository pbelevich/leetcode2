package _865_Shortest_Path_to_Get_All_Keys;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import static java.lang.Character.toLowerCase;

/**
 * @author Pavel Belevich
 */
public class Solution {

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
    }

    public int shortestPathAllKeys(String[] grid) {
        final int N = grid.length;
        final int M = grid[0].length();
        char[][] chars = new char[N][];
        Cell start = null;
        int numberOfKeys = 0;
        for (int r = 0; r < N; r++) {
            chars[r] = grid[r].toCharArray();
            for (int c = 0; c < M; c++) {
                final char ch = chars[r][c];
                if (ch == '@') {
                    start = new Cell(r, c);
                    chars[r][c] = '.';
                } else if (isKey(ch)) {
                    numberOfKeys++;
                }
            }
        }
        return shortestPathAllKeys(chars, numberOfKeys, Collections.emptySet(), start);
    }

    private int shortestPathAllKeys(char[][] chars, int numberOfKeys, Set<Character> keys, Cell start) {
        if (numberOfKeys == keys.size()) {
            return 0;
        }
        final int N = chars.length;
        final int M = chars[0].length;
        int result = Integer.MAX_VALUE;
        Queue<Cell> q = new ArrayDeque<>();
        Map<Cell, Integer> distTo = new HashMap<>();
        q.offer(start);
        distTo.put(start, 0);
        while (!q.isEmpty()) {
            final Cell c = q.poll();
            final char ch = chars[c.r][c.c];
            final int dist = distTo.get(c);
            if (isKey(ch) && !keys.contains(ch)) {
                final HashSet<Character> newKeys = new HashSet<>(keys);
                newKeys.add(ch);
                final int subProblem = shortestPathAllKeys(chars, numberOfKeys, newKeys, c);
                if (subProblem != -1) {
                    result = Math.min(result, dist + subProblem);
                }
            } else {
                for (int[] dir : DIRS) {
                    int nextR = c.r + dir[0];
                    int nextC = c.c + dir[1];
                    if (0 <= nextR && nextR < N && 0 <= nextC && nextC < M) {
                        final char nextCh = chars[nextR][nextC];
                        if (nextCh == '.' || isKey(nextCh) || (isDoor(nextCh) && keys.contains(toLowerCase(nextCh)))) {
                            final Cell next = new Cell(nextR, nextC);
                            if (!distTo.containsKey(next)) {
                                q.offer(next);
                                distTo.put(next, dist + 1);
                            }
                        }
                    }
                }
            }
        }
        if (result == Integer.MAX_VALUE) {
            return -1;
        }
        return result;
    }

    private static final int[][] DIRS = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private boolean isDoor(char ch) {
        return 'A' <= ch && ch <= 'F';
    }

    private boolean isKey(char ch) {
        return 'a' <= ch && ch <= 'f';
    }

}
