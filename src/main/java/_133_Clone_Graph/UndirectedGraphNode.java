package _133_Clone_Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pavel Belevich
 */
public class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;

    UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<>();
    }
}
