package _297_Serialize_and_Deserialize_Binary_Tree.preorder;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author Pavel Belevich
 */
public class Codec {

    public static final Pattern p = Pattern.compile(",");
    public static final String NULL_TOKEN = "null";
    public static final String COMMA = ",";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    private void serialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(NULL_TOKEN).append(COMMA);
        } else {
            sb.append(root.val).append(COMMA);
            serialize(root.left, sb);
            serialize(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        final ArrayDeque<String> stack = new ArrayDeque<>(Arrays.asList(data.split(COMMA)));
        return deserialize(stack);
    }

    private TreeNode deserialize(ArrayDeque<String> stack) {
        final String token = stack.pop();
        if (NULL_TOKEN.equals(token)) {
            return null;
        } else {
            final TreeNode node = new TreeNode(Integer.parseInt(token));
            node.left = deserialize(stack);
            node.right = deserialize(stack);
            return node;
        }
    }

}