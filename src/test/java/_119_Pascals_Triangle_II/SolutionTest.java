package _119_Pascals_Triangle_II;

import org.junit.Test;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void getRow() {
        assertEquals(singletonList(1), SOLUTION.getRow(0));
        assertEquals(asList(1, 1), SOLUTION.getRow(1));
        assertEquals(asList(1, 3, 3, 1), SOLUTION.getRow(3));
    }

}