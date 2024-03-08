package org.example.Task3;

import org.junit.jupiter.api.Test;

import static org.example.Task3.Task3.*;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void countSeparatedGraphs_shouldReturnCorrectValue() {
        int n = 3;
        int[][] edges = {{4, 3}, {1, 4}, {5, 6}};
        assertEquals(2, countSeparatedGraphs(n, edges));
    }

    @Test
    void countSeparatedGraphs_withCyclicGraph_shouldReturnSingleGraph() {
        int n = 3;
        int[][] edges = {{1, 2}, {2, 3}, {3, 1}};
        assertEquals(1, countSeparatedGraphs(n, edges));
    }

    @Test
    void countSeparatedGraphs_withNoEdges_shouldReturnZero() {
        int n = 0;
        int[][] edges = {};
        assertEquals(0, countSeparatedGraphs(n, edges));
    }

    @Test
    void countSeparatedGraphs_withMultipleComponents_shouldReturnCorrectCount() {
        int n = 5;
        int[][] edges = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        assertEquals(5, countSeparatedGraphs(n, edges));
    }

}
