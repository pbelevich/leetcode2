package _64_Minimum_Path_Sum;

import org.junit.Test;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
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
    public void minPathSum() {
        assertEquals(7, SOLUTION.minPathSum(new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        }));
    }

    @Test
    public void minPathSumBig() {
        assertEquals(85, SOLUTION.minPathSum(new int[][]{
                {7, 1, 3, 5, 8, 9, 9, 2, 1, 9, 0, 8, 3, 1, 6, 6, 9, 5},
                {9, 5, 9, 4, 0, 4, 8, 8, 9, 5, 7, 3, 6, 6, 6, 9, 1, 6},
                {8, 2, 9, 1, 3, 1, 9, 7, 2, 5, 3, 1, 2, 4, 8, 2, 8, 8},
                {6, 7, 9, 8, 4, 8, 3, 0, 4, 0, 9, 6, 6, 0, 0, 5, 1, 4},
                {7, 1, 3, 1, 8, 8, 3, 1, 2, 1, 5, 0, 2, 1, 9, 1, 1, 4},
                {9, 5, 4, 3, 5, 6, 1, 3, 6, 4, 9, 7, 0, 8, 0, 3, 9, 9},
                {1, 4, 2, 5, 8, 7, 7, 0, 0, 7, 1, 2, 1, 2, 7, 7, 7, 4},
                {3, 9, 7, 9, 5, 8, 9, 5, 6, 9, 8, 8, 0, 1, 4, 2, 8, 2},
                {1, 5, 2, 2, 2, 5, 6, 3, 9, 3, 1, 7, 9, 6, 8, 6, 8, 3},
                {5, 7, 8, 3, 8, 8, 3, 9, 9, 8, 1, 9, 2, 5, 4, 7, 7, 7},
                {2, 3, 2, 4, 8, 5, 1, 7, 2, 9, 5, 2, 4, 2, 9, 2, 8, 7},
                {0, 1, 6, 1, 1, 0, 0, 6, 5, 4, 3, 4, 3, 7, 9, 6, 1, 9}
        }));
    }

    @Test
    public void minPathSumBiggest() {
        assertEquals(823, SOLUTION.minPathSum(read("/_64_Minimum_Path_Sum/theBiggest.txt")));
    }

    private int[][] read(String name) {
        try {
            final String path = getClass().getResource(name).getPath();
            FileInputStream input = new FileInputStream(path);
            FileChannel channel = input.getChannel();

            ByteBuffer bbuf = channel.map(FileChannel.MapMode.READ_ONLY, 0, (int) channel.size());
            CharBuffer cbuf = Charset.defaultCharset().newDecoder().decode(bbuf);

            Pattern pattern = Pattern.compile("(\\s*\\d+\\s*,?)+");
            Matcher matcher = pattern.matcher(cbuf);

            List<int[]> result = new ArrayList<>();
            while (matcher.find()) {
                String match = matcher.group();
                final int[] row = Arrays.stream(match.split(",")).mapToInt(Integer::parseInt).toArray();
                result.add(row);
            }
            return result.toArray(new int[result.size()][]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}