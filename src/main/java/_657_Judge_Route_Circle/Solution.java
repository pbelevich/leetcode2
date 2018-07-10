package _657_Judge_Route_Circle;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
            }
        }
        return x == 0 && y == 0;
    }

}
