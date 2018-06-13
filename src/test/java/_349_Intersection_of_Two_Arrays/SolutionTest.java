package _349_Intersection_of_Two_Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void intersection() {
        assertArrayEquals(new int[]{2}, SOLUTION.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

}