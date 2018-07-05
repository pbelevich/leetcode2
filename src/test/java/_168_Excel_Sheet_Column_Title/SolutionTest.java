package _168_Excel_Sheet_Column_Title;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void convertToTitle() {
        assertEquals("A", SOLUTION.convertToTitle(1));
        assertEquals("Z", SOLUTION.convertToTitle(26));
        assertEquals("AB", SOLUTION.convertToTitle(28));
        assertEquals("ZY", SOLUTION.convertToTitle(701));
    }

}