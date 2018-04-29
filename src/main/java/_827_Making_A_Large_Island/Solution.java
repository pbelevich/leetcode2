package _827_Making_A_Large_Island;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private int n;
    private int m;
    private int[] uf;
    private int[] sz;
    private int max;

    private static final int[][] DIR = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int largestIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        uf = new int[n * m];
        sz = new int[n * m];
        for (int i = 0; i < n * m; i++) {
            uf[i] = i;
            sz[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, 1);
                    if (i >= 1 && grid[i - 1][j] == 1) {
                        union(i, j, i - 1, j);
                    }
                    if (j >= 1 && grid[i][j - 1] == 1) {
                        union(i, j, i, j - 1);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> islands = new HashSet<>();
                    for (int[] dir : DIR) {
                        final int i1 = i + dir[0];
                        final int j1 = j + dir[1];
                        if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < m) {
                            if (grid[i1][j1] == 1) {
                                islands.add(find(i1, j1));
                            }
                        }
                    }

                    int area = 1;
                    for (int island : islands) {
                        area += sz[island];
                    }
                    max = Math.max(max, area);
                }
            }
        }

        return max;
    }

    private void union(int i1, int j1, int i2, int j2) {
        int p1 = find(i1, j1);
        int p2 = find(i2, j2);
        if (p1 != p2) {
            if (sz[p1] < sz[p2]) {
                uf[p2] = p1;
                sz[p1] += sz[p2];
                max = Math.max(max, sz[p1]);
            } else {
                uf[p1] = p2;
                sz[p2] += sz[p1];
                max = Math.max(max, sz[p2]);
            }
        }
    }

    private int find(int i, int j) {
        int p = i * n + j;
        while (p != uf[p]) {
            p = uf[p];
        }
        return p;
    }

}
