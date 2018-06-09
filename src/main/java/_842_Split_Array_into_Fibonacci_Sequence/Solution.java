package _842_Split_Array_into_Fibonacci_Sequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> splitIntoFibonacci(String S) {
        for (int i = 1; i < S.length(); i++) {
            final Integer n = parse(S.substring(0, i));
            if (n == null) {
                break;
            }
            if (n == 0 || !S.startsWith("0")) {
                for (int j = i + 1; j < S.length(); j++) {
                    final Integer m = parse(S.substring(i, j));
                    if (m == null) {
                        break;
                    }
                    if (m == 0 || !S.startsWith("0", i)) {
                        final List<Integer> res = splitIntoFibonacci(new ArrayList<>(Arrays.asList(n, m)), S, j);
                        if (!res.isEmpty()) {
                            return res;
                        }
                    }
                }
            }
        }
        return Collections.emptyList();
    }

    private Integer parse(String s) {
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private List<Integer> splitIntoFibonacci(List<Integer> res, String S, int j) {
        if (S.length() == j) {
            return res;
        }
        final int n = res.get(res.size() - 2);
        final int m = res.get(res.size() - 1);
        final String sum = String.valueOf(n + m);
        final int i = S.indexOf(sum, j);
        if (i != j) {
            return Collections.emptyList();
        }
        res.add(n + m);
        return splitIntoFibonacci(res, S, j + sum.length());
    }

}
