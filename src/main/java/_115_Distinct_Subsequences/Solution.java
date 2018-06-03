package _115_Distinct_Subsequences;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int numDistinct(String s, String t) {
        final char[] sChars = s.toCharArray();
        final char[] tChars = t.toCharArray();
        final int sLen = sChars.length;
        final int tLen = tChars.length;
        int[][] dp = new int[sLen + 1][tLen + 1];
        for (int i = 0; i <= sLen; i++) {
            dp[i][tLen] = 1;
        }
        for (int i = sLen - 1; i >= 0; i--) {
            for (int j = tLen - 1; j >= 0; j--) {
                if (sChars[i] == tChars[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }

}
