package _849_Maximize_Distance_to_Closest_Person;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxDistToClosest() {
        assertEquals(2, SOLUTION.maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
        assertEquals(3, SOLUTION.maxDistToClosest(new int[]{1, 0, 0, 0}));
        assertEquals(1, SOLUTION.maxDistToClosest(new int[]{0, 1}));
        assertEquals(1, SOLUTION.maxDistToClosest(new int[]{1, 0, 0, 1}));
        assertEquals(2, SOLUTION.maxDistToClosest(new int[]{0, 1, 1, 1, 0, 0, 1, 0, 0}));
        assertEquals(2, SOLUTION.maxDistToClosest(new int[]{1, 1, 0, 0, 0, 1, 0}));
        assertEquals(3, SOLUTION.maxDistToClosest(new int[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1}));
    }

}