package _819_Most_Common_Word;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.groupingBy;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        final HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        final Map<String, Long> freqMap = Arrays.stream(paragraph.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s"))
                .filter(w -> !bannedSet.contains(w)).collect(groupingBy(identity(), counting()));
        return freqMap.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey();
    }

}
