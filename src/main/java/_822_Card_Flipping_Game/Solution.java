package _822_Card_Flipping_Game;

import java.util.HashSet;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int flipgame(int[] fronts, int[] backs) {
        final HashSet<Object> same = new HashSet<>();
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i]) {
                same.add(fronts[i]);
            }
        }

        int result = 9999;

        for (int f : fronts) {
            if (!same.contains(f)) {
                result = Math.min(result, f);
            }
        }

        for (int b : backs) {
            if (!same.contains(b)) {
                result = Math.min(result, b);
            }
        }

        return result % 9999;
    }

}
