package _860_Lemonade_Change;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean lemonadeChange(int[] bills) {
        int fives = 0;
        int tens = 0;
        for (int bill : bills) {
            switch (bill) {
                case 5:
                    fives++;
                    break;
                case 10:
                    fives--;
                    tens++;
                    break;
                case 20:
                    if (tens > 0) {
                        tens--;
                        fives--;
                    } else {
                        fives -= 3;
                    }
            }
            if (fives < 0) {
                return false;
            }
        }
        return true;
    }

}
