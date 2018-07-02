package _9_Palindrome_Number;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isPalindrome() {
        assertTrue(SOLUTION.isPalindrome(0));
        assertTrue(SOLUTION.isPalindrome(1));
        assertTrue(SOLUTION.isPalindrome(11));
        assertTrue(SOLUTION.isPalindrome(121));
        assertTrue(SOLUTION.isPalindrome(9889));
        assertFalse(SOLUTION.isPalindrome(10));
        assertFalse(SOLUTION.isPalindrome(-121));
    }

}