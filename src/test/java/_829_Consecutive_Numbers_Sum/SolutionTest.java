package _829_Consecutive_Numbers_Sum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void consecutiveNumbersSum() {
        assertEquals(1, SOLUTION.consecutiveNumbersSum(1));
        assertEquals(1, SOLUTION.consecutiveNumbersSum(2));
        assertEquals(2, SOLUTION.consecutiveNumbersSum(3));
        assertEquals(1, SOLUTION.consecutiveNumbersSum(4));
        assertEquals(2, SOLUTION.consecutiveNumbersSum(5));
        assertEquals(2, SOLUTION.consecutiveNumbersSum(6));
        assertEquals(2, SOLUTION.consecutiveNumbersSum(7));
        assertEquals(1, SOLUTION.consecutiveNumbersSum(8));
        assertEquals(3, SOLUTION.consecutiveNumbersSum(9));
        assertEquals(2, SOLUTION.consecutiveNumbersSum(10));
        assertEquals(2, SOLUTION.consecutiveNumbersSum(11));
        assertEquals(2, SOLUTION.consecutiveNumbersSum(12));
        assertEquals(2, SOLUTION.consecutiveNumbersSum(13));
        assertEquals(2, SOLUTION.consecutiveNumbersSum(14));
        assertEquals(4, SOLUTION.consecutiveNumbersSum(15));
    }

}