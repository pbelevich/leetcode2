package _867_Prime_Palindrome;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int primePalindrome(int N) {
        while (true) {
            if (N == reverse(N) && isPrime(N)) {
                return N;
            }
            N++;
            int len = (int) (Math.log10(N) + 1);
            if (N > 11 && len % 2 == 0) {
                N = (int) Math.pow(10, len);
            }
        }
    }

    static int reverse(int N) {
        int res = 0;
        while (N > 0) {
            res = res * 10 + (N % 10);
            N /= 10;
        }
        return res;
    }

    static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

}
