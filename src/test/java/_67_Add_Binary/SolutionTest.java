package _67_Add_Binary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void addBinary() {
        assertEquals("100", SOLUTION.addBinary("11", "1"));
        assertEquals("10101", SOLUTION.addBinary("1010", "1011"));
        assertEquals("0", SOLUTION.addBinary("0", "0"));
        assertEquals("1", SOLUTION.addBinary("0", "1"));
    }

}