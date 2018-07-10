package _680_Valid_Palindrome_II;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean validPalindrome(String s) {
        final char[] chars = s.toCharArray();
        if (validPalindrome(chars, 0, chars.length - 1)) {
            return true;
        }
        int i, j;
        for (i = 0, j = chars.length - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                break;
            }
        }
        return validPalindrome(chars, i, j - 1) || validPalindrome(chars, i + 1, j);
    }

    private boolean validPalindrome(char[] chars, int x, int y) {
        for (int i = x, j = y; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }

}
