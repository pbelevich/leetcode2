package _332_Reconstruct_Itinerary;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<String> findItinerary(String[][] tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        for (String[] ticket : tickets) {
            PriorityQueue<String> pq = map.get(ticket[0]);
            if (pq == null) {
                pq = new PriorityQueue<>();
                map.put(ticket[0], pq);
            }
            pq.offer(ticket[1]);
        }
        return dfs(map, "JFK", new LinkedList<>());
    }

    private List<String> dfs(Map<String, PriorityQueue<String>> map, String from, LinkedList<String> result) {
        PriorityQueue<String> pq = map.get(from);
        while (pq != null && !pq.isEmpty()) {
            String to = pq.poll();
            dfs(map, to, result);
        }
        result.addFirst(from);
        return result;
    }

}
