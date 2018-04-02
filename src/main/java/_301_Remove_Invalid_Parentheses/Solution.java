package _301_Remove_Invalid_Parentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * Remove the minimum number of invalid parentheses in order to make the input string valid. Return all possible results.
 * <p>
 * Note: The input string may contain letters other than the parentheses ( and ).
 * <p>
 * Examples:
 * "()())()" -> ["()()()", "(())()"]
 * "(a)())()" -> ["(a)()()", "(a())()"]
 * ")(" -> [""]
 *
 * @author Pavel Belevich
 */
class Solution {

    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        final char[] chars = s.toCharArray();
        removeInvalidParentheses(chars, result, '(', ')', 0, 0);
        return new ArrayList<>(result);
    }

    void removeInvalidParentheses(char[] chars, List<String> result, char open, char close, int lastI, int lastJ) {
        int stack = 0;
        for (int i = lastI; i < chars.length; i++) {
            char c = chars[i];
            if (c == open) {
                stack++;
            } else if (c == close) {
                stack--;
                if (stack < 0) {
                    for (int j = lastJ; j <= i; j++) {
                        if (chars[j] == close && (j == lastJ || chars[j - 1] != close)) {
                            removeInvalidParentheses(deleteChar(chars, j), result, open, close, i, j);
                        }
                    }
                    break;
                }
            }
        }
        if (open == '(') {
            if (stack == 0) {
                result.add(new String(chars));
            } else {
                removeInvalidParentheses(reverse(chars), result, close, open, 0, 0);
            }
        } else if (open == ')') {
            if (stack == 0) {
                removeInvalidParentheses(reverse(chars), result, close, open, 0, 0);
            }
        }
    }

    char[] deleteChar(char[] chars, int i) {
        char[] result = new char[chars.length - 1];
        System.arraycopy(chars, 0, result, 0, i);
        System.arraycopy(chars, i + 1, result, i, chars.length - i - 1);
        return result;
    }

    char[] reverse(char[] chars) {
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[chars.length - 1 - i];
        }
        return result;
    }

}