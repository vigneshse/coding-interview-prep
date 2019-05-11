package com.heapspace.pratice.code;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	    public static List<String> fizzBuzz(int n) {
	        List<String> multiples = new ArrayList<>();
	    
	        for(int i=1; i<=n; i++){
	            if((i>=3 && i%3==0) && (i >=5 &&i%5==0)){
	                multiples.add("FizzBuzz");
	            }
	            else if(i>=3 && i%3==0){
	                multiples.add("Fizz");
	            }
	            else if(i>=5 && i%5==0){
	                multiples.add("Buzz");
	            }
	            else{
	                multiples.add(String.valueOf(i));
	            }
	        }
	        
	        return multiples;
	    }
	
	    public static void main(String[] args) {
	    	System.out.println(fizzBuzz(10).toString());
	    }
}
