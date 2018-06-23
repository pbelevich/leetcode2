package _27_Remove_Element;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void removeElement() {
        assertEquals(new int[]{3, 2, 2, 3}, 3, new int[]{2, 2});
        assertEquals(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, new int[]{0, 1, 3, 0, 4});
    }

    void assertEquals(int[] original, int val, int[] expected) {
        final int newLen = SOLUTION.removeElement(original, val);
        assertArrayEquals(expected, Arrays.copyOf(original, newLen));
    }

}