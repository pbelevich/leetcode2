package _828_Unique_Letter_String;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int uniqueLetterString(String S) {
        final char[] chars = S.toCharArray();
        final List<Integer>[] index = new List[26];
        for (int i = 0; i < 26; i++) {
            index[i] = new ArrayList<>();
        }
        for (int i = 0; i < chars.length; i++) {
            index[chars[i] - 'A'].add(i);
        }

        long ans = 0;
        for (List<Integer> A : index) {
            for (int i = 0; i < A.size(); i++) {
                long prev = i > 0 ? A.get(i - 1) : -1;
                long next = i < A.size() - 1 ? A.get(i + 1) : S.length();
                ans += (A.get(i) - prev) * (next - A.get(i));
            }
        }

        return (int) ans % 1_000_000_007;
    }

}
