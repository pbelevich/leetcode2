package _853_Car_Fleet;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Car {
        final int pos;
        final double time;

        Car(int pos, double time) {
            this.pos = pos;
            this.time = time;
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        final int N = position.length;
        if (N == 0) {
            return 0;
        }
        final Car[] cars = new Car[N];
        for (int i = 0; i < N; i++) {
            cars[i] = new Car(position[i], (double) (target - position[i]) / speed[i]);
        }
        Arrays.sort(cars, Comparator.comparing(c -> c.pos));
        int result = 1;
        for (int i = N - 1; i > 0; i--) {
            if (cars[i].time < cars[i - 1].time) {
                result++;
            } else {
                cars[i - 1] = cars[i];
            }
        }
        return result;
    }

}
