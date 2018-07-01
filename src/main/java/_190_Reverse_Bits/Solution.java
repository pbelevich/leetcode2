package _190_Reverse_Bits;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int reverseBits(int n) {
        for (int i = 0; i < (Integer.SIZE >> 1); i++) {
            int j = Integer.SIZE - 1 - i;
            int iBit = (n >> i) & 1;
            int jBit = (n >> j) & 1;
            n &= ~(1 << i);
            n &= ~(1 << j);
            n |= (iBit << j);
            n |= (jBit << i);
        }
        return n;
    }

}
