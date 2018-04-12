package _316_Remove_Duplicate_Letters;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private static final char A = 'a';
    private static final char Z = 'z';
    private static final int TWENTY_SIX = Z - A + 1;

    public String removeDuplicateLetters(String s) {
        final char[] chars = s.toCharArray();
        int n = 0;
        int[] count = new int[TWENTY_SIX];
        for (char c : chars) {
            if (0 == count[c - A]++) {
                n++;
            }
        }
        char[] result = new char[n];
        boolean[] visited = new boolean[TWENTY_SIX];
        int i = 0;
        for (char c : chars) {
            count[c - A]--;
            if (visited[c - A]) {
                continue;
            }
            while (i > 0 && result[i - 1] > c && count[result[i - 1] - A] > 0) { // prev letter in the result greater and
                visited[result[i - 1] - A] = false;
                i--;
            }
            result[i++] = c;
            visited[c - A] = true;
        }

        return new String(result);
    }

}
