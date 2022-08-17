package bfs;
import java.util.ArrayList;
/**
 *
 * @author Cassio
 * @param <T>
 */
public class Graph<T> {
    private final ArrayList<Vertex<T>> vertex;
    private final ArrayList<Edge<T>> edge;
    
    public Graph(){
        this.vertex = new ArrayList<>();
        this.edge = new ArrayList<>();
    }
    
    public void addVertex(T d){
        Vertex<T> newVertex  =  new Vertex<>(d);
        this.vertex.add(newVertex);
    }
    public void addEdge(double weight, T dStart, T dEnd){
        Vertex<T> start = this.searchVertex(dStart);
        Vertex<T> end = this.searchVertex(dEnd);
        Edge<T> edge = new Edge<>(weight, start, end);
        start.addEdge2(edge);
        end.addEdge1(edge);
        this.edge.add(edge);
    }
    public Vertex<T> searchVertex(T d){
        Vertex<T> v = null;
        for(int i = 0; i < this.vertex.size(); i++){
            if(this.vertex.get(i).getD().equals(d)){
                v = this.vertex.get(i);
                break;
            }
        }
        return v;
    }
}
