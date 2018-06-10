package _832_Flipping_an_Image;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[][] flipAndInvertImage(int[][] A) {
        int rowLen = A[0].length;
        for (int r = 0; r < A.length; r++) {
            for (int c = 0; c < rowLen / 2; c++) {
                int t = A[r][c];
                A[r][c] = (A[r][rowLen - 1 - c] == 1 ? 0 : 1);
                A[r][rowLen - 1 - c] = (t == 1 ? 0 : 1);
            }
            if ((rowLen & 1) == 1) {
                A[r][rowLen / 2] = A[r][rowLen / 2] == 1 ? 0 : 1;
            }
        }
        return A;
    }

}
