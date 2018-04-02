package _301_Remove_Invalid_Parentheses;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static utils.Assert.assertEquals;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    static final Solution SOLUTION = new Solution();

    @Test
    public void deleteChar() {
        assertEquals("", new String(SOLUTION.deleteChar("a".toCharArray(), 0)));
        assertEquals("b", new String(SOLUTION.deleteChar("ab".toCharArray(), 0)));
        assertEquals("a", new String(SOLUTION.deleteChar("ab".toCharArray(), 1)));
    }

    @Test
    public void removeInvalidParentheses() {
        assertEquals(Arrays.asList("()()()", "(())()"), SOLUTION.removeInvalidParentheses("()())()"));
        assertEquals(Arrays.asList("(a)()()", "(a())()"), SOLUTION.removeInvalidParentheses("(a)())()"));
        assertEquals(Collections.singletonList(""), SOLUTION.removeInvalidParentheses(")("));
        assertEquals(Collections.singletonList("()"), SOLUTION.removeInvalidParentheses("(()"));
    }

}