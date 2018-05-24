package _16_3Sum_Closest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void threeSumClosest() {
        assertEquals(2, SOLUTION.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        assertEquals(-1, SOLUTION.threeSumClosest(new int[]{1, 1, -1, -1, 3}, -1));
    }

}