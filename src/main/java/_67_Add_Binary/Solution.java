package _67_Add_Binary;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public String addBinary(String a, String b) {
        final char[] as = a.toCharArray();
        final char[] bs = b.toCharArray();
        final char[] res = new char[Math.max(as.length, bs.length) + 1];
        int carry = 0;
        for (int i = as.length - 1, j = bs.length - 1, k = res.length - 1; k >= 0; i--, j--, k--) {
            int x = i >= 0 ? as[i] - '0' : 0;
            int y = j >= 0 ? bs[j] - '0' : 0;
            int sum = x + y + carry;
            res[k] = (char) ((sum & 1) + '0');
            carry = sum >> 1;
        }
        int offset = res[0] == '1' ? 0 : 1;
        return new String(res, offset, res.length - offset);
    }

}
