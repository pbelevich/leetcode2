package _277_Find_the_Celebrity;

/**
 * @author Pavel Belevich
 */
public class Relation {

    int[][] matrix;

    public boolean knows(int a, int b) {
        if (a == b) throw new RuntimeException();
        return matrix[a][b] != 0;
    }

}
