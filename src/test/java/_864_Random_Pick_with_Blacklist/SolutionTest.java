package _864_Random_Pick_with_Blacklist;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void pick() {
        final Solution solution = new Solution(10, new int[]{2, 4, 7});
        for (int i = 0; i < 10000; i++) {
            final int pick = solution.pick();
            assertNotEquals(2, pick);
            assertNotEquals(4, pick);
            assertNotEquals(7, pick);
        }
    }

    @Test
    public void pick2() {
        final Solution solution = new Solution(4, new int[]{0, 1});
        boolean wasTwo = false;
        boolean wasThree = false;
        for (int i = 0; i < 10000; i++) {
            final int pick = solution.pick();
            if (pick == 2) {
                wasTwo = true;
            } else if (pick == 3) {
                wasThree = true;
            } else {
                throw new AssertionError();
            }
        }
        assertTrue(wasTwo);
        assertTrue(wasThree);
    }

}