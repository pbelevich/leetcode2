package _518_Coin_Change_2.first;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void change() {
        assertEquals(1, SOLUTION.change(0, new int[]{}));
        assertEquals(0, SOLUTION.change(7, new int[]{}));
        assertEquals(1, SOLUTION.change(1, new int[]{1}));
        assertEquals(1, SOLUTION.change(2, new int[]{1}));
        assertEquals(1, SOLUTION.change(3, new int[]{1}));
        assertEquals(2, SOLUTION.change(2, new int[]{2, 1}));
        assertEquals(2, SOLUTION.change(3, new int[]{2, 1}));
        assertEquals(3, SOLUTION.change(4, new int[]{2, 1}));
        assertEquals(4, SOLUTION.change(5, new int[]{5, 2, 1}));
    }

}