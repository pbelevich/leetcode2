package _90_Subsets_II;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void subsets() {
        assertEquals(
                toSet(toList(
                        new int[][]{
                                {},
                                {1},
                                {2},
                                {1, 2},
                                {1, 2, 2},
                                {2, 2}
                        }
                )),
                toSet(SOLUTION.subsetsWithDup(new int[]{1, 2, 2}))
        );
    }

    private static List<List<Integer>> toList(int[][] a) {
        return Arrays.stream(a)
                .map(as -> Arrays.stream(as).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    private static <T> Set<T> toSet(Collection<T> c) {
        return new HashSet<>(c);
    }

}