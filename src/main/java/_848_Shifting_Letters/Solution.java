package _848_Shifting_Letters;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public String shiftingLetters(String S, int[] shifts) {
        final char[] chars = S.toCharArray();
        int shift = 0;
        for (int i = shifts.length - 1; i >= 0; i--) {
            shift = (shift + shifts[i] % 26) % 26;
            chars[i] = (char) (((chars[i] - 'a' + shift) % 26) + 'a');
        }
        return new String(chars);
    }

}
