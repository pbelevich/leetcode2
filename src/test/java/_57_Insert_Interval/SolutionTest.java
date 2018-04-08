package _57_Insert_Interval;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void insert() {
        assertEquals(Arrays.asList(i(1, 5), i(6, 9)),
                SOLUTION.insert(Arrays.asList(i(1, 3), i(6, 9)), i(2, 5)));
        assertEquals(Arrays.asList(i(1, 2), i(3, 10), i(12, 16)),
                SOLUTION.insert(Arrays.asList(i(1, 2), i(3, 5), i(6, 7), i(8, 10), i(12, 16)), i(4, 9)));
    }

    Interval i(int start, int end) {
        return new Interval(start, end);
    }

}