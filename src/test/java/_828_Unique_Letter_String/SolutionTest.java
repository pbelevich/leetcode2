package _828_Unique_Letter_String;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void uniqueLetterString() {
        assertEquals(2, SOLUTION.uniqueLetterString("AA"));
        assertEquals(10, SOLUTION.uniqueLetterString("ABC"));
        assertEquals(8, SOLUTION.uniqueLetterString("ABA"));
        assertEquals(6, SOLUTION.uniqueLetterString("ABB"));
        assertEquals(6, SOLUTION.uniqueLetterString("BBA"));
        assertEquals(35, SOLUTION.uniqueLetterString("BABABBABAA"));
    }

}