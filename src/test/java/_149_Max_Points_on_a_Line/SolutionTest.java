package _149_Max_Points_on_a_Line;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void maxPoints() {
        assertEquals(0, SOLUTION.maxPoints(p(new int[][]{})));
        assertEquals(1, SOLUTION.maxPoints(p(new int[][]{{1, 1}})));
        assertEquals(2, SOLUTION.maxPoints(p(new int[][]{{1, 1}, {2, 3}})));
        assertEquals(3, SOLUTION.maxPoints(p(new int[][]{{1, 1}, {1, 1}, {2, 2}})));
        assertEquals(4, SOLUTION.maxPoints(p(new int[][]{{1, 1}, {1, 1}, {2, 2}, {2, 2}})));
        assertEquals(4, SOLUTION.maxPoints(p(new int[][]{{-1, 1}, {0, 0}, {1, 1}, {2, 2}, {3, 3}, {3, 4}})));
    }

    Point p(int a, int b) {
        return new Point(a, b);
    }

    Point[] p(int[][] arr) {
        return Arrays.stream(arr).map(x -> p(x[0], x[1])).toArray(Point[]::new);
    }

}