package _338_Counting_Bits;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] countBits(int num) {
        final int[] res = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            res[i] = res[i >> 1] + (i & 1);
        }
        return res;
    }

}
