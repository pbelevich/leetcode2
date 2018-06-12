package _826_Most_Profit_Assigning_Work;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Task {
        final int difficulty;
        final int profit;

        Task(int difficulty, int profit) {
            this.difficulty = difficulty;
            this.profit = profit;
        }
    }

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        final int N = difficulty.length;
        Task[] tasks = new Task[N];
        for (int i = 0; i < N; i++) {
            tasks[i] = new Task(difficulty[i], profit[i]);
        }
        Arrays.sort(tasks, Comparator.comparing(t -> t.difficulty));

        int result = 0;
        for (int w : worker) {
            int max = 0;
            for (int i = 0; i < N && tasks[i].difficulty <= w; i++) {
                max = Math.max(max, tasks[i].profit);
            }
            result += max;
        }
        return result;
    }

}
