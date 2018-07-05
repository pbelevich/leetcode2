package _171_Excel_Sheet_Column_Number;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void titleToNumber() {
        assertEquals(1, SOLUTION.titleToNumber("A"));
        assertEquals(26, SOLUTION.titleToNumber("Z"));
        assertEquals(28, SOLUTION.titleToNumber("AB"));
        assertEquals(701, SOLUTION.titleToNumber("ZY"));
    }

}