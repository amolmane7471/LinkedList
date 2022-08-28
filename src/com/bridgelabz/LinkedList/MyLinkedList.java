package com.bridgelabz.LinkedList;

public class MyLinkedList {
		Node head;

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
		System.out.println("LinkedList is : ");
		while (temp != null) {
			System.out.print(temp.key + "->");
			temp = temp.next;
		}
		}
		System.out.println("\n");
	}

}
