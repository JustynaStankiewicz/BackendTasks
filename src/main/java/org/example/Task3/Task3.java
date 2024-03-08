package org.example.Task3;


import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{4, 3}, {1, 4}, {5, 6}};
        System.out.println("For the input:");
        System.out.println(n);
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1]);
        }
        System.out.println("expected output is:");
        System.out.println(countSeparatedGraphs(n, edges));
    }

    public static int countSeparatedGraphs(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < Math.min(n, edges.length); i++) {
            addEdge(graph, edges[i][0], edges[i][1]);
        }

        Set<Integer> visited = new HashSet<>();
        int counter = 0;
        Set<Integer> uniqueVertices = new HashSet<>();

        for (int[] edge : edges) {
            uniqueVertices.add(edge[0]);
            uniqueVertices.add(edge[1]);
        }
        for (int vertex : uniqueVertices) {
            if (!visited.contains((vertex))) {
                dfs(graph, visited, vertex);
                counter++;
            }
        }

        return counter;
    }

    private static void addEdge(Map<Integer, List<Integer>> graph, int source, int destination) {
        addVertex(graph, source);
        addVertex(graph, destination);
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    private static void addVertex(Map<Integer, List<Integer>> graph, int vertex) {
        graph.putIfAbsent(vertex, new ArrayList<>());
    }

    private static void dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int vertex) {
        visited.add(vertex);
        for (int neighbour : graph.getOrDefault(vertex, Collections.emptyList())) {
            if (!visited.contains(neighbour)) {
                dfs(graph, visited, neighbour);
            }
        }
    }

}
