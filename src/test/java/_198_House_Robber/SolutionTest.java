package _198_House_Robber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void rob() {
        assertEquals(4, SOLUTION.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, SOLUTION.rob(new int[]{2, 7, 9, 3, 1}));
    }

}