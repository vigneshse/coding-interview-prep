package com.heapspace.solutions.leetcode;

import java.util.*;

public class TopKFrequentElement {

    public static List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));

        for (int n : count.keySet()) {
            heap.add(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        List<Integer> topK = new LinkedList();
        while (!heap.isEmpty())
            topK.add(heap.poll());
        Collections.reverse(topK);
        return topK;
    }

    public static void main(String aregs[]) {
        System.out.println(topKFrequent(new int[]{1, 2, 3, 4, 4, 4, 5, 6, 6, 7}, 2));
    }
}
