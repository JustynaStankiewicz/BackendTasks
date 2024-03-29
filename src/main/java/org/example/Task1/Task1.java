package org.example.Task1;


import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 10, 20, 20, 2, 5);
        System.out.println("For the input:");
        System.out.println(list);
        System.out.println("expected output is:");
        printListInfo(list);
    }

    public static void printListInfo(List<Integer> nums) {
        Set<Integer> distinctElements = getSetOfDistinctElements(nums);
        List<Integer> sortedList = getSortedList(distinctElements);

        System.out.println(sortedList);
        System.out.println("count: " + nums.size());
        System.out.println("distinct: " + distinctElements.size());
        System.out.println("min: " + getMinNumber(distinctElements));
        System.out.println("max: " + getMaxNumber(distinctElements));
    }

    public static Set<Integer> getSetOfDistinctElements(List<Integer> nums) {
        return new HashSet<>(nums);
    }

    public static List<Integer> getSortedList(Set<Integer> distinctElements) {
        return distinctElements.stream().sorted().toList();
    }

    public static int getMinNumber(Set<Integer> distinctElements) {
        return distinctElements.stream().min(Integer::compare).orElse(Integer.MIN_VALUE);
    }

    public static int getMaxNumber(Set<Integer> distinctElements) {
        return distinctElements.stream().max(Integer::compare).orElse(Integer.MAX_VALUE);

    }

}
