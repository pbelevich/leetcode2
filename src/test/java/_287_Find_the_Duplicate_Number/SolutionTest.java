package _287_Find_the_Duplicate_Number;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findDuplicate() {
        assertEquals(6, SOLUTION.findDuplicate(new int[]{5, 3, 4, 6, 8, 7, 1, 9, 6, 2}));
    }

}