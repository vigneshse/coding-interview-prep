package com.heapspace.pratice.code;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {
	Map <Integer, String> map;

	public HashMapIterator() {
		map = new HashMap<>();
	}

	public void addMap(Map<Integer, String> map) {
		map.put(1, "one");
		map.put(2, "two");
	}


	public void printMap(Map<Integer, String> map) {
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println("Key: "+entry.getKey());
			System.out.println("Value: "+ entry.getValue());
		}
	}

	public void printKeys(Map<Integer, String> map) {
		for(Object object: map.keySet()) {
			System.out.println("Key: " + object.toString());
		}
	}
	public void printValue(Map<Integer, String> map) {
		for(Object object: map.values()) {
			System.out.println("Value: " + object.toString());
		}
	}
	
	
	public static void main(String args[]) {
		HashMapIterator hmi = new HashMapIterator();
		hmi.addMap(hmi.map);
		hmi.printMap(hmi.map);
		hmi.printKeys(hmi.map);
		hmi.printValue(hmi.map);
	}
}
