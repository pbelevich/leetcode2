package _857_Minimum_Cost_to_Hire_K_Workers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();
    public static final double DELTA = 1e-5;

    @Test
    public void mincostToHireWorkers() {
        assertEquals(105.0, SOLUTION.mincostToHireWorkers(new int[]{10, 20, 5}, new int[]{70, 50, 30}, 2), DELTA);
        assertEquals(30.66667, SOLUTION.mincostToHireWorkers(new int[]{3, 1, 10, 10, 1}, new int[]{4, 8, 2, 2, 7}, 3), DELTA);
    }

}