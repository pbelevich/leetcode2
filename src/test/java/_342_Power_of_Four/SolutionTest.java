package _342_Power_of_Four;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isPowerOfFour() {
        assertTrue(SOLUTION.isPowerOfFour(1));
        assertTrue(SOLUTION.isPowerOfFour(4));
        assertTrue(SOLUTION.isPowerOfFour(16));
        assertFalse(SOLUTION.isPowerOfFour(0));
        assertFalse(SOLUTION.isPowerOfFour(-1));
        assertFalse(SOLUTION.isPowerOfFour(-4));
        assertFalse(SOLUTION.isPowerOfFour(-16));
        assertFalse(SOLUTION.isPowerOfFour(13));
        assertFalse(SOLUTION.isPowerOfFour(2));
        assertFalse(SOLUTION.isPowerOfFour(8));
    }

}