package _224_Basic_Calculator;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        final char[] chars = s.toCharArray();
        int result = 0;
        int number = 0;
        int sign = 1;
        for (int i = 0; i < chars.length; i++) {
            final char c = chars[i];
            if (Character.isDigit(c)) {
                number = 10 * number + c - '0';
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign);
                number = 0;
                sign = 1;
                result = 0;
            } else if (c == ')') {
                result += sign * number;
                int prevSign = stack.pop();
                int prevResult = stack.pop();
                result = prevResult + prevSign * result;
                number = 0;
                sign = 1;
            }
        }
        result += sign * number;
        return result;
    }

}
