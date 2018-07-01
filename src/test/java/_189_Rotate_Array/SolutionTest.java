package _189_Rotate_Array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void rotate() {
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, r(new int[]{1, 2, 3, 4, 5, 6, 7}, 3));
        assertArrayEquals(new int[]{-1}, r(new int[]{-1}, 2));
    }

    int[] r(int[] a, int k) {
        SOLUTION.rotate(a, k);
        return a;
    }

}