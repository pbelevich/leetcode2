package _845_Longest_Mountain_in_Array;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int longestMountain(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            int j;
            for (j = i + 1; j < A.length && A[j] > A[j - 1]; j++) ;
            j--;
            if (i == j) {
                continue;
            }
            int k;
            for (k = j + 1; k < A.length && A[k] < A[k - 1]; k++) ;
            k--;
            if (j == k) {
                continue;
            }
            int len = k - i + 1;
            max = Math.max(max, len);
            i += len - 2;
        }
        return max;
    }

}
