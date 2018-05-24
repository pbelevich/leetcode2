package _207_Course_Schedule;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void canFinish() {
        assertTrue(SOLUTION.canFinish(2, new int[][]{{1, 0}}));
        assertTrue(SOLUTION.canFinish(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
        assertTrue(SOLUTION.canFinish(2, new int[][]{{0, 1}}));
        assertFalse(SOLUTION.canFinish(2, new int[][]{{0, 1}, {1, 0}}));
    }

}