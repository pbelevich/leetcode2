package _739_Daily_Temperatures;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void dailyTemperatures() {
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, SOLUTION.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

}