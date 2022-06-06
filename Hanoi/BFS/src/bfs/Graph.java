package bfs;
import java.util.ArrayList;
import java.util.function.Consumer;
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
    public void bfs(int n) throws InterruptedException{
        ArrayList<Vertex<T>> v = new ArrayList<>();
        ArrayList<Vertex<T>> queue = new ArrayList<>();
        ArrayList <String> date = new ArrayList<>();
        Vertex<T> actual = this.vertex.get(n);
        System.out.println("Caminho: ");
        v.add(actual);
        queue.add(actual);
        while(queue.size() > 0){
            Vertex<T> visited = queue.get(0);
            for(int i = 0; i < visited.getEdge_2().size(); i++){
               Vertex<T> next = visited.getEdge_2().get(i).getEnd();
               if(!v.contains(next)){
                   v.add(next);
                   date.add((String) next.getD());
                   queue.add(next);
               }
            }
            queue.remove(0);
        }
        date.forEach((String item) -> {
            if(item.equals(vertex.get(vertex.size()-1).getD())){
                System.out.println(item + " Objetivo Alcançado!");
            }else {
                System.out.println(item + "->");
            }
        });
    }
}
