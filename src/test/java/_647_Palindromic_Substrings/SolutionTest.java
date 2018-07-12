package _647_Palindromic_Substrings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void countSubstrings() {
        assertEquals(0, SOLUTION.countSubstrings(null));
        assertEquals(0, SOLUTION.countSubstrings(""));
        assertEquals(3, SOLUTION.countSubstrings("abc"));
        assertEquals(6, SOLUTION.countSubstrings("aaa"));
    }

}