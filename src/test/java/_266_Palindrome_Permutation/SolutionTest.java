package _266_Palindrome_Permutation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void canPermutePalindrome() {
        assertFalse(SOLUTION.canPermutePalindrome("code"));
        assertTrue(SOLUTION.canPermutePalindrome("aab"));
        assertTrue(SOLUTION.canPermutePalindrome("carerac"));
    }

}