package _121_Best_Time_to_Buy_and_Sell_Stock;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxProfit() {
        assertEquals(5, SOLUTION.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

}