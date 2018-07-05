package _812_Largest_Triangle_Area;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();
    public static final double DELTA = 1e-9;

    @Test
    public void largestTriangleArea() {
        assertEquals(2.0, SOLUTION.largestTriangleArea(new int[][]{{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}}), DELTA);
    }

}