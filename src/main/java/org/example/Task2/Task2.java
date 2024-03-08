package org.example.Task2;


import java.util.*;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 10, 7, 5, 3, 6, 6, 13, 0);
        System.out.println(list);
        List<Pair> pairs = sumUp(list, 13);
        printPairs(pairs);

    }

    public static List<Pair> sumUp(List<Integer> nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        List<Pair> result = new ArrayList<>();
        for (int number : nums) {
            int diff = target - number;
            if (hashmap.containsKey(diff)) {
                result.add(new Pair(number, diff));
            } else {
                hashmap.put(number, diff);
            }
        }
        Collections.sort(result);
        return result;
    }

    private static void printPairs(List<Pair> pairs) {
        pairs.forEach(System.out::println);
    }

    static class Pair implements Comparable<Pair> {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        @Override
        public String toString() {
            return first + " " + second;
        }

    }

}
