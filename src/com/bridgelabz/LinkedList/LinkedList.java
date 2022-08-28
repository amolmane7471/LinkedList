package com.bridgelabz.LinkedList;
/*
 * purpose : we have create simple linked list to manipulate operations on 3 values
 * @author Amol
 * @since 2022/08/27
 */
public class LinkedList {
	/*
	 * UC1 : create a simple linked list of 56,30,70
	 */
	public static void main(String[] args) {
	   System.out.println("<<<< Welcome To LinkedList >>>>");
	   /*
	    * create a object of node 
	    * head pointer point to first node and 
	    * assign second node  to first node next,
	    * third node to the second node next.
	    */
	   Node firstNode = new Node(56);
	   Node secondNode = new Node(30);
	   Node thirdNode = new Node(70);
	   Node head = firstNode;
	   firstNode.next = secondNode;
	   secondNode.next = thirdNode;
	   /*
	    * assign head to temp variable
	    * and check temp is null or not,if not null print first element of list
	    */
	   Node temp = head;
	   while(temp != null)
	   {
		   System.out.print(temp.key+ "->");
		   temp = temp.next;
	   }
	}
   }

