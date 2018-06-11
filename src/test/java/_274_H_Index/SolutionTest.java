package _274_H_Index;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void hIndex() {
        assertEquals(3, SOLUTION.hIndex(new int[]{3, 0, 6, 1, 5}));
        assertEquals(0, SOLUTION.hIndex(new int[]{0}));
        assertEquals(1, SOLUTION.hIndex(new int[]{0, 1}));
        assertEquals(2, SOLUTION.hIndex(new int[]{4, 4, 0, 0}));
        assertEquals(0, SOLUTION.hIndex(new int[]{0, 0}));
    }

}