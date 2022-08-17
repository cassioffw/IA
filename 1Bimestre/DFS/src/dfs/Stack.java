package dfs;

public class Stack<T> {
    
    private NodeStack<T> top;
    private int size;

    public void push(T data) {
        NodeStack<T> tmp = new NodeStack<>();
        tmp.setData(data);
        if(this.top != null) {
            tmp.setNext(this.top);
        }
        this.top = tmp;
        this.size ++;
    }

    public T pop() {
        if(this.top != null) {
            NodeStack<T> aux = this.top;
            this.top = this.top.getNext();
            this.size --;
            return aux.getData();
        }
        return null;
    }

    public T top() {
        return (this.top != null ? this.top.getData() : null);
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public int size() {
        return this.size;
    }
}