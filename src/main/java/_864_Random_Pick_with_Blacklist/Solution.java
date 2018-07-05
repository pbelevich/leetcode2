package _864_Random_Pick_with_Blacklist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private final Random r = new Random();
    private final Map<Integer, Integer> map = new HashMap<>();
    private final int K;

    public Solution(int N, int[] blacklist) {
        K = N - blacklist.length;
        final Set<Object> set = new HashSet<>();
        for (int b : blacklist) {
            if (b >= K) {
                set.add(b);
            }
        }
        int i = K;
        for (int b : blacklist) {
            if (b < K) {
                while (set.contains(i)) i++;
                map.put(b, i++);
            }
        }
    }

    public int pick() {
        int i = r.nextInt(K);
        return map.getOrDefault(i, i);
    }

}
