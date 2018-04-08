package _149_Max_Points_on_a_Line;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Pavel Belevich
 */
public class Solution {

    static class Frac {
        final int a, b;

        Frac(int a, int b) {
            int gcd = gcd(a, b);
            if (gcd == 0) gcd = 1;
            this.a = a / gcd;
            this.b = b / gcd;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Frac frac = (Frac) o;

            if (a != frac.a) return false;
            return b == frac.b;
        }

        @Override
        public int hashCode() {
            int result = a;
            result = 31 * result + b;
            return result;
        }
    }

    private static final Frac SINGULARITY = new Frac(0, 0);

    static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public int maxPoints(Point[] points) {
        return Arrays.stream(points).map(p -> {
                    Map<Frac, Long> fracs = Arrays.stream(points)
                            .map(q -> new Frac(q.x - p.x, q.y - p.y))
                            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                    return fracs.remove(SINGULARITY) + fracs.values().stream().max(Long::compare).orElse(0L);
                }
        ).max(Long::compare).orElse(0L).intValue();
    }

}
