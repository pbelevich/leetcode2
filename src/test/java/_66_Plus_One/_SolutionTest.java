package _66_Plus_One;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class _SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void plusOne() {
        assertArrayEquals(new int[]{1, 0, 0, 0}, SOLUTION.plusOne(new int[]{9, 9, 9}));
        assertArrayEquals(new int[]{9, 9, 9}, SOLUTION.plusOne(new int[]{9, 9, 8}));
    }

}