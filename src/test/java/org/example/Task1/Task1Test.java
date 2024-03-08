package org.example.Task1;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.example.Task1.Task1.*;
import static org.example.Task1.Task1.getSetOfDistinctElements;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void getSetOfDistinctElements_withDuplicates_shouldReturnUniqueSet() {
        List<Integer> list = Arrays.asList(1, 10, 20, 20, 2, 5);
        Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 5, 10, 20));
        assertEquals(expected, getSetOfDistinctElements(list));
    }

    @Test
    void getSetOfDistinctElements_withEmptyList_shouldReturnEmptySet() {
        List<Integer> list = Collections.emptyList();
        assertTrue(getSetOfDistinctElements(list).isEmpty());
    }

    @Test
    void getSortedList_withUnsortedSet_shouldReturnSortedList() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 10, 20, 2, 5));
        List<Integer> expected = Arrays.asList(1, 2, 5, 10, 20);
        assertEquals(expected, getSortedList(set));
    }

    @Test
    void getMinNumber_withMixedNumbers_shouldReturnMinimum() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 5, 10, 20));
        assertEquals(1, getMinNumber(set));
    }

    @Test
    void getMinNumber_withEmptySet_shouldReturnIntegerMinValue() {
        Set<Integer> set = new HashSet<>();
        assertEquals(Integer.MIN_VALUE, getMinNumber(set));
    }

    @Test
    void getMaxNumber_withMixedNumbers_shouldReturnMaximum() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 5, 10, 20));
        assertEquals(20, getMaxNumber(set));
    }

    @Test
    void getMaxNumber_withEmptySet_shouldReturnIntegerMaxValue() {
        Set<Integer> set = new HashSet<>();
        assertEquals(Integer.MAX_VALUE, getMaxNumber(set));
    }

}
