package dfs;
/**
 *
 * @author Cassio
 */
public class DFS {

    public static void main(String[] args) {
        //Disco 1: menor. Disco 2: médio. Disco 3: maior
        NodeTree node1 = new NodeTree("[123],[ ],[ ]");
        NodeTree node2 = new NodeTree("[23],[1],[ ]");
        NodeTree node3 = new NodeTree("[23],[ ],[1]");
        NodeTree node4 = new NodeTree("[3],[1],[2]");
        NodeTree node5 = new NodeTree("[3],[2],[1]");
        NodeTree node6 = new NodeTree("[3],[ ],[12]");
        NodeTree node7 = new NodeTree("[13],[ ],[2]");
        NodeTree node8 = new NodeTree("[13],[2],[ ]");
        NodeTree node9 = new NodeTree("[3],[12],[ ]");
        NodeTree node10 = new NodeTree("[ ],[3],[12]");
        NodeTree node11 = new NodeTree("[ ],[12],[3]");
        NodeTree node12 = new NodeTree("[1],[3],[2]");
        NodeTree node13 = new NodeTree("[ ],[13],[2]");
        NodeTree node14 = new NodeTree("[ ],[2],[13]");
        NodeTree node15 = new NodeTree("[1],[2],[3]");
        NodeTree node16 = new NodeTree("[1],[23],[ ]");
        NodeTree node17 = new NodeTree("[2],[13],[ ]");
        NodeTree node18 = new NodeTree("[2],[ ],[13]");
        NodeTree node19 = new NodeTree("[1],[ ],[23]");
        NodeTree node20 = new NodeTree("[ ],[123],[ ]");
        NodeTree node21 = new NodeTree("[ ],[23],[1]");
        NodeTree node22 = new NodeTree("[2],[3],[1]");
        NodeTree node23 = new NodeTree("[12],[3],[ ]");
        NodeTree node24 = new NodeTree("[12],[ ],[3]");
        NodeTree node25 = new NodeTree("[2],[1],[3]");
        NodeTree node26 = new NodeTree("[ ],[1],[23]");
        NodeTree node27 = new NodeTree("[ ],[ ],[123]");
        
        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node3.setRight(node5);
        node4.setLeft(node6);
        node4.setRight(node7);
        node5.setLeft(node8);
        node5.setRight(node9);
        node6.setLeft(node10);
        node9.setRight(node11);
        node10.setLeft(node12);
        node10.setRight(node13);
        node11.setLeft(node14);
        node11.setRight(node15);
        node12.setLeft(node16);
        node13.setRight(node17);
        node14.setLeft(node18);
        node15.setRight(node19);
        node16.setLeft(node20);
        node16.setRight(node21);
        node17.setLeft(node22);
        node17.setRight(node23);
        node18.setLeft(node24);
        node18.setRight(node25);
        node19.setLeft(node26);
        node19.setRight(node27);
        
        DepthFirstSearch pbusca = new DepthFirstSearch("[ ],[ ],[123]");
        System.out.println("Caminho de busca nó " + pbusca.getSearchValue() + ": ");
        pbusca.search(node1);
    }
    
}
