package _218_The_Skyline_Problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void getSkyline0() {
        assertArrayEquals(
                new int[][]{},
                SOLUTION.getSkyline(new int[][]{}).toArray()
        );
    }

    @Test
    public void getSkyline1() {
        assertArrayEquals(
                new int[][]{{2, 10}, {3, 15}, {7, 12}, {12, 0}, {15, 10}, {20, 8}, {24, 0}},
                SOLUTION.getSkyline(new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}}).toArray()
        );
    }

    @Test
    public void getSkyline2() {
        assertArrayEquals(
                new int[][]{{1, 3}, {2, 0}},
                SOLUTION.getSkyline(new int[][]{{1, 2, 1}, {1, 2, 2}, {1, 2, 3}}).toArray()
        );
    }

    @Test
    public void getSkyline3() {
        assertArrayEquals(
                new int[][]{{1, 1}, {2, 0}, {2147483646, 2147483647}, {2147483647, 0}},
                SOLUTION.getSkyline(new int[][]{{1, 2, 1}, {2147483646, 2147483647, 2147483647}}).toArray()
        );
    }

    @Test
    public void getSkyline4() {
        assertArrayEquals(
                new int[][]{{1, 2}, {2, 1}, {3, 0}},
                SOLUTION.getSkyline(new int[][]{{1, 2, 2}, {1, 3, 1}}).toArray()
        );
    }

    @Test
    public void getSkyline5() {
        assertArrayEquals(
                new int[][]{{3, 8}, {7, 7}, {8, 6}, {9, 5}, {10, 4}, {11, 3}, {12, 2}, {13, 1}, {14, 0}},
                SOLUTION.getSkyline(new int[][]{{3, 7, 8}, {3, 8, 7}, {3, 9, 6}, {3, 10, 5}, {3, 11, 4}, {3, 12, 3}, {3, 13, 2}, {3, 14, 1}}).toArray()
        );
    }

    @Test
    public void getSkyline6() {
        assertArrayEquals(
                new int[][]{{1, 2}, {3, 0}},
                SOLUTION.getSkyline(new int[][]{{1, 3, 2}, {1, 2, 1}}).toArray()
        );
    }

    @Test
    public void getSkyline7() {
        assertArrayEquals(
                new int[][]{{3, 20}, {10, 0}},
                SOLUTION.getSkyline(new int[][]{{3, 10, 20}, {3, 9, 19}, {3, 8, 18}, {3, 7, 17}, {3, 6, 16}, {3, 5, 15}, {3, 4, 14}}).toArray()
        );
    }

    @Test
    public void getSkyline8() {
        assertArrayEquals(
                new int[][]{{0, 7}, {5, 12}, {10, 7}, {15, 12}, {20, 7}, {25, 0}},
                SOLUTION.getSkyline(new int[][]{{0, 5, 7}, {5, 10, 7}, {5, 10, 12}, {10, 15, 7}, {15, 20, 7}, {15, 20, 12}, {20, 25, 7}}).toArray()
        );
    }

    @Test
    public void getSkyline9() {
        assertArrayEquals(
                new int[][]{{0, 3}, {5, 0}},
                SOLUTION.getSkyline(new int[][]{{0, 2, 3}, {2, 5, 3}}).toArray()
        );
    }

}