package _152_Maximum_Product_Subarray;

/**
 * @author Pavel Belevich
 */
public class Solution {

    int maxProduct(int A[]) {
        int r = A[0];
        for (int i = 1, imax = r, imin = r; i < A.length; i++) {
            if (A[i] < 0) {
                int t = imax;
                imax = imin;
                imin = t;
            }
            imax = Math.max(A[i], imax * A[i]);
            imin = Math.min(A[i], imin * A[i]);
            r = Math.max(r, imax);
        }
        return r;
    }

}
