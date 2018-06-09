package _838_Push_Dominoes;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public String pushDominoes(String dominoes) {
        String newDominoes = dominoes;
        String origin;
        do {
            origin = newDominoes;
            newDominoes = newDominoes.replaceAll("R\\.\\.L", "RRLL");
            newDominoes = newDominoes.replaceAll("(?<!R)\\.L", "LL");
            newDominoes = newDominoes.replaceAll("R\\.(?!L)", "RR");
        } while (!newDominoes.equals(origin));
        return newDominoes;
    }

}
