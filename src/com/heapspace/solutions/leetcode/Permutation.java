package com.heapspace.solutions.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutation {


  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    permuteUtil(0, nums, result);

    return result;
  }

  private void permuteUtil(int idx, int[] nums, List<List<Integer>> result){

    for(int i = idx; i < nums.length - 1; i++){
      swap(nums, i, i+1);
      List<Integer> curr = Arrays.stream(nums).boxed().collect(Collectors.toList());
      result.add(curr);
      swap(nums, i, i+1);
    }
  }

  private void swap(int nums[], int i, int j){
    if(i > nums.length && j > nums.length){
      int tmp = nums[i];
      nums[i] = nums[j];
      nums[j] = tmp;
    }
  }

  public static void main(String args[]){

  }
}

