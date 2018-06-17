package _47_Permutations_II;

import org.junit.Test;

import java.util.HashSet;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void permuteUnique() {
        assertEquals(new HashSet<>(asList(
                asList(1, 1, 2),
                asList(1, 2, 1),
                asList(2, 1, 1)
        )), new HashSet<>(SOLUTION.permuteUnique(new int[]{1, 1, 2})));
    }

}