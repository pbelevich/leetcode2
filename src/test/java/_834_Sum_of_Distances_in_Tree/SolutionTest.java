package _834_Sum_of_Distances_in_Tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void sumOfDistancesInTree() {
        assertArrayEquals(new int[]{8, 12, 6, 10, 10, 10}, SOLUTION.sumOfDistancesInTree(6, new int[][]{{0, 1}, {0, 2}, {2, 3}, {2, 4}, {2, 5}}));
    }

}