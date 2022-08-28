package com.bridgelabz.LinkedList;
import java.util.Scanner;

public class Operations {
	/*
	 * UC2 : ability to create linked list by adding 30 and 56 to 70 
	 * Node with data 70 is created first
	 * next 30 is added to 70
	 * and 56 is added to 30
	 */
	public static void addDataAtStart() {
	    
		 MyLinkedList  list=new  MyLinkedList() ;
		list.insertFirst(70);
		list.displayLinkedList();
		list.insertFirst(30);
		list.displayLinkedList();
		list.insertFirst(56);
	    list.displayLinkedList();
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a choice : \n 1.Add data at start " );
		int num = sc.nextInt();
		sc.close();
		switch(num) {
		case 1:
			addDataAtStart();
			break;
		default :
			System.out.println("enter valid choice");
		}
		}
}
