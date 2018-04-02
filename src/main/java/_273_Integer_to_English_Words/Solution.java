package _273_Integer_to_English_Words;

/**
 * @author Pavel Belevich
 */
class Solution {

    private static final String[] lessThan20 = new String[]{
            "",
            "One",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            "Ten",
            "Eleven",
            "Twelve",
            "Thirteen",
            "Fourteen",
            "Fifteen",
            "Sixteen",
            "Seventeen",
            "Eighteen",
            "Nineteen"
    };

    private static final String[] tens = new String[]{
            null,
            null,
            "Twenty",
            "Thirty",
            "Forty",
            "Fifty",
            "Sixty",
            "Seventy",
            "Eighty",
            "Ninety"
    };

    private static final String[] xxx = new String[]{"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (0 == num) {
            return "Zero";
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; num > 0; i++) {
                StringBuilder sb = new StringBuilder();
                final int c = num % 1000;
                if (c > 0) {
                    final int h = c / 100;
                    if (h > 0) {
                        sb.append(lessThan20[h]).append(" ").append("Hundred");
                    }
                    final int to = c % 100;
                    if (to > 0) {
                        if (to < 20) {
                            sb.append(" ").append(lessThan20[to]);
                        } else {
                            int t = to / 10;
                            sb.append(" ").append(tens[t]);
                            int o = to % 10;
                            if (o > 0) {
                                sb.append(" ").append(lessThan20[o]);
                            }
                        }
                    }
                    final String x = xxx[i];
                    sb.append(" ").append(x);
                    result.insert(0, " ").insert(0, sb.toString().trim());
                }
                num /= 1000;
            }
            return result.toString().trim();
        }
    }

}
