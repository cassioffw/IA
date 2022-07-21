package greedysearch;
import java.util.ArrayList;

public class Search {
    private ArrayList<Vertex> open;
    private ArrayList<Vertex> close;
    
    Graph graph = new Graph();
    
    public Search(Graph g){
        this.graph = g;
        open.add(graph.getVertex(0));
    }
    public int percorrer(){
        double menor = 0;
        int aux = 0;
        for (int i = 0; i < open.size(); i++){
            for(int j = 0; j < open.get(i).getEdge_2().size(); i++){
                if(this.open.get(i).returnWeight(j) < menor){
                    menor = this.open.get(i).returnWeight(j);
                    aux = i;
                }
            }
        }
        return aux;
    }
    public void gSearch(int n){
        Vertex v = new Vertex<>(open.get(0));
        ArrayList<Vertex> adjacentes = new ArrayList<>();
        while(!open.isEmpty()){
            int menorH = percorrer();
            Vertex aux = this.open.get(menorH);
            this.close.add(aux);
            this.open.remove(menorH);
            for(int i = 0; i < v.getEdge_2().size(); i++){
                adjacentes.add(v.getEndVertex(i));
            }
            for(Vertex a: adjacentes){
                if(a.getD() == graph.getVertex(n).getD()){
                    System.out.println("Sucesso!");
                    break;
                }
                if(!this.open.contains(a) || !this.close.contains(a)){
                    this.open.add(a);
                }
            }
        }
    }
}
