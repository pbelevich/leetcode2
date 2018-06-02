package _133_Clone_Graph;

import java.util.HashMap;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return node != null ? cloneGraph(new HashMap<>(), node) : null;
    }

    private UndirectedGraphNode cloneGraph(HashMap<UndirectedGraphNode, UndirectedGraphNode> map, UndirectedGraphNode node) {
        UndirectedGraphNode result = map.get(node);
        if (result == null) {
            result = new UndirectedGraphNode(node.label);
            map.put(node, result);
            for (UndirectedGraphNode neighbor : node.neighbors) {
                result.neighbors.add(cloneGraph(map, neighbor));
            }
        }
        return result;
    }

}
