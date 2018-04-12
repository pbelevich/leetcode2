package _72_Edit_Distance;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int minDistance(String word1, String word2) {
        final char[] chars1 = word1.toCharArray();
        final char[] chars2 = word2.toCharArray();

        int[][] dp = new int[chars1.length + 1][chars2.length + 1];

        for (int i = 0; i <= chars1.length; i++) {
            dp[chars1.length - i][chars2.length] = i;
        }
        for (int j = 0; j <= chars2.length; j++) {
            dp[chars1.length][chars2.length - j] = j;
        }

        for (int i = chars1.length - 1; i >= 0; i--) {
            for (int j = chars2.length - 1; j >= 0; j--) {
                if (chars1[i] == chars2[j]) {
                    dp[i][j] = dp[i + 1][j + 1];
                } else {
                    dp[i][j] = 1 + Math.min(Math.min(dp[i + 1][j], dp[i][j + 1]), dp[i + 1][j + 1]);
                }
            }
        }
        return dp[0][0];
    }

}
