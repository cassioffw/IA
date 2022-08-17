package com.astar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class AStarSearch {

    public AStarSearch(){}

    public void Search(Node initial, Node goal) {
        PriorityQueue<Node> queue = new PriorityQueue<Node>(20, 
            new Comparator<Node>() {
                public int compare(Node value1, Node value2) {
                    if (value1.f > value2.f) {
                        return 1;
                    }
                    else if (value1.f < value2.f) {
                        return -1;
                    }
                    else {
                        return 0;
                    }   
                }
            }
        );
        initial.g = 0;
        queue.add(initial);
        Set<Node> visited = new HashSet<Node>();
        while ((!queue.isEmpty())) {
            Node current = queue.poll();
            visited.add(current);
            if (current.value.equals(goal.value)) {
                break;
            }
            for (Edge e : current.edge) {
                Node child = e.target;
                double cost = e.cost;
                double tempG = current.g + cost;
                double tempF = tempG + child.h;
                 
                if ((visited.contains(child)) &&
                        (tempF >= child.f)) {
                    continue;
                }

                else if ((!queue.contains(child)) || (tempF < child.f)) {
                    child.parent = current;
                    child.g = tempG;
                    child.f = tempF;
                    if (queue.contains(child)) {
                        queue.remove(child);
                    }
                    queue.add(child);
                }
            }
        }
    }

    public List<Node> path(Node target) {
        List<Node> path = new ArrayList<Node>();

        for (Node node = target; node != null; node = node.parent) {
            path.add(node);
        }

        Collections.reverse(path);
        return path;
    }
}
