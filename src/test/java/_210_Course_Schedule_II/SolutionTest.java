package _210_Course_Schedule_II;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findOrder() {
        assertArrayEquals(new int[]{0, 1}, SOLUTION.findOrder(2, new int[][]{{1, 0}}));
        assertArrayEquals(new int[]{0, 1, 2, 3}, SOLUTION.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
        assertArrayEquals(new int[]{1, 0}, SOLUTION.findOrder(2, new int[][]{{0, 1}}));
        assertArrayEquals(new int[]{}, SOLUTION.findOrder(2, new int[][]{{0, 1}, {1, 0}}));
    }

}