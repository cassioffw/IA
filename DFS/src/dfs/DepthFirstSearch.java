package dfs;

/**
 *
 * @author Cassio
 */
public class DepthFirstSearch {
    private final Stack<NodeTree> stackTree;
    private final int searchValue;

    public int getSearchValue() {
        return searchValue;
    }
    
    public DepthFirstSearch(int searchValue) {
        this.stackTree = new Stack<>();
        this.searchValue = searchValue;
    }
    
    public boolean flag(NodeTree n){
        return n.getValue() == searchValue;
    }
    
    public boolean search(NodeTree n){
        this.stackTree.push(n);
        System.out.print(flag(n) ?  n.getValue() + " " : n.getValue() + " -> " );
        if(flag(n)){
            System.out.println(" ");
            return true;
        }else{
            if(n.getLeft() != null && this.search(n.getLeft())){
                return true;
            } 
            if (n.getRight() != null && this.search(n.getRight())) {
                return true;
            }
        }
        this.stackTree.pop();
        return false;
    }
}
