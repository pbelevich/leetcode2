package _349_Intersection_of_Two_Arrays;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        for (int n1 : nums1) {
            min1 = Math.min(min1, n1);
            max1 = Math.max(max1, n1);
        }
        int len = max1 - min1 + 1;
        int[] count = new int[len];
        for (int n1 : nums1) {
            count[n1 - min1] = 1;
        }

        int size = 0;
        for (int n2 : nums2) {
            if (n2 >= min1 && n2 <= max1 && count[n2 - min1] == 1) {
                count[n2 - min1] = 2;
                size++;
            }
        }
        int[] res = new int[size];
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (count[i] == 2) {
                res[j++] = i + min1;
            }
        }
        return res;
    }

}
