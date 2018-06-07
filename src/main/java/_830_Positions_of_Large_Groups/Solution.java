package _830_Positions_of_Large_Groups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        final char[] chars = S.toCharArray();
        int j = 0;
        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] != chars[j]) {
                if (i - j >= 3) {
                    res.add(Arrays.asList(j, i - 1));
                }
                j = i;
            }
        }
        return res;
    }

}
