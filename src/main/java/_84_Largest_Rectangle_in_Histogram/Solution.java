package _84_Largest_Rectangle_in_Histogram;

import java.util.ArrayDeque;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int largestRectangleArea(int[] heights) {
        int max = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for (int i = 0; i < heights.length + 1; ++i) {
            while (stack.peek() != -1 && (i == heights.length || heights[i] <= heights[stack.peek()])) {
                int pop = stack.pop();
                int height = heights[pop];
                int area = height * (i - stack.peek() - 1);
                max = Math.max(max, area);
            }
            stack.push(i);
        }
        return max;
    }

}
