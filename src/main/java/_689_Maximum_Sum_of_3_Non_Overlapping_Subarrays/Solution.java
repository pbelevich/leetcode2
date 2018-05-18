package _689_Maximum_Sum_of_3_Non_Overlapping_Subarrays;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        final int n = nums.length;
        int[] sums = new int[n - k + 1];
        for (int i = 0; i < k; i++) {
            sums[0] += nums[i];
        }
        for (int i = 1; i <= n - k; i++) {
            sums[i] = sums[i - 1] - nums[i - 1] + nums[i + k - 1];
        }

        int[] third = new int[n - k + 1];
        third[n - k] = n - k;
        for (int i = n - k - 1; i >= 2 * k; i--) {
            int newSum = sums[i];
            int oldSum = sums[third[i + 1]];
            if (newSum > oldSum) {
                third[i] = i;
            } else if (newSum < oldSum) {
                third[i] = third[i + 1];
            } else {
                third[i] = lexMin(nums, k, i, i + 1);
            }
        }

        int[] second = new int[n - 2 * k + 1];
        second[n - 2 * k] = n - 2 * k;
        for (int i = n - 2 * k - 1; i >= k; i--) {
            int newSum = sums[i] +
                    sums[third[i + k]];
            int oldSum = sums[second[(i + 1)]] +
                    sums[third[second[(i + 1)] + k]];
            if (newSum > oldSum) {
                second[i] = i;
            } else if (newSum < oldSum) {
                second[i] = second[i + 1];
            } else {
                second[i] = lexMin(nums, k, i, i + 1);
            }
        }

        int[] first = new int[n - 3 * k + 1];
        first[n - 3 * k] = n - 3 * k;
        for (int i = n - 3 * k - 1; i >= 0; i--) {
            int newSum = sums[i] +
                    sums[second[i + k]] +
                    sums[third[second[i + k] + k]];
            int oldSum = sums[first[(i + 1)]] +
                    sums[second[first[(i + 1)] + k]] +
                    sums[third[second[first[(i + 1)] + k] + k]];
            if (newSum > oldSum) {
                first[i] = i;
            } else if (newSum < oldSum) {
                first[i] = first[i + 1];
            } else {
                first[i] = lexMin(nums, k, i, i + 1);
            }
        }

        final int f = first[0];
        final int s = second[f + k];
        final int t = third[s + k];

        return new int[]{f, s, t};
    }

    private int lexMin(int[] nums, int k, int i, int j) {
        if (k == 0) {
            return i;
        } else {
            if (nums[i] < nums[j]) {
                return i;
            } else if (nums[i] > nums[j]) {
                return j;
            } else {
                return lexMin(nums, k - 1, i + 1, j + 1);
            }
        }
    }

}
