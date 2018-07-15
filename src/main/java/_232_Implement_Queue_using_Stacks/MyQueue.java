package _232_Implement_Queue_using_Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Pavel Belevich
 */
public class MyQueue {

    private Deque<Integer> s1;
    private Deque<Integer> s2;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        s1.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}
