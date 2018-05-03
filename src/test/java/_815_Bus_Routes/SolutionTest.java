package _815_Bus_Routes;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void numBusesToDestination() {
        assertEquals(2, SOLUTION.numBusesToDestination(new int[][]{{1, 2, 7}, {3, 6, 7}}, 1, 6));
        assertEquals(0, SOLUTION.numBusesToDestination(new int[][]{{1, 7}, {3, 5}}, 5, 5));
    }

    @Test
    public void numBusesToDestination2() {
        assertEquals(2, SOLUTION.numBusesToDestination(new int[][]{
                {3, 16, 33, 45, 59, 79, 103, 135},
                {3, 35, 39, 54, 56, 78, 96, 101, 120, 132, 146, 148},
                {13, 72, 98},
                {37, 70, 107},
                {0, 12, 31, 37, 41, 68, 78, 94, 100, 101, 113, 123},
                {11, 32, 52, 85, 135},
                {43, 50, 128},
                {0, 13, 49, 51, 53, 55, 60, 65, 66, 80, 82, 87, 92, 99, 112, 118, 120, 125, 128, 131, 137},
                {15, 19, 34, 37, 45, 52, 56, 97, 108, 123, 142},
                {7, 9, 20, 28, 29, 33, 34, 38, 43, 46, 47, 48, 53, 59, 65, 72, 74, 80, 88, 92, 110, 111, 113, 119, 135, 140},
                {15, 41, 64, 83},
                {7, 13, 26, 31, 57, 85, 101, 108, 110, 115, 119, 124, 149},
                {47, 61, 67, 70, 74, 75, 77, 84, 92, 101, 124, 132, 133, 142, 147},
                {0, 2, 5, 6, 12, 18, 34, 37, 47, 58, 77, 98, 99, 109, 112, 131, 135, 149},
                {6, 7, 8, 9, 14, 17, 21, 25, 33, 40, 45, 50, 56, 57, 58, 60, 68, 92, 93, 100, 108, 114, 130, 149},
                {7},
                {5, 16, 22, 48, 77, 82, 108, 114, 124},
                {34, 71},
                {8, 16, 32, 48, 104, 108, 116, 134, 145},
                {3, 10, 16, 19, 35, 45, 64, 74, 89, 101, 116, 149},
                {1, 5, 7, 10, 11, 18, 40, 45, 50, 51, 52, 54, 55, 69, 71, 81, 82, 83, 85, 89, 96, 100, 114, 115, 124, 134, 138, 148},
                {0, 2, 3, 5, 6, 9, 15, 52, 64, 103, 108, 114, 146},
                {5, 33, 39, 40, 44, 45, 66, 67, 68, 69, 84, 102, 106, 115, 120, 128, 133},
                {17, 26, 49, 50, 55, 58, 60, 65, 88, 90, 102, 121, 126, 130, 137, 139, 144},
                {6, 12, 13, 37, 41, 42, 48, 50, 51, 55, 64, 65, 68, 70, 73, 102, 106, 108, 120, 123, 126, 127, 129, 135, 136, 149},
                {6, 7, 12, 33, 37, 41, 47, 53, 54, 80, 107, 121, 126},
                {15, 75, 91, 103, 107, 110, 125, 139, 142, 149},
                {18, 24, 30, 52, 61, 64, 75, 79, 85, 95, 100, 103, 105, 111, 128, 129, 142},
                {3, 14, 18, 32, 45, 52, 57, 63, 68, 78, 85, 91, 100, 104, 111, 114, 142},
                {4, 7, 11, 20, 21, 31, 32, 33, 48, 61, 62, 65, 66, 73, 80, 92, 93, 97, 99, 108, 112, 116, 136, 139}
        }, 85, 112));
    }

}