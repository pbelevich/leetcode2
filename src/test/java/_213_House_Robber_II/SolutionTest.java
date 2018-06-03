package _213_House_Robber_II;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void rob() {
        assertEquals(3, SOLUTION.rob(new int[]{2, 3, 2}));
        assertEquals(4, SOLUTION.rob(new int[]{1, 2, 3, 1}));
        assertEquals(2, SOLUTION.rob(new int[]{2}));
        assertEquals(103, SOLUTION.rob(new int[]{1, 3, 1, 3, 100}));
        assertEquals(0, SOLUTION.rob(new int[]{}));
    }

}