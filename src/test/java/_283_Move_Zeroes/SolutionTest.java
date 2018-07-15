package _283_Move_Zeroes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void moveZeroes() {
        final int[] a = {0, 1, 0, 3, 12};
        SOLUTION.moveZeroes(a);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, a);
    }

}