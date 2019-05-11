package com.heapspace.pratice.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {

	    // Complete the checkMagazine function below.
	    static void checkMagazine(String[] magazine, String[] note) {
	        Map<String, Integer> stringMap = new HashMap<>();
	            for(int i=0;i<note.length;i++){
	                if(stringMap.get(note[i])==null){
	                    stringMap.put(note[i], 1);
	                }else{
	                    Integer count = stringMap.get(note[i]);
	                    if(count!=null && count>0){
	                    stringMap.put(note[i], ++count);
	                    }
	                }
	            }

	            for(int j=0; j < magazine.length; j++){
	                    Integer value = stringMap.get(magazine[j]);
	                    if(value!=null && value > 0){
	                    stringMap.put(magazine[j], --value);
	                    }
	                }

	            for(Map.Entry<String, Integer> entry: stringMap.entrySet()){
	                if(entry.getValue()!=0){
	                    System.out.print("No");
	                    return;
	                }
	            }
	            System.out.print("Yes");
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        String[] mn = scanner.nextLine().split(" ");

	        int m = Integer.parseInt(mn[0]);

	        int n = Integer.parseInt(mn[1]);

	        String[] magazine = new String[m];

	        String[] magazineItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < m; i++) {
	            String magazineItem = magazineItems[i];
	            magazine[i] = magazineItem;
	        }

	        String[] note = new String[n];

	        String[] noteItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            String noteItem = noteItems[i];
	            note[i] = noteItem;
	        }

	        checkMagazine(magazine, note);

	        scanner.close();
	    }
	}

