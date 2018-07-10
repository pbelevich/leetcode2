package _448_Find_All_Numbers_Disappeared_in_an_Array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void findDisappearedNumbers() {
        assertEquals(Arrays.asList(5, 6), SOLUTION.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

}