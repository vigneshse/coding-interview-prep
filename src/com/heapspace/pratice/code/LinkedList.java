package com.heapspace.pratice.code;

public class LinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public void printList(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node  = node.next;
		}
	}

}
