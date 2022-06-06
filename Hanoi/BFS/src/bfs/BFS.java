package bfs;
/**
 *
 * @author Cassio
 */
public class BFS {

    public static void main(String[] args) throws InterruptedException {
        Graph<String> grafo = new Graph<>();
        grafo.addVertex("[123],[ ],[ ]");
        grafo.addVertex("[23],[1],[ ]");
        grafo.addVertex("[23],[ ],[1]");
        grafo.addVertex("[3],[1],[2]");
        grafo.addVertex("[3],[2],[1]");
        grafo.addVertex("[3],[ ],[12]");
        grafo.addVertex("[13],[ ],[2]");
        grafo.addVertex("[13],[2],[ ]");
        grafo.addVertex("[3],[12],[ ]");
        grafo.addVertex("[ ],[3],[12]");
        grafo.addVertex("[ ],[12],[3]");
        grafo.addVertex("[1],[3],[2]");
        grafo.addVertex("[ ],[13],[2]");
        grafo.addVertex("[ ],[2],[13]");
        grafo.addVertex("[1],[2],[3]");
        grafo.addVertex("[1],[23],[ ]");   
        grafo.addVertex("[2],[13],[ ]");
        grafo.addVertex("[2],[ ],[13]");
        grafo.addVertex("[1],[ ],[23]");
        grafo.addVertex("[ ],[123],[ ]");
        grafo.addVertex("[ ],[23],[1]");
        grafo.addVertex("[2],[3],[1]");
        grafo.addVertex("[12],[3],[ ]");
        grafo.addVertex("[12],[ ],[3]");
        grafo.addVertex("[2],[1],[3]");
        grafo.addVertex("[ ],[1],[23]");
        grafo.addVertex("[ ],[ ],[123]");
        
        grafo.addEdge(1, "[123],[ ],[ ]", "[23],[1],[ ]");
        grafo.addEdge(1, "[123],[ ],[ ]", "[23],[ ],[1]");
        grafo.addEdge(1, "[23],[1],[ ]", "[3],[1],[2]");
        grafo.addEdge(1, "[23],[ ],[1]", "[3],[2],[1]");
        grafo.addEdge(1, "[3],[1],[2]", "[3],[ ],[12]");
        grafo.addEdge(1, "[3],[1],[2]", "[13],[ ],[2]");
        grafo.addEdge(1, "[3],[2],[1]", "[13],[2],[ ]");
        grafo.addEdge(1, "[3],[2],[1]", "[3],[12],[ ]");
        grafo.addEdge(1, "[3],[ ],[12]", "[ ],[3],[12]");
        grafo.addEdge(1, "[3],[12],[ ]", "[ ],[12],[3]");
        grafo.addEdge(1, "[ ],[3],[12]", "[1],[3],[2]");
        grafo.addEdge(1, "[ ],[3],[12]", "[ ],[13],[2]");
        grafo.addEdge(1, "[ ],[12],[3]", "[ ],[2],[13]");
        grafo.addEdge(1, "[ ],[12],[3]", "[1],[2],[3]");
        grafo.addEdge(1, "[1],[3],[2]", "[1],[23],[ ]");
        grafo.addEdge(1, "[ ],[13],[2]", "[2],[13],[ ]");
        grafo.addEdge(1, "[ ],[2],[13]", "[2],[ ],[13]");
        grafo.addEdge(1, "[1],[2],[3]", "[1],[ ],[23]");
        grafo.addEdge(1, "[1],[23],[ ]", "[ ],[123],[ ]");
        grafo.addEdge(1, "[1],[23],[ ]", "[ ],[23],[1]");
        grafo.addEdge(1, "[2],[13],[ ]", "[2],[3],[1]");
        grafo.addEdge(1, "[2],[13],[ ]", "[12],[3],[ ]");
        grafo.addEdge(1, "[2],[ ],[13]", "[12],[ ],[3]");
        grafo.addEdge(1, "[2],[ ],[13]", "[2],[1],[3]");
        grafo.addEdge(1, "[1],[ ],[23]", "[ ],[1],[23]");
        grafo.addEdge(1, "[1],[ ],[23]", "[ ],[ ],[123]");
        
        
        grafo.bfs(0);
    }
    
}
