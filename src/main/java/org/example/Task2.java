package org.example;


import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> fullList = List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0);
        System.out.println(fullList);
        printListInfo(fullList);

    }

    public static void printListInfo(List<Integer> nums){
        List<Pair> pairs = sumUp(nums, 13);
        Collections.sort(pairs);
        printPairs(pairs);
    }

    public static List<Pair> sumUp(List<Integer> nums, int target){
        Map<Integer, Integer> hashmap = new HashMap<>();
        List<Pair> result = new ArrayList<>();
        for(int number: nums){
            int diff = target - number;
            if(hashmap.containsKey(diff)){
                result.add(new Pair(number, diff));
            }else{
                hashmap.put(number,diff);
            }
        }

        return result;
    }
    private static void printPairs(List<Pair> pairs) {
        pairs.forEach(pair -> System.out.println(pair.first + " " + pair.second));
    }

    private static class Pair implements Comparable<Pair> {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.first != other.first) {
                return Integer.compare(this.first, other.first);
            } else {
                return Integer.compare(this.second, other.second);
            }
        }
    }

}
