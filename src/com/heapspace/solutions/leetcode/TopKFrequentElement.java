package com.heapspace.solutions.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElement {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> topK = freqMap
                .keySet()
                .stream()
                .sorted((w1, w2) -> freqMap.get(w2) - freqMap.get(w1))
                .collect(Collectors.toList());

        return topK.subList(0 , k).stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String args[]) {
        System.out.println(new TopKFrequentElement().topKFrequent(new int[]{1, 2, 3, 4, 4, 4, 5, 6, 6, 7}, 2));
    }
}
