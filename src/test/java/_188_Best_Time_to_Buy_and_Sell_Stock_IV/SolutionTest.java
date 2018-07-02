package _188_Best_Time_to_Buy_and_Sell_Stock_IV;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxProfit() {
        assertEquals(0, SOLUTION.maxProfit(2, null));
        assertEquals(0, SOLUTION.maxProfit(2, new int[]{}));
        assertEquals(10, SOLUTION.maxProfit(3, new int[]{2, 5, 7, 1, 4, 3, 1, 3}));
        assertEquals(2, SOLUTION.maxProfit(2, new int[]{2, 4, 1}));
        assertEquals(7, SOLUTION.maxProfit(2, new int[]{3, 2, 6, 5, 0, 3}));
        assertEquals(10, SOLUTION.maxProfit(Integer.MAX_VALUE, new int[]{2, 5, 7, 1, 4, 3, 1, 3}));
    }

}