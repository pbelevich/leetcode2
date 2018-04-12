package _72_Edit_Distance;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void minDistance() {
        assertEquals(0, SOLUTION.minDistance("", ""));
        assertEquals(1, SOLUTION.minDistance("", "a"));
        assertEquals(1, SOLUTION.minDistance("a", ""));
        assertEquals(0, SOLUTION.minDistance("a", "a"));
        assertEquals(3, SOLUTION.minDistance("abc", "def"));
    }

}