package dfs;
/**
 *
 * @author Cassio
 */
public class DFS {

    public static void main(String[] args) {
        NodeTree node0 = new NodeTree(0);
        NodeTree node1 = new NodeTree(1);
        NodeTree node2 = new NodeTree(2);
        NodeTree node3 = new NodeTree(3);
        NodeTree node4 = new NodeTree(4);
        NodeTree node5 = new NodeTree(5);
        NodeTree node6 = new NodeTree(6);
        
        node0.setLeft(node1);
        node0.setRight(node2);
        
        node1.setLeft(node3);
        node1.setRight(node4);
        
        node2.setLeft(node5);
        node2.setRight(node6);
        
        DepthFirstSearch DFS = new DepthFirstSearch(6);
        System.out.print("Caminho de busca nó " + DFS.getSearchValue() + ": ");
        DFS.search(node0);
    }
    
}
