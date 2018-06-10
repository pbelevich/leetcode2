package _374_Guess_Number_Higher_or_Lower;

/**
 * @author Pavel Belevich
 */
public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int lo = 1;
        int hi = n;
        while (true) {
            int mid = (lo + hi) >>> 1;
            final int guess = guess(mid);
            if (guess < 0) {
                hi = mid - 1;
            } else if (guess > 0) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
    }

}
