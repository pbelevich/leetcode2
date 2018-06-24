package _857_Minimum_Cost_to_Hire_K_Workers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Worker {
        final int quality;
        final int wage;
        final double ratio;

        public Worker(int quality, int wage) {
            this.quality = quality;
            this.wage = wage;
            this.ratio = (double) wage / quality;
        }
    }

    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        final int N = quality.length;
        Worker[] worker = new Worker[N];
        for (int i = 0; i < N; i++) {
            worker[i] = new Worker(quality[i], wage[i]);
        }
        Arrays.sort(worker, Comparator.comparing(w -> w.ratio));

        PriorityQueue<Worker> pq = new PriorityQueue<>(Comparator.comparing(w -> -w.quality));
        double totalQuality = 0.0;
        for (int i = 0; i < K; i++) {
            pq.offer(worker[i]);
            totalQuality += worker[i].quality;
        }

        double minCost = totalQuality * worker[K - 1].ratio;
        for (int i = K; i < N; i++) {
            pq.offer(worker[i]);
            totalQuality += worker[i].quality;
            Worker w = pq.poll();
            totalQuality -= w.quality;
            minCost = Math.min(minCost, totalQuality * worker[i].ratio);
        }

        return minCost;
    }

}
