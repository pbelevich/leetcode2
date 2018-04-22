package _494_Target_Sum.memoization;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findTargetSumWays() {
        assertEquals(5, SOLUTION.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
        assertEquals(1, SOLUTION.findTargetSumWays(new int[]{1000}, -1000));
        assertEquals(0, SOLUTION.findTargetSumWays(new int[]{1, 2, 7, 9, 981}, 1000000000));
    }

}