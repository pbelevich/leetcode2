package _760_Find_Anagram_Mappings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void anagramMappings() {
        assertArrayEquals(new int[]{1, 4, 3, 2, 0}, SOLUTION.anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28}));
    }

}