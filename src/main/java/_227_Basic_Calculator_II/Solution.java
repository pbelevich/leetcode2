package _227_Basic_Calculator_II;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int calculate(String s) {
        int result = 0;
        int term = 0;
        final char[] chars = ("+" + s.replaceAll("\\s+", "") + "+0").toCharArray();
        int i = 0;
        int[] next;
        while (i != chars.length) {
            char op = chars[i++];
            switch (op) {
                case '+':
                    result += term;
                    next = nextInt(chars, i);
                    term = next[0];
                    i = next[1];
                    break;
                case '-':
                    result += term;
                    next = nextInt(chars, i);
                    term = -next[0];
                    i = next[1];
                    break;
                case '*':
                    next = nextInt(chars, i);
                    term *= next[0];
                    i = next[1];
                    break;
                case '/':
                    next = nextInt(chars, i);
                    term /= next[0];
                    i = next[1];
            }
        }
        return result;
    }

    private int[] nextInt(char[] chars, int i) {
        int j;
        int res = 0;
        for (j = i; j < chars.length && Character.isDigit(chars[j]); j++) {
            res = res * 10 + chars[j] - '0';
        }
        return new int[]{res, j};
    }

}
