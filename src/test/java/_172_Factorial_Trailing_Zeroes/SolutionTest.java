package _172_Factorial_Trailing_Zeroes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void trailingZeroes() {
        assertEquals(0, SOLUTION.trailingZeroes(1));
        assertEquals(1, SOLUTION.trailingZeroes(5));
        assertEquals(6, SOLUTION.trailingZeroes(25));
        assertEquals(31, SOLUTION.trailingZeroes(125));
    }
}