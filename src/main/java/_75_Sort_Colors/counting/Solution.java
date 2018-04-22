package _75_Sort_Colors.counting;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int n : nums) {
            count[n]++;
        }
        int i = 0;
        for (int c = 0; c < count.length; c++) {
            for (int j = 0; j < count[c]; j++) {
                nums[i++] = c;
            }
        }
    }

}
