    package _202_Happy_Number;

    import java.util.HashSet;
    import java.util.Set;

    /**
     * @author Pavel Belevich
     */
    public class Solution {

        public boolean isHappy(int n) {
            Set<Integer> visited = new HashSet<>();
            while (n != 1) {
                if (visited.contains(n)) {
                    return false;
                }
                visited.add(n);
                int next = 0;
                while (n > 0) {
                    final int k = n % 10;
                    next += k * k;
                    n /= 10;
                }
                n = next;
            }
            return true;
        }

    }
