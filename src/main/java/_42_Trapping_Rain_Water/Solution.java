package _42_Trapping_Rain_Water;

import java.util.Arrays;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int trap(int[] height) {
        if (height.length == 0) {
            return 0;
        }
        int area = 0;
        final int max = Arrays.stream(height).max().getAsInt();
        int h = 0;
        int l;
        for (l = 0; height[l] < max; l++) {
            if (height[l] < h) {
                area += h - height[l];
            } else {
                h = height[l];
            }
        }
        h = 0;
        int r;
        for (r = height.length - 1; height[r] < max; r--) {
            if (height[r] < h) {
                area += h - height[r];
            } else {
                h = height[r];
            }
        }
        for (int i = l + 1; i < r; i++) {
            area += max - height[i];
        }
        return area;
    }

}
