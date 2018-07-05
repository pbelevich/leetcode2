package _172_Factorial_Trailing_Zeroes;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int trailingZeroes(int n) {
        return n != 0 ? n / 5 + trailingZeroes(n / 5) : 0;
    }

}
