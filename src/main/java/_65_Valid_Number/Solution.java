package _65_Valid_Number;

import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private static final Set<Character> validChars = Stream.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.', 'e', '+', '-').collect(toSet());

    public boolean isNumber(String s) {
        if (s == null) {
            return false;
        }
        s = s.trim().toLowerCase();
        if (s.isEmpty()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (!validChars.contains(c)) {
                return false;
            }
        }

        final int indexOfExp = s.indexOf('e');

        String mantissa = indexOfExp >= 0 ? s.substring(0, indexOfExp) : s;
        String exponent = indexOfExp >= 0 ? s.substring(indexOfExp + 1) : "0";

        return validFloat(mantissa) && validInt(exponent);
    }

    private boolean validInt(String s) {
        if (s.startsWith("+") || s.startsWith("-")) {
            s = s.substring(1);
        }
        if (s.isEmpty()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    private boolean validFloat(String s) {
        if (s.startsWith("+") || s.startsWith("-")) {
            s = s.substring(1);
        }
        s = s.replaceFirst("\\.", "");
        if (s.isEmpty()) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

}
