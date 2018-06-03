package _337_House_Robber_III;

import org.junit.Test;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void rob() {
        assertEquals(7, SOLUTION.rob(t(3, t(2, null, t(3)), t(3, null, t(1)))));
        assertEquals(9, SOLUTION.rob(t(3, t(4, t(1), t(3)), t(5, null, t(1)))));
    }

    @Test
    public void robLarge() {
        assertEquals(27106502, SOLUTION.rob(t("/_337_House_Robber_III/large.txt")));
    }

    TreeNode t(int val, TreeNode left, TreeNode right) {
        final TreeNode result = new TreeNode(val);
        result.left = left;
        result.right = right;
        return result;
    }

    TreeNode t(int val) {
        return t(val, null, null);
    }

    TreeNode t(String name) {
        try {
            final String path = getClass().getResource(name).getPath();
            FileInputStream input = new FileInputStream(path);
            FileChannel channel = input.getChannel();

            ByteBuffer bbuf = channel.map(FileChannel.MapMode.READ_ONLY, 0, (int) channel.size());
            CharBuffer cbuf = Charset.defaultCharset().newDecoder().decode(bbuf);

            Pattern pattern = Pattern.compile("\\w+");
            Matcher matcher = pattern.matcher(cbuf);

            List<String> result = new ArrayList<>();
            while (matcher.find()) {
                String match = matcher.group();
                result.add(match);
            }
            return t(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private TreeNode t(List<String> result) {
        if (result.isEmpty()) {
            return null;
        } else {
            Iterator<String> it = result.iterator();
            TreeNode root = new TreeNode(Integer.valueOf(it.next()));
            List<TreeNode> level = Collections.singletonList(root);
            while (!level.isEmpty()) {
                List<TreeNode> newLevel = new ArrayList<>(level.size());
                for (TreeNode node : level) {
                    final String left = it.hasNext() ? it.next() : "null";
                    if ("null".equals(left)) {
                        node.left = null;
                    } else {
                        node.left = new TreeNode(Integer.valueOf(left));
                        newLevel.add(node.left);
                    }
                    final String right = it.hasNext() ? it.next() : "null";
                    if ("null".equals(right)) {
                        node.right = null;
                    } else {
                        node.right = new TreeNode(Integer.valueOf(right));
                        newLevel.add(node.right);
                    }
                }
                level = newLevel;
            }
            return root;
        }
    }

}