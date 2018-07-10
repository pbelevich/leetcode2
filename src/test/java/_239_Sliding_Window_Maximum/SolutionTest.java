package _239_Sliding_Window_Maximum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxSlidingWindow1() {
        assertArrayEquals(new int[0], SOLUTION.maxSlidingWindow(new int[0], 0));
    }

    @Test
    public void maxSlidingWindow2() {
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, SOLUTION.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
    }

    @Test
    public void maxSlidingWindow3() {
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, SOLUTION.maxSlidingWindow(new int[]{-7, -8, 7, 5, 7, 1, 6, 0}, 4));
    }

}