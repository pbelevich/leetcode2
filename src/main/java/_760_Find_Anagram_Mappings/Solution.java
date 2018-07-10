package _760_Find_Anagram_Mappings;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int[] anagramMappings(int[] A, int[] B) {
        final HashMap<Integer, Stack<Integer>> map = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            map.computeIfAbsent(B[i], x -> new Stack<>()).push(i);
        }
        int[] result = new int[A.length];
        int i = 0;
        for (int a : A) {
            result[i++] = map.get(a).pop();
        }
        return result;
    }

}
