package com.bridgelabz.LinkedList;

public class MyLinkedList {
		Node head;
		Node tail;
	
	public Node insertFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
		 head = newNode;
		 }
		else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
		return newNode;
	}
	
	public void displayLinkedList() {
		if (head == null)
		{
			System.out.println("linked list is empty");
		}
		else {
		Node temp = head;
		System.out.println("Updated LinkedList is : ");
		while (temp != null) {
			System.out.print(temp.key + "->");
			temp = temp.next;
		}
		}
		System.out.println("\n");

	}
	
	public void append(int data) {
		Node newNode = new Node(data);
		if(head == null) {
		head = newNode;
		tail = newNode;
		}
		else
		{
			this.tail.next = newNode;
			tail = newNode;
		}
	}

	public void insertInBetween(int previous, int newNode) {
		Node currentNode = head;
		Node temp = null;
		while (currentNode != null) {
			if (currentNode.key == previous) {
				temp = currentNode;
			}
			currentNode = currentNode.next;
		}
		Node node = new Node(newNode);
		node.setKey(newNode);
		node.next = temp.next;
		temp.setNext(node);
	}

	public void pop() {
		head = head.next;
	}

	public int popLast() {
		Node currentNode = head;
		Node tail = null;
		while (currentNode.next != null) {
			tail = currentNode;
			currentNode = currentNode.next;
		}
		tail.next = currentNode.next;
		return 0;
	}

	public Node findNode(int data) {
		Node currentNode = head;
		while (currentNode != null) {
			if (currentNode.key == data) {
				
				return currentNode;
			}
			currentNode = currentNode.next;
		}
		System.out.println("No node found with value " + data);
		return null;
	}
	
	public void delete(int data) {
		Node currentNode = head;
		Node tail = null;
		int size = 0;
		while (currentNode.next != null) {
			size ++;
			if (currentNode.key == data) {
				tail.next = currentNode.next;
			}
			tail = currentNode;
			currentNode = currentNode.next;
		}
		System.out.println("after delete linked list size is: "+size);
		System.out.println("No node found with value " + data);
		
	}
	
}
