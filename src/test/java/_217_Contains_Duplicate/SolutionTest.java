package _217_Contains_Duplicate;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void containsDuplicate() {
        assertTrue(SOLUTION.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertFalse(SOLUTION.containsDuplicate(new int[]{1, 2, 3, 4}));
        assertTrue(SOLUTION.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

}