package com.heapspace.pratice.code;

public class PlusOneInteger {
    public int[] plusOne(int[] digits) {
        int digit = 0;
        for(int i=0;i<digits.length;i++){
            digit += digits[i] *  (int)Math.pow(10, (digits.length-1-i));
        }
        digit++;
		return Integer.toString(digit).chars().map(c -> c-'0').toArray();
    }
    
    public int[] digitToArray(int number) {
    	 return Integer.toString(number).chars().map(c -> c-'0').toArray(); 
    }
    
    
    public static void main(String[] args) {
    	PlusOneInteger plusOneInteger = new PlusOneInteger();
    	for (int digit : plusOneInteger.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0})) {
			System.out.print(digit);
		}
    }
}