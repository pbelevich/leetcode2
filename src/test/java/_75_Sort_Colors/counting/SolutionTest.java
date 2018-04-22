package _75_Sort_Colors.counting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void sortColors() {
        int[] c = {2, 0, 2, 1, 1, 0};
        SOLUTION.sortColors(c);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, c);
    }

}