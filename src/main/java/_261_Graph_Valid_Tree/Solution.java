package _261_Graph_Valid_Tree;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
            return false;
        }
        int[] uf = new int[n];
        for (int i = 0; i < n; i++) {
            uf[i] = i;
        }
        for (int[] edge : edges) {
            final int i = find(uf, edge[0]);
            final int j = find(uf, edge[1]);
            if (i == j) {
                return false;
            } else {
                uf[i] = j;
            }
        }
        return true;
    }

    private int find(int[] uf, int i) {
        while (i != uf[i]) {
            i = uf[i];
        }
        return i;
    }

}
