package _119_Pascals_Triangle_II;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = Collections.emptyList();
        for (int r = 0; r <= rowIndex; r++) {
            List<Integer> newRow = new ArrayList<>(row.size() + 1);
            int prev = 0;
            for (int x : row) {
                newRow.add(x + prev);
                prev = x;
            }
            newRow.add(1);
            row = newRow;
        }
        return row;
    }

}
