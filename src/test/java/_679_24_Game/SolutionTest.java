package _679_24_Game;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void judgePoint24() {
        assertTrue(SOLUTION.judgePoint24(new int[]{4, 1, 8, 7}));
        assertFalse(SOLUTION.judgePoint24(new int[]{1, 2, 1, 2}));
        assertTrue(SOLUTION.judgePoint24(new int[]{7, 2, 6, 6}));
        assertTrue(SOLUTION.judgePoint24(new int[]{3, 3, 8, 8}));
    }

}