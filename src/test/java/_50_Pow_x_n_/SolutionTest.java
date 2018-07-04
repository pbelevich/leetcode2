package _50_Pow_x_n_;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();
    public static final double DELTA = 1e-9;

    @Test
    public void myPow() {
        assertEquals(77.269364466549866, SOLUTION.myPow(1.23, 21), DELTA);
        assertEquals(0.012941739677863, SOLUTION.myPow(1.23, -21), DELTA);
        assertEquals(-77.269364466549866, SOLUTION.myPow(-1.23, 21), DELTA);
        assertEquals(-0.012941739677863, SOLUTION.myPow(-1.23, -21), DELTA);
        assertEquals(0.0, SOLUTION.myPow(0.00001, 2147483647), DELTA);
        assertEquals(0.25, SOLUTION.myPow(2.0, -2), DELTA);
        assertEquals(0.0, SOLUTION.myPow(2.0, -2147483648), DELTA);
    }

}