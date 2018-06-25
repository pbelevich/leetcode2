package _859_Buddy_Strings;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            return dups(A);
        }
        final char[] aChars = A.toCharArray();
        final char[] bChars = B.toCharArray();
        final int N = aChars.length;
        int i = 0;
        while (aChars[i] == bChars[i]) {
            i++;
        }
        int j = i + 1;
        while (j < N && aChars[j] == bChars[j]) {
            j++;
        }
        if (j >= N || aChars[i] != bChars[j] || aChars[j] != bChars[i]) {
            return false;
        }
        for (int k = j + 1; k < N; k++) {
            if (aChars[k] != bChars[k]) {
                return false;
            }
        }
        return true;
    }

    private boolean dups(String s) {
        int[] res = new int[26];
        for (char c : s.toCharArray()) {
            if (++res[c - 'a'] > 1) {
                return true;
            }
        }
        return false;
    }

}
