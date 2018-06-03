package _846_Hand_of_Straights;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isNStraightHand() {
        assertTrue(SOLUTION.isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
        assertFalse(SOLUTION.isNStraightHand(new int[]{1, 2, 3, 4, 5}, 4));
    }

}