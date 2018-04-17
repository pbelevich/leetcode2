package _338_Counting_Bits;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void countBits() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, SOLUTION.countBits(5));
    }
}