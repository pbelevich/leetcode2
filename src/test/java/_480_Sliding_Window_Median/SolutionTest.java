package _480_Sliding_Window_Median;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();
    public static final double DELTA = 1e-9;

    @Test
    public void medianSlidingWindow1() {
        assertArrayEquals(new double[]{1, -1, -1, 3, 5, 6}, SOLUTION.medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3), DELTA);
    }

    @Test
    public void medianSlidingWindow2() {
        assertArrayEquals(new double[]{0, 1, 1, 4, 5.5}, SOLUTION.medianSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 4), DELTA);
    }

    @Test
    public void medianSlidingWindow3() {
        assertArrayEquals(new double[]{Integer.MAX_VALUE}, SOLUTION.medianSlidingWindow(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, 2), DELTA);
    }

}