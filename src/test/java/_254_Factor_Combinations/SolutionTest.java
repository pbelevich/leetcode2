package _254_Factor_Combinations;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void getFactors() {
        assertEquals(Collections.emptyList(), SOLUTION.getFactors(1));
        assertEquals(Arrays.asList(
                Arrays.asList(2, 2, 2, 2, 2),
                Arrays.asList(2, 2, 2, 4),
                Arrays.asList(2, 2, 8),
                Arrays.asList(2, 4, 4),
                Arrays.asList(2, 16),
                Arrays.asList(4, 8)
        ), SOLUTION.getFactors(32));
    }

}