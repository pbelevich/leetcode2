package _326_Power_of_Three;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

}
