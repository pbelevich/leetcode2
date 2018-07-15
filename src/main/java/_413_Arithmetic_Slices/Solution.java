package _413_Arithmetic_Slices;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int numberOfArithmeticSlices(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length - 2; ) {
            int delta = A[i + 1] - A[i];
            int j;
            for (j = i + 2; j < A.length && A[j] - A[j - 1] == delta; j++) ;
            if (j - i >= 3) {
                result += arithSeqSum(j - i - 1);
            }
            i = j - 1;
        }
        return result;
    }

    private int arithSeqSum(int n) {
        return n * (n - 1) / 2;
    }


}
