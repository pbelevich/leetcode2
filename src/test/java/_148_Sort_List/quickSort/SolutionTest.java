package _148_Sort_List.quickSort;

import org.junit.Ignore;
import org.junit.Test;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void sortList() {
        assertEquals(n(new int[]{1, 2, 3, 4}), SOLUTION.sortList(n(new int[]{4, 2, 1, 3})));
        assertEquals(n(new int[]{-3, 1, 4, 5, 5, 8, 11, 14, 15, 19}), SOLUTION.sortList(n(new int[]{4, 19, 14, 5, -3, 1, 8, 5, 11, 15})));
    }

    @Ignore
    @Test
    public void sortListBiggest() {
        final int[] array = read("/_148_Sort_List/theBiggest.txt");
        ListNode theBiggest = n(array);
        SOLUTION.sortList(theBiggest);
    }

    private ListNode n(int val, ListNode next) {
        final ListNode node = new ListNode(val);
        node.next = next;
        return node;
    }

    private ListNode n(int val) {
        return n(val, null);
    }

    private ListNode n(int[] vals) {
        ListNode first = null;
        ListNode prev = n(0);
        for (int v : vals) {
            final ListNode node = n(v);
            if (first == null) {
                first = node;
            }
            prev.next = node;
            prev = node;
        }
        return first;
    }

    private int[] read(String name) {
        try {
            final String path = getClass().getResource(name).getPath();
            FileInputStream input = new FileInputStream(path);
            FileChannel channel = input.getChannel();

            ByteBuffer bbuf = channel.map(FileChannel.MapMode.READ_ONLY, 0, (int) channel.size());
            CharBuffer cbuf = Charset.defaultCharset().newDecoder().decode(bbuf);

            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(cbuf);

            List<Integer> result = new ArrayList<>();
            while (matcher.find()) {
                String match = matcher.group();
                result.add(Integer.valueOf(match));
            }
            return result.stream().mapToInt(i -> i).toArray();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}