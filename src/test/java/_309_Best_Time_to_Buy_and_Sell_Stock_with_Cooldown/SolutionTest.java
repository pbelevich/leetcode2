package _309_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxProfit() {
        assertEquals(0, SOLUTION.maxProfit(null));
        assertEquals(0, SOLUTION.maxProfit(new int[0]));
        assertEquals(3, SOLUTION.maxProfit(new int[]{1, 2, 3, 0, 2}));
    }

}