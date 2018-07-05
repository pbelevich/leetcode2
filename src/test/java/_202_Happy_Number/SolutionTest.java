package _202_Happy_Number;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isHappy() {
        assertTrue(SOLUTION.isHappy(19));
        assertFalse(SOLUTION.isHappy(18));
    }

}