package _856_Score_of_Parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int scoreOfParentheses(String S) {
        Deque<Integer> stack = new ArrayDeque<>();
        int frame = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(frame);
                frame = 0;
            } else {
                int res = frame;
                frame = stack.pop();
                if (res == 0) {
                    frame += 1;
                } else {
                    frame += 2 * res;
                }
            }
        }
        return frame;
    }

}
