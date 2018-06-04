package _139_Word_Break;

import java.util.Comparator;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        wordDict.sort(Comparator.reverseOrder());
        boolean[] dp = new boolean[s.length() + 1];
        dp[s.length()] = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (String word : wordDict) {
                int j = i + word.length();
                if (j <= s.length() && word.equals(s.substring(i, j))) {
                    if (dp[j]) {
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[0];
    }

}
