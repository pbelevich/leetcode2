package _821_Shortest_Distance_to_a_Character;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] shortestToChar(String S, char C) {
        final char[] chars = S.toCharArray();
        List<Integer> indices = new ArrayList<>();
        indices.add(-100000);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == C) {
                indices.add(i);
            }
        }
        indices.add(100000);

        int[] result = new int[chars.length];

        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == C) {
                j++;
            } else {
                result[i] = min(abs(indices.get(j) - i), abs(indices.get(j + 1) - i));
            }
        }

        return result;
    }

}
