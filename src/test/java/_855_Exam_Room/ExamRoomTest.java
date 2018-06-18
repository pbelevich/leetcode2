package _855_Exam_Room;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class ExamRoomTest {

    @Test
    public void seat1() {
        final ExamRoom examRoom = new ExamRoom(10);
        assertEquals(0, examRoom.seat());
        assertEquals(9, examRoom.seat());
        assertEquals(4, examRoom.seat());
        assertEquals(2, examRoom.seat());
        examRoom.leave(4);
        assertEquals(5, examRoom.seat());
    }

    @Test
    public void seat2() {
        final ExamRoom examRoom = new ExamRoom(8);
        assertEquals(0, examRoom.seat());
        assertEquals(7, examRoom.seat());
        assertEquals(3, examRoom.seat());
        examRoom.leave(0);
        examRoom.leave(7);
        assertEquals(7, examRoom.seat());
        assertEquals(0, examRoom.seat());
        assertEquals(5, examRoom.seat());
        assertEquals(1, examRoom.seat());
        assertEquals(2, examRoom.seat());
        assertEquals(4, examRoom.seat());
        assertEquals(6, examRoom.seat());
    }

    @Test
    public void seat3() {
        final ExamRoom examRoom = new ExamRoom(10);
        assertEquals(0, examRoom.seat());
        assertEquals(9, examRoom.seat());
        assertEquals(4, examRoom.seat());
        examRoom.leave(0);
        examRoom.leave(4);
        assertEquals(0, examRoom.seat());
        assertEquals(4, examRoom.seat());
        assertEquals(2, examRoom.seat());
        assertEquals(6, examRoom.seat());
        assertEquals(1, examRoom.seat());
        assertEquals(3, examRoom.seat());
        assertEquals(5, examRoom.seat());
        assertEquals(7, examRoom.seat());
        assertEquals(8, examRoom.seat());
        examRoom.leave(0);
        examRoom.leave(4);
        assertEquals(0, examRoom.seat());
        assertEquals(4, examRoom.seat());
    }

    @Test
    public void seat4() {
        final ExamRoom examRoom = new ExamRoom(4);
        assertEquals(0, examRoom.seat());
        assertEquals(3, examRoom.seat());
        assertEquals(1, examRoom.seat());
        assertEquals(2, examRoom.seat());
        examRoom.leave(1);
        examRoom.leave(3);
        assertEquals(1, examRoom.seat());
    }

}