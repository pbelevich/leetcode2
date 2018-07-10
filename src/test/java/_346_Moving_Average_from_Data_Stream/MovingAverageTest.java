package _346_Moving_Average_from_Data_Stream;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class MovingAverageTest {

    public static final double DELTA = 1e-9;

    @Test
    public void next() {
        final MovingAverage m = new MovingAverage(3);
        assertEquals(1.0, m.next(1), DELTA);
        assertEquals(5.5, m.next(10), DELTA);
        assertEquals(4.666666666666667, m.next(3), DELTA);
        assertEquals(6.0, m.next(5), DELTA);
    }

}