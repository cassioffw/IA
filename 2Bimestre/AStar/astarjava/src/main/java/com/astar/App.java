package com.astar;

public class App {

    public static void main(String[] args) {

        Node n1 = new Node("Arad", 366);//Cidade e distancia da cidade até o objetivo
        Node n2 = new Node("Zerind", 374);
        Node n3 = new Node("Oradea", 380);
        Node n4 = new Node("Sibiu", 253);
        Node n5 = new Node("Fagaras", 178);
        Node n6 = new Node("Rimnicu Vilcea", 193);
        Node n7 = new Node("Pitesti", 98);
        Node n8 = new Node("Timisoara", 329);
        Node n9 = new Node("Lugoj", 244);
        Node n10 = new Node("Mehadia", 241);
        Node n11 = new Node("Drobeta", 242);
        Node n12 = new Node("Craiova", 160);
        Node n13 = new Node("Bucharest", 0);
        Node n14 = new Node("Giurgiu", 77);

        n1.edge = new Edge[] {new Edge(n2, 75), new Edge(n4, 140), new Edge(n8, 118)};

        n2.edge = new Edge[] {new Edge(n1, 75), new Edge(n3, 71)};

        n3.edge = new Edge[] {new Edge(n2, 71), new Edge(n4, 151)};

        n4.edge = new Edge[] {new Edge(n1, 140), new Edge(n5, 99), new Edge(n3, 151), new Edge(n6, 80)};

        n5.edge = new Edge[] {new Edge(n4, 99), new Edge(n13, 211)};

        n6.edge = new Edge[] {new Edge(n4, 80), new Edge(n7, 97), new Edge(n12, 146)};

        n7.edge = new Edge[] {new Edge(n6, 97), new Edge(n13, 101), new Edge(n12, 138)};

        n8.edge = new Edge[] {new Edge(n1, 118), new Edge(n9, 111)};

        n9.edge = new Edge[] {new Edge(n8, 111), new Edge(n10, 70)};

        n10.edge = new Edge[] {new Edge(n9, 70), new Edge(n11, 75)};

        n11.edge = new Edge[] {new Edge(n10, 75), new Edge(n12, 120)};

        n12.edge = new Edge[] {new Edge(n11, 120), new Edge(n6, 146), new Edge(n7, 138)};

        n13.edge = new Edge[] {new Edge(n7, 101), new Edge(n14, 90), new Edge(n5, 211)};

        n14.edge = new Edge[] {new Edge(n13, 90)};

        AStarSearch a = new AStarSearch();
        a.Search(n1, n13);//Partindo de Arad até Bucharest

        System.out.println("Caminho feito pelo A*: " + a.path(n13));
    }

}
