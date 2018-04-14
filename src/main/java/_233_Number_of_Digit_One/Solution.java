package _233_Number_of_Digit_One;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int countDigitOne(int n) {
        int result = 0;
        int g = 0;
        int t = 1;
        int x = 0;
        while (n > 0) {
            final int d = n % 10;
            if (d == 1) {
                result += d * g + 1 + x;
            } else if (d > 1) {
                result += d * g + t;
            }
            g = 10 * g + t;
            x += d * t;
            t *= 10;
            n /= 10;
        }
        return result;
    }

}
