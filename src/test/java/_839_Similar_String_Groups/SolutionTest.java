package _839_Similar_String_Groups;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numSimilarGroups() {
        assertEquals(2, SOLUTION.numSimilarGroups(new String[]{"tars", "rats", "arts", "star"}));
        assertEquals(1, SOLUTION.numSimilarGroups(new String[]{"omv", "ovm"}));
        assertEquals(2, SOLUTION.numSimilarGroups(new String[]{"nmiwx", "mniwx", "wminx", "mnixw", "xnmwi"}));
    }

}