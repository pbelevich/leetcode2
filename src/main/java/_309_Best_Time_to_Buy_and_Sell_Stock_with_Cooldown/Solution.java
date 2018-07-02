package _309_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int b0;
        int b1 = -prices[0];
        int s0 = 0;
        int s1 = 0;
        int s2 = 0;
        for (int price : prices) {
            b0 = Math.max(b1, s2 - price);
            s0 = Math.max(s1, b1 + price);
            b1 = b0;
            s2 = s1;
            s1 = s0;
        }
        return s0;
    }

}
