package _829_Consecutive_Numbers_Sum;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int consecutiveNumbersSum(int N) {
        int res = 0;
        for (int k = 1; k < Math.sqrt(2 * N); k++) {
            if ((2 * N) % k == 0 && ((2 * N) / k - k - 1) % 2 == 0) {
                res++;
            }
        }
        return res;
    }

}
