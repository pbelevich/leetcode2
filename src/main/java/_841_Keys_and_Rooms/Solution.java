package _841_Keys_and_Rooms;

import java.util.*;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            int v = stack.pop();
            visited.add(v);
            if (visited.size() == rooms.size()) {
                return true;
            }
            for (int w : rooms.get(v)) {
                if (!visited.contains(w)) {
                    stack.push(w);
                }
            }
        }
        return false;
    }

}
