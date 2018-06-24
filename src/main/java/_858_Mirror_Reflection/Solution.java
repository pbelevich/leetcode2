package _858_Mirror_Reflection;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public int mirrorReflection(int p, int q) {
        if ((q & 1) == 0 && (p & 1) == 0) {
            return mirrorReflection(p >> 1, q >> 1);
        } else if ((q & 1) == 0) {
            return 0;
        } else if ((p & 1) == 0) {
            return 2;
        } else {
            return 1;
        }
    }

}
