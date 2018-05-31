package _315_Count_of_Smaller_Numbers_After_Self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Node {

        final int val;
        int count;
        int size;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }

    Node insert(Node root, int n) {
        if (root == null) {
            root = new Node(n);
        }
        if (n < root.val) {
            root.left = insert(root.left, n);
        } else if (n > root.val) {
            root.right = insert(root.right, n);
        } else {
            root.count++;
        }
        root.size++;
        return root;
    }

    int size(Node root, int n) {
        if (root == null) {
            return 0;
        } else if (n < root.val) {
            return size(root.left, n);
        } else if (n > root.val) {
            return size(root.left) + root.count + size(root.right, n);
        } else {
            return size(root.left);
        }
    }

    int size(Node root) {
        return root != null ? root.size : 0;
    }

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>(nums.length);
        Node root = null;
        for (int i = nums.length - 1; i >= 0; i--) {
            final int n = nums[i];
            final int size = size(root, n);
            result.add(size);
            root = insert(root, n);
        }
        Collections.reverse(result);
        return result;
    }

}
