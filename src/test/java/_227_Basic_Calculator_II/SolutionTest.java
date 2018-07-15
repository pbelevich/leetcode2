package _227_Basic_Calculator_II;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void calculate() {
        assertEquals(0, SOLUTION.calculate("0"));
        assertEquals(42, SOLUTION.calculate("42"));
        assertEquals(-42, SOLUTION.calculate("-42"));
        assertEquals(13, SOLUTION.calculate("3*5-4/2"));
        assertEquals(-13, SOLUTION.calculate("-3*5+4/2"));
    }

}