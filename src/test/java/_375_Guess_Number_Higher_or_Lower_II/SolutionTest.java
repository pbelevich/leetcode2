package _375_Guess_Number_Higher_or_Lower_II;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void getMoneyAmount() {
        assertEquals(0, SOLUTION.getMoneyAmount(1));
        assertEquals(1, SOLUTION.getMoneyAmount(2));
        assertEquals(2, SOLUTION.getMoneyAmount(3));
        assertEquals(4, SOLUTION.getMoneyAmount(4));
        assertEquals(6, SOLUTION.getMoneyAmount(5));
        assertEquals(8, SOLUTION.getMoneyAmount(6));
        assertEquals(10, SOLUTION.getMoneyAmount(7));
        assertEquals(49, SOLUTION.getMoneyAmount(20));
    }

}