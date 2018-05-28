package _421_Maximum_XOR_of_Two_Numbers_in_an_Array;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Node {

        int n;
        Node[] kids = new Node[2];

        void insert(int n, int i) {
            int bit = (n >> i) & 1;
            Node kid = kids[bit];
            if (kid == null) {
                kid = new Node();
                kids[bit] = kid;
            }
            if (i != 0) {
                kid.insert(n, i - 1);
            } else {
                kid.n = n;
            }
        }

        int find(int n, int i) {
            int bit = (n >> i) & 1;
            Node kid = kids[(~bit) & 1];
            if (kid == null) {
                kid = kids[bit];
            }
            if (i != 0) {
                return kid.find(n, i - 1);
            } else {
                return kid.n;
            }
        }

    }

    public int findMaximumXOR(int[] nums) {
        Node root = new Node();
        root.insert(nums[0], 30);
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            final int n = nums[i];
            final int k = root.find(n, 30);
            max = Math.max(max, k ^ n);
            root.insert(n, 30);
        }
        return max;
    }

}
