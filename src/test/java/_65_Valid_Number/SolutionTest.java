package _65_Valid_Number;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void isNumber() {
        assertTrue(SOLUTION.isNumber("0"));
        assertTrue(SOLUTION.isNumber("-123"));
        assertTrue(SOLUTION.isNumber("   34534    "));
        assertTrue(SOLUTION.isNumber("   -34534    "));
        assertTrue(SOLUTION.isNumber("+234234.345345    "));
        assertTrue(SOLUTION.isNumber(" -.345345    "));
        assertTrue(SOLUTION.isNumber("     +5345345.    "));
        assertTrue(SOLUTION.isNumber("+234234.345345e3453    "));
        assertTrue(SOLUTION.isNumber("   -234234.e3453    "));
        assertTrue(SOLUTION.isNumber("   -.323e3453    "));
    }

    @Test
    public void isNotNumber() {
        assertFalse(SOLUTION.isNumber(null));
        assertFalse(SOLUTION.isNumber(""));
        assertFalse(SOLUTION.isNumber("     "));
        assertFalse(SOLUTION.isNumber("  234f23 "));
        assertFalse(SOLUTION.isNumber("  FFDSFDSF "));
        assertFalse(SOLUTION.isNumber("  E "));
        assertFalse(SOLUTION.isNumber("  e    "));
        assertFalse(SOLUTION.isNumber("   -.e3453    "));
        assertFalse(SOLUTION.isNumber("..2"));
    }

}