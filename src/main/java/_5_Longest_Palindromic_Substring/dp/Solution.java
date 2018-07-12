package _5_Longest_Palindromic_Substring.dp;

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
        final char[] chars = s.toCharArray();
        final int N = s.length();
        int[][] dp = new int[N][N];
        int iMax = 1, max = 0;
        for (int l = 1; l <= N; l++) {
            for (int i = 0; i + l - 1 < N; i++) {
                int j = i + l - 1;
                if (l == 1 || (chars[i] == chars[j] && (l == 2 || dp[i + 1][j - 1] != 0))) {
                    dp[i][j] = l;
                    if (l > max) {
                        max = l;
                        iMax = i;
                    }
                }
            }
        }
        return s.substring(iMax, iMax + max);
    }

}
