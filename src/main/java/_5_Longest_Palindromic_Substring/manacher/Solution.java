package _5_Longest_Palindromic_Substring.manacher;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        if (s.isEmpty()) {
            return s;
        }

        final int N = (s.length() << 1) + 1;

        char[] chars = new char[N];
        int i = 0;
        for (char c : s.toCharArray()) {
            chars[1 + ((i++) << 1)] = c;
        }

        int expandedBy = 0;
        int[] a = new int[N];
        for (i = 0; i < N; ) {
            int halfLength = expand(chars, i);
            a[i] = (halfLength << 1) + 1;
            expandedBy = Math.max(expandedBy, i + halfLength);
            for (int j = 1; j <= halfLength; j++) {
                a[i + j] = a[i - j];
            }
            int iNext = i + 1;
            for (int j = 1; j <= halfLength; j++) {
                if (i + j + a[i + j] >= expandedBy) {
                    iNext = Math.max(iNext, j);
                    break;
                }
            }
            i = iNext;
        }

        int max = 0;
        for (i = 1; i < N; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }

        final int maxLen = a[max];
        final int center = max >> 1;
        final int half = maxLen >> 2;

        return s.substring(center - half, center + half + (chars[max] == 0 ? 0 : 1));
    }

    private int expand(char[] s, int i) {
        int len;
        for (len = 0; (i - 1 - len) >= 0 && (i + 1 + len) < s.length && s[i - 1 - len] == s[i + 1 + len]; len++) ;
        return len;
    }

}
