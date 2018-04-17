package _55_Jump_Game;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void canJump() {
        assertTrue(SOLUTION.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(SOLUTION.canJump(new int[]{3, 2, 1, 0, 4}));
        assertTrue(SOLUTION.canJump(new int[]{0}));
    }
}