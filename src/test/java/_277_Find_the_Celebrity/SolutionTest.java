package _277_Find_the_Celebrity;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void findCelebrity() {
        findCelebrity(new int[][]{
                {0, 1},
                {0, 0}
        }, 1);
        findCelebrity(new int[][]{
                {0, 0},
                {1, 0}
        }, 0);
        findCelebrity(new int[][]{
                {0, 1},
                {1, 0}
        }, -1);
        findCelebrity(new int[][]{
                {0, 0},
                {0, 0}
        }, -1);
        findCelebrity(new int[][]{
                {0, 0, 1},
                {1, 0, 0},
                {0, 1, 0},
        }, -1);
        findCelebrity(new int[][]{
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0},
        }, 2);
    }

    public void findCelebrity(int[][] matrix, int x) {
        Solution solution = new Solution();
        solution.matrix = matrix;
        assertEquals(x, solution.findCelebrity(matrix.length));
    }

}