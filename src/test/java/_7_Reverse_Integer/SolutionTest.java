package _7_Reverse_Integer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void reverse() {
        assertEquals(321, SOLUTION.reverse(123));
        assertEquals(0, SOLUTION.reverse(1234567899));
        assertEquals(-321, SOLUTION.reverse(-123));
        assertEquals(21, SOLUTION.reverse(120));
    }

}