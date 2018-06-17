package _46_Permutations.first;

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
    public void permute() {
        assertEquals(new HashSet<>(asList(
                asList(1, 2, 3),
                asList(1, 3, 2),
                asList(2, 1, 3),
                asList(2, 3, 1),
                asList(3, 1, 2),
                asList(3, 2, 1)
        )), new HashSet<>(SOLUTION.permute(new int[]{1, 2, 3})));
    }

}