package _516_Longest_Palindromic_Subsequence;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void longestPalindromeSubseq() {
        assertEquals(4, SOLUTION.longestPalindromeSubseq("bbbab"));
        assertEquals(2, SOLUTION.longestPalindromeSubseq("cbbd"));
    }

}