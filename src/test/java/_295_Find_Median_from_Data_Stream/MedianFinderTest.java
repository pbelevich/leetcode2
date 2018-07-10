package _295_Find_Median_from_Data_Stream;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class MedianFinderTest {

    public static final double DELTA = 1e-9;

    @Test
    public void findMedian() {
        final MedianFinder m = new MedianFinder();
        m.addNum(1);
        assertEquals(1.0, m.findMedian(), DELTA);
        m.addNum(2);
        assertEquals(1.5, m.findMedian(), DELTA);
        m.addNum(3);
        assertEquals(2.0, m.findMedian(), DELTA);

    }

}