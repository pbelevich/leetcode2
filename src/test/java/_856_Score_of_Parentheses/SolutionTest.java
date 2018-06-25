package _856_Score_of_Parentheses;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void scoreOfParentheses() {
        assertEquals(0, SOLUTION.scoreOfParentheses(""));
        assertEquals(1, SOLUTION.scoreOfParentheses("()"));
        assertEquals(2, SOLUTION.scoreOfParentheses("(())"));
        assertEquals(2, SOLUTION.scoreOfParentheses("()()"));
        assertEquals(6, SOLUTION.scoreOfParentheses("(()(()))"));
    }

}