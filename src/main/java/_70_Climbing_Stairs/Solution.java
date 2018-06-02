package _70_Climbing_Stairs;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int climbStairs(int n) {
        int minusTwo = 0;
        int minusOne = 1;
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = minusOne + minusTwo;
            minusTwo = minusOne;
            minusOne = result;
        }
        return result;
    }

}
