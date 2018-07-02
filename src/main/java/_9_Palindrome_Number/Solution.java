package _9_Palindrome_Number;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int hi = 1;
        for (int i = x; i >= 10; i /= 10) {
            hi *= 10;
        }
        for (int lo = 1; hi > lo; lo *= 10, hi /= 10) {
            if (x / lo % 10 != x / hi % 10) {
                return false;
            }
        }
        return true;
    }

}
