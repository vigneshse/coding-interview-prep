package com.heapspace.solutions.leetcode;

import java.util.Map;

public class MOA {


    Map<String, Integer> weekMap = Map.of("Monday", 1, "Tuesday", 2, "Wednesday", 3, "Thursday", 4, "Friday" , 5, "Saturday", 6, "Sunday", 7);
    Map<String, Integer> monthMap = Map.of("January", 1, "February", 2, "March", 3, "April", 4, "May", 5, "June", 6, "July", 7, "August", 8, "September", 9, "October", 10, "November", 11, "December", 12);
    Map<String, Integer> dayMonthMap = Map.of("January", 31, "February", 28, "March", 31, "April", 30, "May", 31, "June", 30, "July", 31, "August", 31, "September", 30, "October", 31, "November", 30, "December", 31);



    public int solution(int Y, String A, String B, String W) {
      // write your code in Java SE 11
    }

    private int getFirstMonday(String year, String month){
      int monthInInt = monthMap.get(month);
      int totalDays = 0;
      List<Integer> daysOfMonths = dayMonthMap.values();

      for(int i = 0 ; i < monthInInt; i++){
        totalDays += daysOfMonths.get(i);
      }
    }
  }

}
