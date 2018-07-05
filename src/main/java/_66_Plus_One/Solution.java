package _66_Plus_One;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0 && carry != 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }
        if (carry != 0) {
            final int[] newDigits = new int[digits.length + 1];
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            newDigits[0] = 1;
            return newDigits;
        } else {
            return digits;
        }
    }

}
