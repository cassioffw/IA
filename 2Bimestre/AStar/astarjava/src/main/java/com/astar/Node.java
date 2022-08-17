package com.astar;

public class Node{

    public final String value;
    public double g;
    public final double h;
    public double f = 0;
    public Edge[] edge;
    public Node parent;

    public Node(String value, double h){
        this.value = value;
        this.h = h;
    }

    public String toString(){
        return value;
    }
}
