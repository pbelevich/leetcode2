package _118_Pascals_Triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> row = Collections.emptyList();
        for (int r = 0; r < numRows; r++) {
            List<Integer> newRow = new ArrayList<>(row.size() + 1);
            int prev = 0;
            for (int x : row) {
                newRow.add(x + prev);
                prev = x;
            }
            newRow.add(1);
            result.add(newRow);
            row = newRow;
        }
        return result;
    }

}
