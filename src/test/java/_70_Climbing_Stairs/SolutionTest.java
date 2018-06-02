package _70_Climbing_Stairs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void climbStairs() {
        assertEquals(1, SOLUTION.climbStairs(1));
        assertEquals(2, SOLUTION.climbStairs(2));
        assertEquals(3, SOLUTION.climbStairs(3));
    }

}