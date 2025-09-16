package datastructures.graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public boolean addVertex (String vertex) {

        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {

        if (!adjList.containsKey(vertex1) || !adjList.containsKey(vertex2)) {
            throw new IllegalArgumentException("One or both vertices do not exist: " + vertex1 + ", " + vertex2);
        }

        if (vertex1.equals(vertex2)) {
            System.out.println("⚠ Skipping self-loop on vertex: " + vertex1);
            return false;
        }

        // Prevent duplicate edges
        if (!adjList.get(vertex1).contains(vertex2)) {
            adjList.get(vertex1).add(vertex2);
        }
        if (!adjList.get(vertex2).contains(vertex1)) {
            adjList.get(vertex2).add(vertex1);
        }

        return true;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if (adjList.containsKey(vertex1) && adjList.containsKey(vertex2)) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if (!adjList.containsKey(vertex)) return false;

        for (String otherVertex : adjList.get(vertex)) {
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }


    public void printGraph() {
        System.out.println(adjList);
    }
}
