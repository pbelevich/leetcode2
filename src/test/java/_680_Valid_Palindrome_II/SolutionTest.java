package _680_Valid_Palindrome_II;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void validPalindrome() {
        assertTrue(SOLUTION.validPalindrome("aba"));
        assertTrue(SOLUTION.validPalindrome("abca"));
        assertTrue(SOLUTION.validPalindrome("abcxqwewqyxcba"));
        assertFalse(SOLUTION.validPalindrome("abc"));
        assertFalse(SOLUTION.validPalindrome("abxya"));
    }

}