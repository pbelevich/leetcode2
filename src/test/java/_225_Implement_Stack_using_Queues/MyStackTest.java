package _225_Implement_Stack_using_Queues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class MyStackTest {

    @Test
    public void push() {
        final MyStack s = new MyStack();
        assertTrue(s.empty());

        s.push(1);
        assertEquals(1, s.top());
        assertFalse(s.empty());
        s.push(2);
        assertEquals(2, s.top());
        assertFalse(s.empty());
        s.push(3);
        assertEquals(3, s.top());
        assertFalse(s.empty());
        s.push(4);
        assertEquals(4, s.top());
        assertFalse(s.empty());

        assertEquals(4, s.pop());
        assertFalse(s.empty());
        assertEquals(3, s.top());
        assertFalse(s.empty());

        s.push(5);
        assertEquals(5, s.top());
        assertFalse(s.empty());
        s.push(6);
        assertEquals(6, s.top());
        assertFalse(s.empty());

        assertEquals(6, s.pop());
        assertFalse(s.empty());
        assertEquals(5, s.pop());
        assertFalse(s.empty());
        assertEquals(3, s.pop());
        assertFalse(s.empty());
        assertEquals(2, s.pop());
        assertFalse(s.empty());
        assertEquals(1, s.pop());
        assertTrue(s.empty());
    }

}