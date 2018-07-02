package _122_Best_Time_to_Buy_and_Sell_Stock_II;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxProfit() {
        assertEquals(7, SOLUTION.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        assertEquals(4, SOLUTION.maxProfit(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, SOLUTION.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

}