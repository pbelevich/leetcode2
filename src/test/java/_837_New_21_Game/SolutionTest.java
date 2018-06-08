package _837_New_21_Game;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();
    public static final double DELTA = 1e-5;

    @Test
    public void new21Game() {
        assertEquals(1.0, SOLUTION.new21Game(10, 1, 10), DELTA);
        assertEquals(0.6, SOLUTION.new21Game(6, 1, 10), DELTA);
        assertEquals(0.73278, SOLUTION.new21Game(21, 17, 10), DELTA);
        assertEquals(1.0, SOLUTION.new21Game(0, 0, 1), DELTA);
        assertEquals(1.0, SOLUTION.new21Game(1, 0, 1), DELTA);
        assertEquals(0.71188, SOLUTION.new21Game(421, 400, 47), DELTA);
        assertEquals(0.99696, SOLUTION.new21Game(9811, 8776, 1096), DELTA);
        assertEquals(0.62079, SOLUTION.new21Game(9367, 7346, 5344), DELTA);
    }

}