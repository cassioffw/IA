package bfs;

public class Queue<T> {
    
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public T getHead() {
        return (T)(head);
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void enqueue(T data) {
        Node<T> aux = new Node<>();
        aux.setData(data);
        if(this.head == null) {
            this.head = aux;
        } else {
            this.tail.setNext(aux);
        }
        this.tail = aux;
        this.size ++;
    }

    public T dequeue() {
        if(this.head != null) {
            Node<T> aux = this.head;
            this.head = this.head.getNext();
            if(this.head == null) {
                this.tail = null;
            }
            this.size --;
            return aux.getData();
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public String toString() {
        String out = "[";
        Node<T> aux = this.head;
        while(aux != null) {
            out += aux.getData().toString();
            out += (aux.getNext() != null ? ", " : "]");
            aux = aux.getNext();
        }
        return out;
    }  

    
}
