package _231_Power_of_Two;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isPowerOfTwo() {
        assertTrue(SOLUTION.isPowerOfTwo(1));
        assertTrue(SOLUTION.isPowerOfTwo(16));
        assertTrue(SOLUTION.isPowerOfTwo(32768));
        assertFalse(SOLUTION.isPowerOfTwo(0));
        assertFalse(SOLUTION.isPowerOfTwo(-1));
        assertFalse(SOLUTION.isPowerOfTwo(-16));
        assertFalse(SOLUTION.isPowerOfTwo(Integer.MIN_VALUE / 2));
        assertFalse(SOLUTION.isPowerOfTwo(Integer.MIN_VALUE));
        assertFalse(SOLUTION.isPowerOfTwo(Integer.MAX_VALUE));
    }

}