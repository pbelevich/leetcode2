package _844_Backspace_String_Compare;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean backspaceCompare(String S, String T) {
        final String s = f(S.toCharArray());
        final String t = f(T.toCharArray());
        return s.equals(t);
    }

    private String f(char[] chars) {
        final StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
