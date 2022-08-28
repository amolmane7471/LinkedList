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
	/*
	 * UC3 :Ability to create linkedlist by appending 30 and 70 to 56
	 * append method insert new element next to the first element 
	 */
	public static void addDataAtEnd() {
	
	MyLinkedList list=new MyLinkedList();
	list.append(56);
	list.displayLinkedList();
	list.append(30);
	list.displayLinkedList();
	list.append(70);
	list.displayLinkedList();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do{
		System.out.println("Enter a choice : \n 1.Add data at start \n 2.Add data at end \n 3.exit");
		num = sc.nextInt();
		switch(num) {
		case 1:
			addDataAtStart();
			break;
		case 2:
			addDataAtEnd();
			break;
		default :
			System.exit(0);
			}
		}while(num != 3);
		sc.close();
	}
}
