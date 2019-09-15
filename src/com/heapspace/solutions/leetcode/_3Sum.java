package com.heapspace.solutions.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _3Sum {
    public List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> resultSet = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            int pivot = nums[i];
            int begin = i + 1;
            int end = nums.length - 1;

            while (begin < end) {
                int sum = nums[begin] + pivot + nums[end];
                if (sum == 0) {
                    List list = new ArrayList();
                    list.add(nums[begin]);
                    list.add(pivot);
                    list.add(nums[end]);
                    Collections.sort(list);
                    if (!resultSet.contains(list)) {
                        resultSet.add(list);
                    }
                    end--;
                    begin++;
                } else if (sum < 0) {
                    begin++;
                } else {
                    end--;
                }
            }
        }
        return resultSet;
    }

    public static void main(String args[]) {
        System.out.println(new _3Sum().threeSum(new int[]{-1, 0, -1, 1, -2, 2}).toString());
    }
}



/*
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * 
 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
	-4, -1, -1, 0 , 1, 2 

 */