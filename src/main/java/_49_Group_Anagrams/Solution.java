package _49_Group_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy((String s) -> {
            final char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }, Collectors.toList())).values());
    }

}
