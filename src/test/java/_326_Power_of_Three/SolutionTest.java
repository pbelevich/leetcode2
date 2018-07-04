package _326_Power_of_Three;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isPowerOfThree() {
        assertTrue(SOLUTION.isPowerOfThree(1));
        assertTrue(SOLUTION.isPowerOfThree(9));
        assertTrue(SOLUTION.isPowerOfThree(1162261467));
        assertFalse(SOLUTION.isPowerOfThree(0));
        assertFalse(SOLUTION.isPowerOfThree(-1));
        assertFalse(SOLUTION.isPowerOfThree(-9));
        assertFalse(SOLUTION.isPowerOfThree(-1162261467));
        assertFalse(SOLUTION.isPowerOfThree(123456));
    }

}