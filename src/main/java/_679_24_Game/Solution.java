package _679_24_Game;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean judgePoint24(int[] nums) {
        double[] doubles = new double[nums.length];
        for (int i = 0; i < nums.length; i++) {
            doubles[i] = nums[i];
        }
        return helper(doubles);
    }

    private boolean helper(double[] nums) {
        if (nums.length == 1 && Math.abs(nums[0] - 24) < 1e-6) {
            return true;
        }
        final int N = nums.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    double[] n1 = new double[nums.length - 1];
                    int z = 0;
                    for (int k = 0; k < N; k++) {
                        if (k != i && k != j) {
                            n1[z++] = nums[k];
                        }
                    }
                    n1[z] = nums[i] + nums[j];
                    if (helper(n1)) return true;
                    n1[z] = nums[i] - nums[j];
                    if (helper(n1)) return true;
                    n1[z] = nums[i] * nums[j];
                    if (helper(n1)) return true;
                    n1[z] = nums[i] / nums[j];
                    if (helper(n1)) return true;
                }
            }
        }
        return false;
    }

}
