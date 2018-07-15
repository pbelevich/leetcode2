package _225_Implement_Stack_using_Queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Pavel Belevich
 */
public class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int top;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.offer(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (q1.size() > 1) {
            q2.offer(top = q1.poll());
        }
        int res = q1.poll();
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;
        return res;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }

}
