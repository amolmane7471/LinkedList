package com.bridgelabz.LinkedList;

public class Node {
	int key;
	Node next;
	
	public Node(int key) {
		this.key = key;
		this.next = null;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}

	public void setKey(int key) {
	  this.key = key;
	}

}
