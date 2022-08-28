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
	/*
	 * UC4 : ability to insert 30 between 56 and 70.
	 */
	public static void insertBetween() {
		MyLinkedList list=new MyLinkedList();
        list.insertFirst(70);
        list.displayLinkedList();
        list.insertFirst(56);
        list.displayLinkedList();
		list.insertInBetween(56,30);;
		list.displayLinkedList();	
	}
	/*
	 * UC5 : ability to delete first element of linked list
	 */
	public static void deleteFirst() {
		MyLinkedList list = new MyLinkedList();
		list.insertFirst(70);   
		list.insertFirst(30);   
		list.insertFirst(56);  
		list.displayLinkedList(); 
		list.pop(); 
        list.displayLinkedList();
	}
	/*
	 * UC6 : Ability to delete last element of linked list
	 */
	public static void deleteLast() {
		MyLinkedList list = new MyLinkedList();
		list.insertFirst(70);   
		list.insertFirst(30);   
		list.insertFirst(56);  
		list.displayLinkedList(); 
		list.popLast(); 
        list.displayLinkedList();
	}
	/*
	 * UC7 : ability to search linked list to find node with value 30
	 */
	public static void searchNode() {
		MyLinkedList list=new MyLinkedList();
		list.insertFirst(30);
		list.insertFirst(70);
		list.insertFirst(56);
		list.findNode(30);
		list.displayLinkedList();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do{
		System.out.println("Enter a choice : \n 1.Add data at start \n 2.Add data at end \n 3.Insert In Between "
				+ "\n 4.Delete first \n 5.delete last \n 6.search node \n 7.exit");
		num = sc.nextInt();
		switch(num) {
		case 1:
			addDataAtStart();
			break;
		case 2:
			addDataAtEnd();
			break;
		case 3:
			insertBetween();
			break;
		case 4:
			deleteFirst();
			break;
		case 5:
			deleteLast();
			break;
		case 6:
			searchNode();
			break;
		default :
			System.exit(0);
			}
		}while(num != 7);
		sc.close();
	}
}
