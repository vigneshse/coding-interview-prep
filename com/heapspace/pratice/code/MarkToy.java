package com.heapspace.pratice.code;

public class MarkToy {

	 static int maximumToys(int[] prices, int k) {
	        int sum=0, i=0, count=0;
	        while(i < prices.length){
	            if(k >= (sum+prices[i])){
	                sum+=prices[i];
	                count++;
	            }
	            i++;
	        }
	        return count;
	    }
	 
	 public static void main(String args[]) {
		 int[] prices = new int[] {1,2,3,4};
		 System.out.println(maximumToys(prices, 7));
	 }
}

