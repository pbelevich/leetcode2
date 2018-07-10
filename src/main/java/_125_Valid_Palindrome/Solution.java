package _125_Valid_Palindrome;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toLowerCase;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        final char[] chars = s.toLowerCase().toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; ) {
            if (isLetterOrDigit(chars[i]) && isLetterOrDigit(chars[j])) {
                if (toLowerCase(chars[i]) != toLowerCase(chars[j])) {
                    return false;
                }
                i++;
                j--;
            } else if (!isLetterOrDigit(chars[i])) {
                i++;
            } else if (!isLetterOrDigit(chars[j])) {
                j--;
            }
        }
        return true;
    }

}
