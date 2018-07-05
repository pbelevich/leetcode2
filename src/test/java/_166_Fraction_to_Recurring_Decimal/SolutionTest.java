package _166_Fraction_to_Recurring_Decimal;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void fractionToDecimal() {
        assertEquals("2", SOLUTION.fractionToDecimal(2, 1));
        assertEquals("0.5", SOLUTION.fractionToDecimal(1, 2));
        assertEquals("0.(6)", SOLUTION.fractionToDecimal(2, 3));
        assertEquals("0.(107)", SOLUTION.fractionToDecimal(107, 999));
        assertEquals("0.1(6)", SOLUTION.fractionToDecimal(1, 6));
        assertEquals("-2", SOLUTION.fractionToDecimal(-2, 1));
        assertEquals("-0.5", SOLUTION.fractionToDecimal(1, -2));
        assertEquals("0", SOLUTION.fractionToDecimal(0, 42));
        assertEquals("0", SOLUTION.fractionToDecimal(0, -42));
        assertEquals("0.0000000004656612873077392578125", SOLUTION.fractionToDecimal(-1, -2147483648));
    }

}