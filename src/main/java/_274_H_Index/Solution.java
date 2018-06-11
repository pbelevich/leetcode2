package _274_H_Index;

import java.util.Arrays;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int result = 0;
        for (int i = 0; i < citations.length; i++) {
            int smaller = Math.min(citations[i], citations.length - i);
            result = Math.max(smaller, result);
        }

        return result;
    }

}
