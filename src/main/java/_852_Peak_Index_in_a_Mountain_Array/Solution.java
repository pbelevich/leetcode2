package _852_Peak_Index_in_a_Mountain_Array;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int peakIndexInMountainArray(int[] A) {
        int result = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[result]) {
                result = i;
            }
        }
        return result;
    }

}
