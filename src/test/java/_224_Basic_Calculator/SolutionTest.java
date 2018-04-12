package _224_Basic_Calculator;

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
        assertEquals(3, SOLUTION.calculate("1 + 2"));
        assertEquals(-1, SOLUTION.calculate(" 1 + 2- 4"));
        assertEquals(48, SOLUTION.calculate(" 42 - 2 +8"));
        assertEquals(-48, SOLUTION.calculate("-42 + 2 -8  "));
        assertEquals(42, SOLUTION.calculate(" 22 - ( - 20) "));
        assertEquals(((1) + 2) - 5 + 7 - ((2 - 10)) + 4, SOLUTION.calculate("( (1)+ 2) - 5 + 7 - (  (2 -10)) + 4"));
    }

}