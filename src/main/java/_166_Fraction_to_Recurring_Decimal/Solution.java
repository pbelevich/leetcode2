    package _166_Fraction_to_Recurring_Decimal;

    import java.util.HashMap;
    import java.util.Map;

    /**
     * @author Pavel Belevich
     */
    public class Solution {

        public String fractionToDecimal(int numerator, int denominator) {
            StringBuilder sb = new StringBuilder();
            if ((numerator < 0 && denominator > 0) ^ (numerator > 0 && denominator < 0)) {
                sb.append("-");
            }
            long n = Math.abs((long) numerator);
            long d = Math.abs((long) denominator);
            long left = n / d;
            sb.append(left);
            n %= d;
            Map<Long, Integer> visited = new HashMap<>();
            StringBuilder right = new StringBuilder();
            for (int i = 0; ; i++) {
                if (n == 0) {
                    if (right.length() != 0) {
                        sb.append(".").append(right);
                    }
                    break;
                }
                if (visited.containsKey(n)) {
                    right.insert(visited.get(n), "(");
                    sb.append(".").append(right).append(")");
                    break;
                }
                visited.put(n, i);
                n *= 10;
                right.append(n / d);
                n %= d;
            }
            return sb.toString();
        }

    }
