package _4_Median_of_Two_Sorted_Arrays;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        final int m = nums1.length;
        final int n = nums2.length;
        assert m <= n;

        final int half = (m + n + 1) >>> 1;

        int iLo = 0;
        int iHi = m;
        while (iLo <= iHi) {
            int i = (iLo + iHi) >>> 1;
            int j = half - i;

            final int diff = (i + j) - (m - i + n - j);
            assert diff == 0 || diff == 1;

            if (i > 0 && nums1[i - 1] > nums2[j]) {
                iHi = i - 1;
            } else if (i < m && nums2[j - 1] > nums1[i]) {
                iLo = i + 1;
            } else {
                if (diff == 0) {
                    final double maxLeft1 = i > 0 && i <= m ? nums1[i - 1] : Integer.MIN_VALUE;
                    final double maxLeft2 = j > 0 && j <= n ? nums2[j - 1] : Integer.MIN_VALUE;
                    final double maxLeft = Math.max(maxLeft1, maxLeft2);

                    final double minRight1 = i >= 0 && i < m ? nums1[i] : Integer.MAX_VALUE;
                    final double minRight2 = j >= 0 && j < n ? nums2[j] : Integer.MAX_VALUE;
                    final double minRight = Math.min(minRight1, minRight2);

                    return (maxLeft + minRight) / 2.0;
                } else {
                    final int n1 = i > 0 && i <= m ? nums1[i - 1] : Integer.MIN_VALUE;
                    final int n2 = j > 0 && j <= n ? nums2[j - 1] : Integer.MIN_VALUE;
                    return (double) Math.max(n1, n2);
                }
            }
        }
        throw new RuntimeException();
    }

}
