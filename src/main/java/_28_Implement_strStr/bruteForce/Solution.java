package _28_Implement_strStr.bruteForce;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        final char[] hayChars = haystack.toCharArray();
        final char[] needleChars = needle.toCharArray();
        for (int i = 0; i < hayChars.length - needleChars.length + 1; i++) {
            boolean found = true;
            for (int j = 0; j < needleChars.length; j++) {
                if (hayChars[i + j] != needleChars[j]) {
                    found = false;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

}
