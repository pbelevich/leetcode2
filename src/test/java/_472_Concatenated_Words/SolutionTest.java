package _472_Concatenated_Words;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findAllConcatenatedWordsInADict() {
        assertEquals(Arrays.asList("catsdogcats", "dogcatsdog", "ratcatdogcat"), SOLUTION.findAllConcatenatedWordsInADict(new String[]{
                "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"
        }));

        assertEquals(Arrays.asList(), SOLUTION.findAllConcatenatedWordsInADict(new String[]{
                ""
        }));
    }

}
