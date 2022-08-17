package greedysearch;

public class GreedySearch {

    public static void main(String[] args) {
        Graph<String> g = new Graph<>();
        g.addVertex("A");
        g.addVertex("B");
        g.addVertex("C");
        g.addVertex("D");

        g.addEdge(5, "A", "C");
        g.addEdge(2, "A", "B");
        g.addEdge(8, "B", "C");
        g.addEdge(2, "B", "D");

        Search GFS = new Search(g);
        int r = GFS.gSearch(3);// procura o "D"
        if (r == -1) {
            System.out.println("Destino não encontrado");
        }
    }

}
