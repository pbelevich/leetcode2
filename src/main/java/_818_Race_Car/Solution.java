package _818_Race_Car;

import java.util.Arrays;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private static int[] pow = new int[32];

    static {
        for (int i = 0, j = 1; i <= 31; i++, j *= 2) {
            pow[i] = j - 1;
        }
    }

    private static int[] cache = new int[10001];

    public int racecar(int t) {
        if (cache[t] == 0) {
            int i = Arrays.binarySearch(pow, t);
            if (i >= 0) {
                cache[t] = i;
            } else {
                int j = -i - 1;
                int next = pow[j];
                int min = (j) + 1 + racecar(next - t);
                for (int n = 1; n < j; n++) {
                    int prev = pow[n];
                    for (int k = 0; t - prev + pow[k] < t; k++) {
                        min = Math.min(min,
                                n + 1 + k + 1 + racecar(t - prev + pow[k])
                        );
                    }
                }
                cache[t] = min;
            }
        }
        return cache[t];
    }

}
