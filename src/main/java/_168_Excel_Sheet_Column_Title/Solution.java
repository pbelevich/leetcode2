package _168_Excel_Sheet_Column_Title;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        for (; n != 0; n = (n - 1) / 26) {
            sb.insert(0, (char) ('A' + ((n - 1) % 26)));
        }
        return sb.toString();
    }

}
