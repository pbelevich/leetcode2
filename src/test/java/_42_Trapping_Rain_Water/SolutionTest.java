package _42_Trapping_Rain_Water;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void trap() {
        assertEquals(6, SOLUTION.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(2, SOLUTION.trap(new int[]{2, 0, 2}));
    }
}