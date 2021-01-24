package com.heapspace.solutions.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentWords {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap();
        List<String> result;

        for (String word: words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        result = count
                .keySet()
                .stream()
                .sorted((w1, w2) -> count.get(w1).equals(count.get(w2)) ? w1.compareTo(w2) : count.get(w2) - count.get(w1))
                .collect(Collectors.toList());

        return result.subList(0, k);
    }

    public static void main(String args[]){
        System.out.println(new TopKFrequentWords().topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"}, 2));
    }
}
