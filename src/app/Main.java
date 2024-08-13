package app;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        System.out.println();
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);

        System.out.println();
        System.out.println("Has vertex 1: " + graph.hasVertex(1));
        System.out.println("Has vertex 2: " + graph.hasVertex(2));
        System.out.println("Has vertex 3: " + graph.hasVertex(3));
        System.out.println("Has vertex 4: " + graph.hasVertex(4));

        System.out.println();
        System.out.println("Has edge 1-2: " + graph.hasEdge(1, 2));
        System.out.println("Has edge 2-1: " + graph.hasEdge(2, 1));
        System.out.println("Has edge 2-3: " + graph.hasEdge(2, 3));
        System.out.println("Has edge 3-2: " + graph.hasEdge(3, 2));
        System.out.println("Has edge 1-3: " + graph.hasEdge(1, 3));
        System.out.println("Has edge 3-1: " + graph.hasEdge(3, 1));

        System.out.println();
        graph.removeEdge(1, 3);
        System.out.println("Has edge 1-3 after removal: " + graph.hasEdge(1, 3));

        System.out.println();
        graph.addEdge(1, 3);

        System.out.println();
        graph.removeVertex(2);
        System.out.println("Has vertex 2 after removal: " + graph.hasVertex(2));
        System.out.println("Has edge 1-2 after removing vertex 2: " + graph.hasEdge(1, 2));
        System.out.println("Has edge 2-3 after removing vertex 2: " + graph.hasEdge(2, 3));
        System.out.println("Has edge 1-3 after removing vertex 2: " + graph.hasEdge(1, 3));
    }
}
