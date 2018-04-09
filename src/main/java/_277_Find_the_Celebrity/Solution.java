package _277_Find_the_Celebrity;

/**
 * @author Pavel Belevich
 */
public class Solution extends Relation {

    public int findCelebrity(int n) {
        int i, j;
        for (i = 0, j = n - 1; i != j; ) {
            if (knows(i, j)) {
                i++;
            } else {
                j--;
            }
        }
        for (i = 0; i < n; i++) {
            if (i != j && (knows(j, i) || !knows(i, j))) {
                return -1;
            }
        }
        return j;
    }

}
