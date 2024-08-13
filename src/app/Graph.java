package app;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    Set<Integer> vertexes;
    Set<Edge> edges;

    public Graph() {
        this.vertexes = new HashSet<>();
        this.edges = new HashSet<>();
    }

    public void addVertex(int vertex) {
        if (!hasVertex(vertex)) {
            vertexes.add(Integer.valueOf(vertex));
            System.out.println("Vertex " + vertex + " is added to the graph.");
        } else {
            System.out.println("Vertex " + vertex + " already exists in the graph.");
        }
    }

    public void addEdge(int source, int destination) {
        if (!hasEdge(source, destination)) {
            if (hasVertex(source) && hasVertex(destination)) {
                edges.add(new Edge(source, destination));
                System.out.println("Edge from " + source + " to " + destination + " is added to the graph.");
            } else {
                System.out.println("One or more vertexes don't exist in the graph.");
            }
        } else {
            System.out.println("Edge from " + source + " to " + destination + " already exists in the graph.");
        }
    }

    public void removeVertex(int vertex) {
        if(hasVertex(vertex)){
            vertexes.remove(vertex);
            edges.removeIf(edge -> edge.getSource() == vertex || edge.getDestination() == vertex);
            System.out.println("Vertex " + vertex + " is removed from the graph.");
        } else {
            System.out.println("Vertex " + vertex + " doesn't exist in the graph.");
        }
    }

    public void removeEdge(int source, int destination) {
        if(hasEdge(source, destination)){
            if (hasVertex(source) && hasVertex(destination)) {
                edges.remove(new Edge(source, destination));
                System.out.println("Edge from " + source + " to " + destination + " is removed from the graph.");
            } else {
                System.out.println("One or more vertices do not exist in the graph. Edge cannot be removed.");
            }
        } else {
            System.out.println("Edge from " + source + " to " + destination + " doesn't exist in the graph.");
        }
    }

    public boolean hasVertex(int vertex) {
        return vertexes.contains(vertex);
    }

    public boolean hasEdge(int source, int destination) {
        return edges.contains(new Edge(source, destination));
    }
}
