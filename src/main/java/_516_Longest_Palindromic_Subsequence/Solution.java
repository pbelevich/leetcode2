package _516_Longest_Palindromic_Subsequence;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int longestPalindromeSubseq(String s) {
        final char[] chars = s.toCharArray();
        final int N = chars.length;
        int[][] dp = new int[N + 1][N + 1];
        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--) {
                if (chars[i] == chars[N - 1 - j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[0][0];
    }

}
