package dfs;

public class NodeStack<T> {

    private T data;
    private NodeStack<T> next;

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(NodeStack next) {
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

    public NodeStack<T> getNext() {
        return this.next;
    }
}