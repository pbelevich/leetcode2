package _316_Remove_Duplicate_Letters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void removeDuplicateLetters() {
        assertEquals("abc", SOLUTION.removeDuplicateLetters("abc"));
        assertEquals("abc", SOLUTION.removeDuplicateLetters("bcabc"));
        assertEquals("acdb", SOLUTION.removeDuplicateLetters("cbacdcbc"));
    }

}