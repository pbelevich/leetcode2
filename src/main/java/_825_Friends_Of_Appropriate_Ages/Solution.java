package _825_Friends_Of_Appropriate_Ages;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age : ages) {
            count[age]++;
        }
        int res = 0;
        for (int aAge = 1; aAge <= 120; aAge++) {
            if (count[aAge] != 0) {
                for (int bAge = 1; bAge <= 120; bAge++) {
                    if (count[bAge] != 0) {
                        if (bAge <= 0.5 * aAge + 7) {
                            continue;
                        }
                        if (bAge > aAge) {
                            continue;
                        }
                        if (aAge != bAge) {
                            res += count[bAge] * count[aAge];
                        } else if (count[aAge] != 1) {
                            res += count[aAge] * (count[aAge] - 1);
                        }
                    }
                }
            }
        }
        return res;
    }

}
