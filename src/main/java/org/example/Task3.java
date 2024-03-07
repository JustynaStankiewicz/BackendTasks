package org.example;


import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        int n1=3;
        int[][] edges1= { { 4,3 }, { 1,4 }, {5,6} };
        int[][] edges2= { { 1,2 }, { 2,3 }, {4,5} };
        System.out.println(countGraphs(n1, edges1));
        System.out.println(countGraphs(n1, edges2));
        int n2=4;
        int[][] edges3= { { 4,3 }, { 1,4 }, {5,6}, {3,5} };
        System.out.println(countGraphs(n2, edges3));
    }

    public static int countGraphs(int n, int[][] edges){
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0; i<n; i++){
            addEdge(graph, edges[i][0], edges[i][1]);
        }
        Set<Integer> visited = new HashSet<>();
        int counter = 0;
        Set<Integer> uniqueVertices = new HashSet<>();
        for(int[] edge: edges){
            uniqueVertices.add(edge[0]);
            uniqueVertices.add(edge[1]);
        }
        for(int vertex: uniqueVertices){
            if(!visited.contains((vertex))){
                dfs(graph,visited,vertex);
                counter++;
            }
        }

        return counter;
    }

    private static void addEdge(Map<Integer, List<Integer>> graph,int source, int destination) {
        addVertex(graph,source);
        addVertex(graph,destination);
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    private static void addVertex(Map<Integer, List<Integer>> graph, int vertex){
        graph.putIfAbsent(vertex, new ArrayList<Integer>());
    }

    private static void dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int vertex ){
        visited.add(vertex);
        for(int neighbour : graph.getOrDefault(vertex, Collections.emptyList())){
            if(!visited.contains(neighbour)){
                dfs(graph,visited, neighbour);
            }
        }
    }

}
