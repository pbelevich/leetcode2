package _746_Min_Cost_Climbing_Stairs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void minCostClimbingStairs() {
        assertEquals(15, SOLUTION.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, SOLUTION.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

}