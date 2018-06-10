package _831_Masking_Personal_Information;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private static Map<Integer, String> map = new HashMap<Integer, String>() {{
        put(10, "***-***-");
        put(11, "+*-***-***-");
        put(12, "+**-***-***-");
        put(13, "+***-***-***-");
    }};

    public String maskPII(String S) {
        if (S.contains("@")) {
            return maskEmail(S);
        } else {
            return maskPhone(S);
        }
    }

    private String maskEmail(String s) {
        final int at = s.indexOf("@");
        return (s.charAt(0) + "*****" + s.charAt(at - 1) + s.substring(at)).toLowerCase();
    }

    private String maskPhone(String s) {
        final String digitsOnly = s.replaceAll("[^\\d]", "");
        final String lastFour = digitsOnly.substring(digitsOnly.length() - 4, digitsOnly.length());
        return map.get(digitsOnly.length()) + lastFour;
    }

}
