package _844_Backspace_String_Compare;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void backspaceCompare() {
        assertTrue(SOLUTION.backspaceCompare("ab#c", "ad#c"));
        assertTrue(SOLUTION.backspaceCompare("ab##", "c#d#"));
        assertTrue(SOLUTION.backspaceCompare("a##c", "#a#c"));
        assertFalse(SOLUTION.backspaceCompare("a#c", "b"));
        assertTrue(SOLUTION.backspaceCompare("y#fo##f", "y#f#o##f"));
    }

}