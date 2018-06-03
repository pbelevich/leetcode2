package _53_Maximum_Subarray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxSubArray() {
        assertEquals(6, SOLUTION.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(-1, SOLUTION.maxSubArray(new int[]{-1}));
    }

}