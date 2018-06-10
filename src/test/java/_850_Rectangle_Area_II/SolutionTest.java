package _850_Rectangle_Area_II;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void rectangleArea() {
        assertEquals(6, SOLUTION.rectangleArea(new int[][]{{0, 0, 2, 2}, {1, 0, 2, 3}, {1, 0, 3, 1}}));
        assertEquals(49, SOLUTION.rectangleArea(new int[][]{{0, 0, 1000000000, 1000000000}}));
        assertEquals(2, SOLUTION.rectangleArea(new int[][]{{0, 0, 1, 1}, {2, 2, 3, 3}}));
    }

}