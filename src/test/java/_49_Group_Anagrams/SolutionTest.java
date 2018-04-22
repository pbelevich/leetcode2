package _49_Group_Anagrams;

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
    public void groupAnagrams() {
        assertEquals(toSet(new String[][]{{"ate", "eat", "tea"}, {"nat", "tan"}, {"bat"}}),
                toSet(SOLUTION.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})));
    }


    private static <T> Set<Set<T>> toSet(T[][] a) {
        return Arrays.stream(a)
                .map(as -> Arrays.stream(as).collect(Collectors.toSet()))
                .collect(Collectors.toSet());
    }

    private static <T> Set<Set<T>> toSet(Collection<? extends Collection<T>> c) {
        return c.stream().map(HashSet::new).collect(Collectors.toSet());
    }

}