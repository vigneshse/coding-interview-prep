package com.heapspace.pratice.code;

public class IsUniqueChars {

    boolean hasUniqueChars(String word){
        boolean[] charSet = new boolean[128];
        for(char c : word.toCharArray()){
            if(charSet[c]){
                return false;
            }
            charSet[c] = true;
        }
        return true;
    }

    public static void main(String args[]){
        IsUniqueChars isUniqueChars = new IsUniqueChars();
        System.out.println(isUniqueChars.hasUniqueChars("tesyt"));
    }
}
