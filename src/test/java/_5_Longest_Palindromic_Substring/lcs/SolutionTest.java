package _5_Longest_Palindromic_Substring.lcs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testLongestPalindrome() {
        assertNull(SOLUTION.longestPalindrome(null));
        assertEquals("", SOLUTION.longestPalindrome(""));
        assertEquals("a", SOLUTION.longestPalindrome("a"));
        assertEquals("aa", SOLUTION.longestPalindrome("aa"));
        assertEquals("aaa", SOLUTION.longestPalindrome("aaa"));
        assertEquals("aba", SOLUTION.longestPalindrome("aba"));
        assertEquals("bb", SOLUTION.longestPalindrome("abb"));
        assertEquals("abba", SOLUTION.longestPalindrome("abba"));
        assertEquals("ababa", SOLUTION.longestPalindrome("ababa"));
        assertEquals("baxabaxab", SOLUTION.longestPalindrome("abaxabaxabb"));
        assertEquals("baxabybaxab", SOLUTION.longestPalindrome("abaxabaxabybaxabyb"));
    }

    @Test
    public void lcs() {
        assertNull(Solution.lcs(null, null));
        assertEquals("", Solution.lcs("", ""));
        assertEquals("", Solution.lcs("a", ""));
        assertEquals("", Solution.lcs("", "b"));
        assertEquals("", Solution.lcs("a", "b"));
        assertEquals("a", Solution.lcs("a", "a"));
        assertEquals("a", Solution.lcs("a", "abc"));
        assertEquals("abc", Solution.lcs("abc", "abc"));
        assertEquals("abc", Solution.lcs("abcxyz", "qweabc"));
    }

    @Test
    public void reverse() {
        assertNull(Solution.reverse(null));
        assertEquals("", Solution.reverse(""));
        assertEquals("a", Solution.reverse("a"));
        assertEquals("ba", Solution.reverse("ab"));
        assertEquals("cba", Solution.reverse("abc"));
    }

}