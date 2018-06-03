package _152_Maximum_Product_Subarray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxProduct() {
        assertEquals(6, SOLUTION.maxProduct(new int[]{2, 3, -2, 4}));
        assertEquals(0, SOLUTION.maxProduct(new int[]{-2, 0, -1}));
        assertEquals(2, SOLUTION.maxProduct(new int[]{0, 2}));
        assertEquals(4, SOLUTION.maxProduct(new int[]{3, -1, 4}));
        assertEquals(-2, SOLUTION.maxProduct(new int[]{-2}));
    }

}