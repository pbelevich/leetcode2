package _200_Number_of_Islands.uf;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        final int N = grid.length;
        final int M = grid[0].length;
        int[] uf = new int[N * M];
        int result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == '1') {
                    result++;
                }
                uf[index(i, j, M)] = index(i, j, M);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == '1') {
                    if (i + 1 < N && grid[i + 1][j] == '1' && parent(uf, index(i, j, M)) != parent(uf, index(i + 1, j, M))) {
                        union(uf, index(i, j, M), index(i + 1, j, M));
                        result--;
                    }
                    if (j + 1 < M && grid[i][j + 1] == '1' && parent(uf, index(i, j, M)) != parent(uf, index(i, j + 1, M))) {
                        union(uf, index(i, j, M), index(i, j + 1, M));
                        result--;
                    }
                }
            }
        }
        return result;
    }

    private void union(int[] uf, int i, int j) {
        final int iParent = parent(uf, i);
        final int jParent = parent(uf, j);
        uf[iParent] = jParent;
    }

    private int index(int i, int j, int M) {
        return i * M + j;
    }

    private int parent(int[] uf, int i) {
        while (i != uf[i]) {
            i = uf[i];
        }
        return i;
    }

}
