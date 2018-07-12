package _647_Palindromic_Substrings;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int countSubstrings(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        final int N = 1 + (s.length() << 1);

        char[] chars = new char[N];
        int i = 0;
        for (char c : s.toCharArray()) {
            chars[1 + ((i++) << 1)] = c;
        }

        int expandedBy = 0;
        int[] a = new int[N];
        for (i = 0; i < N; ) {
            final int halfLen = expand(chars, i);
            a[i] = 1 + (halfLen << 1);
            expandedBy = Math.max(expandedBy, i + halfLen);
            for (int j = 1; j <= halfLen; j++) {
                a[i + j] = a[i - j];
            }
            int iNext = i + 1;
            for (int j = 1; j <= halfLen; j++) {
                if (i + j + a[i + j] >= expandedBy) {
                    iNext = Math.max(iNext, j);
                    break;
                }
            }
            i = iNext;
        }

        int res = 0;
        for (i = 1; i < N - 1; i++) {
            if (a[i] > 1) {
                res += ((a[i] >> 1) + 1) >> 1;
            }
        }
        return res;
    }

    private int expand(char[] s, int i) {
        int len;
        for (len = 0; (i - 1 - len) >= 0 && (i + 1 + len) < s.length && s[i - 1 - len] == s[i + 1 + len]; len++) ;
        return len;
    }

}
