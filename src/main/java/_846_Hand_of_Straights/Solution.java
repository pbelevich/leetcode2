package _846_Hand_of_Straights;

import java.util.TreeMap;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) {
            return false;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int c : hand) {
            Integer count = map.get(c);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(c, count);
        }
        for (int i = 0; i < hand.length / W; i++) {
            int first = map.firstKey();
            for (int c = first; c < first + W; c++) {
                Integer count = map.get(c);
                if (count == null || count == 0) {
                    return false;
                }
                if (count == 1) {
                    map.remove(c);
                } else {
                    map.put(c, count - 1);
                }
            }
        }
        return map.isEmpty();
    }

}
