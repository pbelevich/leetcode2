package _803_Bricks_Falling_When_Hit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void hitBricks() {
        assertArrayEquals(new int[]{2}, SOLUTION.hitBricks(new int[][]{
                {1, 0, 0, 0},
                {1, 1, 1, 0}}, new int[][]{{1, 0}}));
        assertArrayEquals(new int[]{0, 0}, SOLUTION.hitBricks(new int[][]{
                {1, 0, 0, 0},
                {1, 1, 0, 0}}, new int[][]{{1, 1}, {1, 0}}));
        assertArrayEquals(new int[]{1, 0, 1, 0, 0}, SOLUTION.hitBricks(new int[][]{
                {1}, {1}, {1}, {1}, {1}}, new int[][]{{3, 0}, {4, 0}, {1, 0}, {2, 0}, {0, 0}}));
    }

    @Test
    public void hitBricks2() {
        assertArrayEquals(new int[]{0, 2, 0, 0, 0, 0, 2},
                SOLUTION.hitBricks(new int[][]{
                                {1, 1, 1, 0, 1, 1, 1, 1},
                                {1, 0, 0, 0, 0, 1, 1, 1},
                                {1, 1, 1, 0, 0, 0, 1, 1},
                                {1, 1, 0, 0, 0, 0, 0, 0},
                                {1, 0, 0, 0, 0, 0, 0, 0},
                                {1, 0, 0, 0, 0, 0, 0, 0}
                        },
                        new int[][]{{4, 6}, {3, 0}, {2, 3}, {2, 6}, {4, 1}, {5, 2}, {2, 1}})
        );
    }

    @Test
    public void hitBricks3() {
        assertArrayEquals(
                new int[]{0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                SOLUTION.hitBricks(new int[][]{
                                {0, 1, 1, 1, 1, 1, 1, 1, 1},
                                {1, 1, 1, 1, 1, 1, 1, 1, 1},
                                {0, 0, 0, 1, 0, 0, 1, 1, 1},
                                {0, 0, 1, 1, 0, 1, 1, 1, 0},
                                {0, 0, 0, 0, 0, 1, 1, 1, 1},
                                {0, 0, 0, 0, 0, 0, 0, 1, 0}
                        },
                        new int[][]{
                                {1, 8},
                                {2, 1},
                                {1, 4},
                                {3, 0},
                                {3, 4},
                                {0, 7},
                                {1, 6},
                                {0, 8},
                                {2, 5},
                                {3, 2},
                                {2, 0},
                                {0, 2},
                                {0, 5},
                                {0, 1},
                                {4, 8},
                                {3, 7},
                                {0, 6},
                                {5, 7},
                                {5, 3},
                                {2, 6},
                                {2, 2},
                                {5, 8},
                                {2, 8},
                                {4, 0},
                                {3, 3},
                                {1, 1},
                                {0, 0},
                                {4, 7},
                                {0, 3},
                                {2, 4},
                                {3, 1},
                                {1, 0},
                                {5, 2},
                                {3, 8},
                                {4, 2},
                                {5, 0},
                                {1, 2},
                                {1, 7},
                                {3, 6},
                                {4, 1},
                                {5, 6},
                                {0, 4},
                                {5, 5},
                                {5, 4},
                                {1, 5},
                                {4, 4},
                                {3, 5},
                                {4, 6},
                                {2, 3},
                                {2, 7}
                        }));

    }
}