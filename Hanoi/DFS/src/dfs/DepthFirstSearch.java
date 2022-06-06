package dfs;
/**
 *
 * @author Cassio
 */
public class DepthFirstSearch {
    private final Stack<NodeTree> stackTree;
    private final String searchValue;
    private int count = 0;

    public String getSearchValue() {
        return searchValue;
    }
    
    public DepthFirstSearch(String searchValue) {
        this.stackTree = new Stack<>();
        this.searchValue = searchValue;
    }
    
    public boolean flag(NodeTree n){
        return searchValue.equals(n.getValue());
    }
    
    public boolean search(NodeTree n){
        count++;
        this.stackTree.push(n);
        System.out.println(n.getValue() + " node" + count );
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
