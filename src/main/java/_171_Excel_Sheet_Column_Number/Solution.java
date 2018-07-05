package _171_Excel_Sheet_Column_Number;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int titleToNumber(String s) {
        final char[] chars = s.toCharArray();
        int res = 0;
        for (char c : chars) {
            res = res * 26 + (c - 'A' + 1);
        }
        return res;
    }

}
