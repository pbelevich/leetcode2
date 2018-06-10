package _833_Find_And_Replace_in_String;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Replace {
        final int index;
        final String source;
        final String target;

        Replace(int index, String source, String target) {
            this.index = index;
            this.source = source;
            this.target = target;
        }
    }

    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        final int N = indexes.length;
        assert sources.length == N;
        assert targets.length == N;
        List<Replace> replaces = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            if (S.startsWith(sources[i], indexes[i])) {
                replaces.add(new Replace(indexes[i], sources[i], targets[i]));
            }
        }
        replaces.sort(Comparator.comparingInt(o -> o.index));
        int delta = 0;
        for (Replace r : replaces) {
            final String begin = S.substring(0, delta + r.index);
            final String end = S.substring(delta + r.index + r.source.length(), S.length());
            S = begin + r.target + end;
            delta += r.target.length() - r.source.length();
        }
        return S;
    }

}
