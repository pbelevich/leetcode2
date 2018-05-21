package _839_Similar_String_Groups;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int numSimilarGroups(String[] A) {
        int[] cc = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            cc[i] = i;
        }

        int n = A.length;
        for (int i = 0; i < A.length; i++) {
            final String s1 = A[i];
            for (int j = 0; j < A.length; j++) {
                final String s2 = A[j];
                if (adj(s1, s2)) {
                    final int p1 = parent(cc, i);
                    final int p2 = parent(cc, j);
                    if (p1 != p2) {
                        n--;
                        cc[p1] = p2;
                    }
                }
            }
        }

        return n;
    }

    private boolean adj(String s1, String s2) {
        final char[] chars1 = s1.toCharArray();
        final char[] chars2 = s2.toCharArray();
        int diff = 0;
        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                diff++;
                if (diff > 2) {
                    return false;
                }
            }
        }
        return true;
    }

    private int parent(int[] cc, int i) {
        while (cc[i] != i) {
            i = cc[i];
        }
        return i;
    }

}
