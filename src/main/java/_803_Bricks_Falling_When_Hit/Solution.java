package _803_Bricks_Falling_When_Hit;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] hitBricks(int[][] grid, int[][] hits) {
        int[] prev = new int[hits.length];
        for (int i = 0; i < hits.length; i++) {
            int[] hit = hits[i];
            final int r = hit[0];
            final int c = hit[1];
            prev[i] = grid[r][c];
            grid[r][c] = 0;
        }

        final int N = grid.length;
        final int M = grid[0].length;

        int[] uf = new int[N * M + 1];
        int[] sz = new int[N * M + 1];
        for (int i = 0; i < N * M; i++) {
            uf[i] = i;
            sz[i] = 1;
        }
        uf[N * M] = N * M;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < M; c++) {
                if (r > 0 && grid[r][c] == 1 && grid[r - 1][c] == 1) {
                    union(uf, sz, r * M + c, (r - 1) * M + c);
                }
                if (c > 0 && grid[r][c] == 1 && grid[r][c - 1] == 1) {
                    union(uf, sz, r * M + c, r * M + c - 1);
                }
            }
        }

        int[] result = new int[hits.length];

        for (int c = 0; c < M; c++) {
            if (grid[0][c] == 1) {
                union(uf, sz, c, N * M);
            }
        }
        int size = sz[parent(uf, N * M)];

        for (int i = hits.length - 1; i >= 0; i--) {
            int[] hit = hits[i];
            final int r = hit[0];
            final int c = hit[1];
            if (prev[i] == 1) {
                grid[r][c] = 1;
                if (r == 0) {
                    union(uf, sz, r * M + c, N * M);
                }
                if (r > 0 && grid[r - 1][c] == 1) {
                    union(uf, sz, r * M + c, (r - 1) * M + c);
                }
                if (c > 0 && grid[r][c - 1] == 1) {
                    union(uf, sz, r * M + c, r * M + c - 1);
                }
                if (r < N - 1 && grid[r + 1][c] == 1) {
                    union(uf, sz, r * M + c, (r + 1) * M + c);
                }
                if (c < M - 1 && grid[r][c + 1] == 1) {
                    union(uf, sz, r * M + c, r * M + c + 1);
                }

                int newSize = sz[parent(uf, N * M)];
                if (newSize != size) {
                    result[i] = newSize - size - 1;
                }
                size = newSize;
            }
        }

        return result;
    }

    private int parent(int[] uf, int i) {
        int p = i;
        while (p != uf[p]) {
            p = uf[p];
        }
        return p;
    }

    private void union(int[] uf, int[] sz, int i, int j) {
        int ip = parent(uf, i);
        int jp = parent(uf, j);
        if (ip != jp) {
            if (sz[ip] < sz[jp]) {
                uf[ip] = jp;
                sz[jp] += sz[ip];
            } else {
                uf[jp] = ip;
                sz[ip] += sz[jp];
            }
        }
    }

}
