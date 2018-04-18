package _238_Product_of_Array_Except_Self;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void productExceptSelf() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, new Solution().productExceptSelf(new int[]{1, 2, 3, 4}));
    }

}