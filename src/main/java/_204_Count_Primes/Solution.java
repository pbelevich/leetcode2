package _204_Count_Primes;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int countPrimes(int n) {
        boolean[] table = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!table[i]) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    table[j] = true;
                }
            }
        }
        return count;
    }

}
