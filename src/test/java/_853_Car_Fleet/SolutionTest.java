package _853_Car_Fleet;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void carFleet0() {
        assertEquals(0, SOLUTION.carFleet(10, new int[]{}, new int[]{}));
    }

    @Test
    public void carFleet1() {
        assertEquals(3, SOLUTION.carFleet(12, new int[]{10, 8, 0, 5, 3}, new int[]{2, 4, 1, 1, 3}));
    }

    @Test
    public void carFleet2() {
        assertEquals(1, SOLUTION.carFleet(10, new int[]{3}, new int[]{3}));
    }

    @Test
    public void carFleet3() {
        assertEquals(6, SOLUTION.carFleet(31,
                new int[]{5, 26, 18, 25, 29, 21, 22, 12, 19, 6},
                new int[]{7, 6, 6, 4, 3, 4, 9, 7, 6, 4}));
    }

    @Test
    public void carFleet4() {
        assertEquals(2, SOLUTION.carFleet(16,
                new int[]{11, 14, 13, 6},
                new int[]{2, 2, 6, 7}));
    }

    @Test
    public void carFleet5() {
        assertEquals(7, SOLUTION.carFleet(21,
                new int[]{1, 15, 6, 8, 18, 14, 16, 2, 19, 17, 3, 20, 5},
                new int[]{8, 5, 5, 7, 10, 10, 7, 9, 3, 4, 4, 10, 2}));
    }

}