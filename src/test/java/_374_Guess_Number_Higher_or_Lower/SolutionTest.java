package _374_Guess_Number_Higher_or_Lower;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void guessNumber1() {
        Solution solution = new Solution();
        solution.setMax(10);
        solution.setN(6);
        assertEquals(solution.getN(), solution.guessNumber(solution.getMax()));
    }

    @Test
    public void guessNumber2() {
        Solution solution = new Solution();
        solution.setMax(2);
        solution.setN(2);
        assertEquals(solution.getN(), solution.guessNumber(solution.getMax()));
    }

}