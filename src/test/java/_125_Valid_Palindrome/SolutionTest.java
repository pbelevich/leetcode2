package _125_Valid_Palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isPalindrome() {
        assertTrue(SOLUTION.isPalindrome(""));
        assertTrue(SOLUTION.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(SOLUTION.isPalindrome("race a car"));
        assertFalse(SOLUTION.isPalindrome("0P"));
        assertFalse(SOLUTION.isPalindrome("8V8K;G;K;V;"));
    }

}