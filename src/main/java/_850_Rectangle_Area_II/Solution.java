package _850_Rectangle_Area_II;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private static final int ALPHA = 1_000_000_007;

    public int rectangleArea(int[][] rectangles) {
        SortedSet<Integer> xSet = new TreeSet<>();
        SortedSet<Integer> ySet = new TreeSet<>();
        for (int[] rect : rectangles) {
            xSet.add(rect[0]);
            ySet.add(rect[1]);
            xSet.add(rect[2]);
            ySet.add(rect[3]);
        }

        final int h = ySet.size();
        int r = 0;
        int[] rToY = new int[h];
        Map<Integer, Integer> yToR = new HashMap<>();
        for (int y : ySet) {
            yToR.put(y, r);
            rToY[r++] = y;
        }

        final int w = xSet.size();
        int c = 0;
        int[] cToX = new int[w];
        Map<Integer, Integer> xToC = new HashMap<>();
        for (int x : xSet) {
            xToC.put(x, c);
            cToX[c++] = x;
        }

        int area = 0;
        boolean[][] map = new boolean[h][w];
        for (int[] rect : rectangles) {
            int c1 = xToC.get(rect[0]);
            int r1 = yToR.get(rect[1]);
            int c2 = xToC.get(rect[2]);
            int r2 = yToR.get(rect[3]);
            for (r = r1; r < r2; r++) {
                for (c = c1; c < c2; c++) {
                    if (!map[r][c]) {
                        final long width = (long) cToX[c + 1] - cToX[c];
                        final long height = (long) rToY[r + 1] - rToY[r];
                        final long a = (width * height) % ALPHA;
                        area += a;
                        area %= ALPHA;
                        map[r][c] = true;
                    }
                }
            }
        }

        return area;
    }

}
