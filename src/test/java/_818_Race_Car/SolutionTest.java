package _818_Race_Car;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void racecar2() {
        assertEquals(4, SOLUTION.racecar(2));
    }

    @Test
    public void racecar3() {
        assertEquals(2, SOLUTION.racecar(3));
    }

    @Test
    public void racecar4() {
        assertEquals(5, SOLUTION.racecar(4));
    }

    @Test
    public void racecar5() {
        assertEquals(7, SOLUTION.racecar(5));
    }

    @Test
    public void racecar6() {
        assertEquals(5, SOLUTION.racecar(6));
    }

    @Test
    public void racecar7() {
        assertEquals(3, SOLUTION.racecar(7));
    }

    @Test
    public void racecar15() {
        assertEquals(4, SOLUTION.racecar(15));
    }

    @Test
    public void racecar20() {
        assertEquals(12, SOLUTION.racecar(20));
    }

    @Test
    public void racecar330() {
        assertEquals(24, SOLUTION.racecar(330));
    }

}