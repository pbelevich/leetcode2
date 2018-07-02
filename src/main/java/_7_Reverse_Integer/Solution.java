package _7_Reverse_Integer;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int reverse(int x) {
        int sign = x >= 0 ? 1 : -1;
        long longX = Math.abs(x);
        long res = 0;
        while (longX != 0) {
            res = res * 10 + longX % 10;
            longX /= 10;
        }
        res *= sign;
        return Integer.MIN_VALUE <= res && res <= Integer.MAX_VALUE ? (int) res : 0;
    }

}
