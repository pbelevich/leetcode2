package _28_Implement_strStr.bruteForce;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void strStr() {
        assertEquals(2, SOLUTION.strStr("hello", "ll"));
        assertEquals(-1, SOLUTION.strStr("aaaaa", "bba"));
        assertEquals(0, SOLUTION.strStr("", ""));
        assertEquals(-1, SOLUTION.strStr("aaa", "aaaa"));
        assertEquals(0, SOLUTION.strStr("a", "a"));
    }

}