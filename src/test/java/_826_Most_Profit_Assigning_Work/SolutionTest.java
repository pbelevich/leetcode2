package _826_Most_Profit_Assigning_Work;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void maxProfitAssignment1() {
        assertEquals(100, SOLUTION.maxProfitAssignment(new int[]{2, 4, 6, 8, 10}, new int[]{10, 20, 30, 40, 50}, new int[]{4, 5, 6, 7}));
    }

    @Test
    public void maxProfitAssignment2() {
        assertEquals(190, SOLUTION.maxProfitAssignment(new int[]{13, 37, 58}, new int[]{4, 90, 96}, new int[]{34, 73, 45}));
    }

    @Test
    public void maxProfitAssignment3() {
        assertEquals(765, SOLUTION.maxProfitAssignment(
                new int[]{5, 50, 92, 21, 24, 70, 17, 63, 30, 53},
                new int[]{68, 100, 3, 99, 56, 43, 26, 93, 55, 25},
                new int[]{96, 3, 55, 30, 11, 58, 68, 36, 26, 1}));
    }


}