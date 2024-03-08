package org.example.Task2;

import org.example.Task2.Task2.Pair;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.example.Task2.Task2.*;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void getAllPairsThatSumUpToTarget_withEmptyList_shouldReturnEmptyList() {
        assertTrue(getAllPairsThatSumUpToTarget(List.of(), 13).isEmpty());
    }

    @Test
    void getAllPairsThatSumUpToTarget_withNoMatchingSingleElement_shouldReturnEmptyList() {
        assertTrue(getAllPairsThatSumUpToTarget(List.of(12), 13).isEmpty());
    }

    @Test
    void getAllPairsThatSumUpToTarget_withElementsThatMatchTarget_shouldReturnListOfPairs() {
        List<Pair> expected = List.of(new Pair(0, 13), new Pair(3, 10), new Pair(6, 7), new Pair(6, 7));
        List<Pair> result = getAllPairsThatSumUpToTarget(List.of(1, 10, 3, 7, 5, 6, 6, 13, 0), 13);
        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
        assertFalse(result.contains(new Pair(7, 6)));
    }

    @Test
    void getAllPairsThatSumUpToTarget_withNoMatchingElements_shouldReturnEmptyList() {
        List<Pair> result = getAllPairsThatSumUpToTarget(List.of(1, 11, 3, 7, 5, 5, 5, 1, 0), 13);
        assertTrue(result.isEmpty());
    }

}
