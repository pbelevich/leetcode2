package _824_Goat_Latin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Pavel Belevich
 */
public class Solution {

    private static final Set<Character> VOWEL = new HashSet<>(Arrays.asList('a', 'o', 'e', 'i', 'u'));

    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        final Pattern pattern = Pattern.compile("\\w+|\\s+");
        final Matcher matcher = pattern.matcher(S);
        String a = "";
        while (matcher.find()) {
            final String word = matcher.group();
            final char[] chars = word.toCharArray();
            if (!word.trim().isEmpty()) {
                if (VOWEL.contains(Character.toLowerCase(chars[0]))) {
                    sb.append(word).append("ma");
                } else {
                    sb.append(new String(chars, 1, chars.length - 1)).append(chars[0]).append("ma");
                }
                a = a + "a";
                sb.append(a);
            } else {
                sb.append(word);
            }
        }
        return sb.toString();
    }

}
