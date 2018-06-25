package _859_Buddy_Strings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void buddyStrings() {
        assertTrue(SOLUTION.buddyStrings("ab", "ba"));
        assertFalse(SOLUTION.buddyStrings("ab", "ab"));
        assertFalse(SOLUTION.buddyStrings("", "aa"));
        assertTrue(SOLUTION.buddyStrings("aaaaaaabc", "aaaaaaacb"));
        assertTrue(SOLUTION.buddyStrings("aa", "aa"));
        assertTrue(SOLUTION.buddyStrings("abcxabcyabc", "abcyabcxabc"));
        assertFalse(SOLUTION.buddyStrings("abcxabcyabcz", "abcyabcxabcq"));
        assertFalse(SOLUTION.buddyStrings("abcxabcyabc", "abcyabczabc"));
        assertFalse(SOLUTION.buddyStrings("abcxabc", "abcyabc"));
        assertFalse(SOLUTION.buddyStrings("abcx", "abcy"));
    }

}