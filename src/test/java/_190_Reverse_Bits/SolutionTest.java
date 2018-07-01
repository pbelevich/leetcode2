package _190_Reverse_Bits;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void reverseBits() {
        assertEquals(964176192, SOLUTION.reverseBits(43261596));
        assertEquals(43261596, SOLUTION.reverseBits(964176192));
    }

}