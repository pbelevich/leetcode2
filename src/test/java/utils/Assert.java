package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Assert {

    static public <T extends Comparable<T>> void assertEquals(List<T> expected, List<T> actual) {
        List<T> expected2 = new ArrayList<>(expected);
        Collections.sort(expected2);

        List<T> actual2 = new ArrayList<>(actual);
        Collections.sort(actual2);

        org.junit.Assert.assertEquals(expected2, actual2);
    }

}
