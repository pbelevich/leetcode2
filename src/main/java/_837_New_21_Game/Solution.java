package _837_New_21_Game;

/**
 * @author Pavel Belevich
 */
public class Solution {

    /**
     * @param N What is the probability that she has N or less points?
     * @param K Alice stops drawing numbers when she gets K or more points
     * @param W she gains an integer number of points randomly from the range [1, W]
     */
    public double new21Game(int N, int K, int W) {
        double[] dp = new double[N + W + 1];
        for (int x = K; x <= N; x++) {
            dp[x] = 1.0;
        }

        double prob = 0;
        for (int w = 1; w <= W; w++) {
            prob += dp[K + w];
        }

        for (int x = K - 1; x >= 0; x--) {
            prob += dp[x + 1] - dp[x + 1 + W];
            dp[x] = prob / W;
        }
        return dp[0];
    }

    private double new21Game(int x, int N, int K, int W) {
        if (K <= x && x <= N) {
            return 1.0;
        }
        if (x > N) {
            return 0.0;
        }
        double prob = 0;
        for (int w = 1; w <= W; w++) {
            prob += new21Game(x + w, N, K, W);
        }
        return prob / W;
    }

}