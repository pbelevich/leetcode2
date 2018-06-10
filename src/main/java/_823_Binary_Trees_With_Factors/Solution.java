package _823_Binary_Trees_With_Factors;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private static final int ALPHA = 1_000_000_007;

    public int numFactoredBinaryTrees(int[] A) {
        final int N = A.length;
        Arrays.sort(A);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], i);
        }

        int[] res = new int[N];
        Arrays.fill(res, 1);
        for (int k = 1; k < N; k++) {
            for (int i = 0; i <= k - 1 && A[i] <= A[k] / A[0]; i++) {
                if (A[k] % A[i] == 0) {
                    final Integer j = map.get(A[k] / A[i]);
                    if (j != null) {
                        res[k] += ((long) res[i] * res[j]) % ALPHA;
                        res[k] %= ALPHA;
                    }
                }
            }
        }

        int sum = 0;
        for (int r : res) {
            sum += r;
            sum %= ALPHA;
        }
        return sum;
    }

}
