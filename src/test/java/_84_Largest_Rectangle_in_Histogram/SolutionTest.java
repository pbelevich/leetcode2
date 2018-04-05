package _84_Largest_Rectangle_in_Histogram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void largestRectangleArea() {
        assertEquals(1, SOLUTION.largestRectangleArea(new int[]{1}));
        assertEquals(4, SOLUTION.largestRectangleArea(new int[]{1, 2, 3}));
        assertEquals(6, SOLUTION.largestRectangleArea(new int[]{2, 2, 2}));
        assertEquals(4, SOLUTION.largestRectangleArea(new int[]{3, 2, 1}));
        assertEquals(6, SOLUTION.largestRectangleArea(new int[]{1, 2, 3, 4, 1}));

        assertEquals(10, SOLUTION.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

}