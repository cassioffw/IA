package dfs;

public class NodeTree {
    private final String value;
    private NodeTree left;
    private NodeTree right;
    private NodeTree parentNode;
    
    public NodeTree(String value){
        this.value = value;
    }

    public NodeTree getParentNode() {
        return parentNode;
    }

    public void setParentNode(NodeTree parentNode) {
        this.parentNode = parentNode;
    }

    public NodeTree getLeft() {
        return left;
    }

    public void setLeft(NodeTree left) {
        this.left = left;
        this.left.setParentNode(this);
    }

    public NodeTree getRight() {
        return right;
    }

    public void setRight(NodeTree right) {
        this.right = right;
        this.right.setParentNode(this);
    }

    public String getValue() {
        return value;
    }
    
}
