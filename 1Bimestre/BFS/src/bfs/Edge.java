package bfs;

public class Edge<T> {
    private double weight;
    private Vertex<T> start;
    private Vertex<T> end;

    public Edge(double weight, Vertex<T> start, Vertex<T> end) {
        this.weight = weight;
        this.start = start;
        this.end = end;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex<T> getStart() {
        return start;
    }

    public void setStart(Vertex<T> start) {
        this.start = start;
    }

    public Vertex<T> getEnd() {
        return end;
    }

    public void setEnd(Vertex<T> end) {
        this.end = end;
    }
}
