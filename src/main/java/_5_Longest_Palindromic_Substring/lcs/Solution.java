package _5_Longest_Palindromic_Substring.lcs;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public String longestPalindrome(String s) {
        return lcs(s, reverse(s));
    }

    static String lcs(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return null;
        }
        final char[] chars1 = s1.toCharArray();
        final char[] chars2 = s2.toCharArray();
        int iMax = 0, max = 0;
        int[][] dp = new int[chars1.length + 1][chars2.length + 1];
        for (int i = chars1.length - 1; i >= 0; i--) {
            for (int j = chars2.length - 1; j >= 0; j--) {
                if (chars1[i] == chars2[j]) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        iMax = i;
                    }
                }
            }
        }
        return new String(chars1, iMax, max);
    }

    static String reverse(String s) {
        if (s == null) {
            return null;
        }
        final char[] chars = s.toCharArray();
        final int N = chars.length;
        for (int i = 0; i < N >> 1; i++) {
            char t = chars[i];
            chars[i] = chars[N - 1 - i];
            chars[N - 1 - i] = t;
        }
        return new String(chars);
    }

}
