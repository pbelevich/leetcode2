package _421_Maximum_XOR_of_Two_Numbers_in_an_Array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findMaximumXOR() {
        assertEquals(28, SOLUTION.findMaximumXOR(new int[]{3, 10, 5, 25, 2, 8}));
    }

}