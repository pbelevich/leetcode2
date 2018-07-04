package _50_Pow_x_n_;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        } else if (n == Integer.MIN_VALUE) {
            return myPow(1 / x / x, -(n >> 1));
        } else if (n < 0) {
            return myPow(1 / x, -n);
        } else if ((n & 1) == 0) {
            return myPow(x * x, n >> 1);
        } else {
            return x * myPow(x, n - 1);
        }
    }

}
