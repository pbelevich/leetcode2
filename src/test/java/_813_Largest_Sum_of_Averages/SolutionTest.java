package _813_Largest_Sum_of_Averages;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();
    public static final double DELTA = 1e-9;

    @Test
    public void largestSumOfAverages1() {
        assertEquals(20.0,
                SOLUTION.largestSumOfAverages(new int[]{9, 1, 2, 3, 9}, 3), DELTA);
    }

    @Test
    public void largestSumOfAverages2() {
        assertEquals(18.166666666666664,
                SOLUTION.largestSumOfAverages(new int[]{4, 1, 7, 5, 6, 2, 3}, 4), DELTA);
    }

    @Test
    public void largestSumOfAverages3() {
        assertEquals(167436.0833333333,
                SOLUTION.largestSumOfAverages(new int[]{
                        4663, 3020, 7789, 1627, 9668, 1356, 4207, 1133, 8765, 4649,
                        205, 6455, 8864, 3554, 3916, 5925, 3995, 4540, 3487, 5444,
                        8259, 8802, 6777, 7306, 989, 4958, 2921, 8155, 4922, 2469,
                        6923, 776, 9777, 1796, 708, 786, 3158, 7369, 8715, 2136,
                        2510, 3739, 6411, 7996, 6211, 8282, 4805, 236, 1489, 7698}, 27), DELTA);
    }

}