package com.heapspace.pratice.code;

public class StringFirstMatch {
	public int strStr(String haystack, String needle) {
        char[] hayArr = haystack.toCharArray();
        char[] neeArr = needle.toCharArray();
        int matchCount = 1;
        int patternStart = 0;
        int matIndex = getMatchIndex(hayArr, neeArr[patternStart++]);
        int storeInd = matIndex;
        while(patternStart < neeArr.length){
            if(hayArr[++matIndex]==neeArr[patternStart++]){
                matchCount++;
            }
        }
        if(matchCount == neeArr.length){
            return storeInd;
        }
        else{
            return -1;
        }
    }
    
    public int getMatchIndex(char[] strArr, char c){
        int pivot = -1;
        for(int i = 0; i < strArr.length; i++){
            if(c==strArr[i]){
                pivot=i;
            }
        }
        return pivot;
    }
}
