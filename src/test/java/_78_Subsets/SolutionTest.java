package _78_Subsets;

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
                                {3}, {2}, {1},
                                {1, 2, 3},
                                {1, 2}, {1, 3}, {2, 3},
                                {}}
                )),
                toSet(SOLUTION.subsets(new int[]{1, 2, 3}))
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