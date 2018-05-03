package _815_Bus_Routes;


import java.util.*;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int numBusesToDestination(int[][] routes, int S, int T) {
        Map<Integer, Set<Integer>> routesByStop = new HashMap<>();
        for (int i = 0; i < routes.length; i++) {
            for (int stop : routes[i]) {
                Set<Integer> rs = routesByStop.get(stop);
                if (rs == null) {
                    rs = new HashSet<>();
                    routesByStop.put(stop, rs);
                }
                rs.add(i);
            }
        }
        Set<Integer> layer = Collections.singleton(S);
        Set<Integer> visitedStop = new HashSet<>();
        Set<Integer> visitedRoute = new HashSet<>();
        int result = 0;
        while (true) {
            if (layer.isEmpty()) {
                return -1;
            }
            if (layer.contains(T)) {
                return result;
            }
            Set<Integer> newLayer = new HashSet<>();
            for (int stop : layer) {
                visitedStop.add(stop);
                Set<Integer> stopRoutes = routesByStop.get(stop);
                for (int i : stopRoutes) {
                    if (!visitedRoute.contains(i)) {
                        visitedRoute.add(i);
                        for (int nextStop : routes[i]) {
                            if (nextStop == T) {
                                return result + 1;
                            }
                            if (!visitedStop.contains(nextStop)) {
                                newLayer.add(nextStop);
                            }
                        }
                    }
                }
            }
            layer = newLayer;
            result++;
        }
    }

}
