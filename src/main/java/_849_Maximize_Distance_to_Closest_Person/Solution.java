package _849_Maximize_Distance_to_Closest_Person;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int maxDistToClosest(int[] seats) {
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < seats.length; ) {
            if (seats[i] == 0) {
                int j;
                for (j = i; j < seats.length && (seats[j] == 0); j++) ;
                if (i == 0) {
                    i = -(j - i);
                }
                if (j == seats.length) {
                    j = j + (j - i);
                }

                int len = j - i;
                if (len > maxJ - maxI) {
                    maxI = i;
                    maxJ = j;
                }
                i = j;
            } else {
                i++;
            }
        }
        if (maxI == 0) {
            return maxJ;
        }
        if (maxJ == seats.length) {
            return seats.length - maxI;
        }
        return (maxJ - maxI + 1) / 2;
    }

}
