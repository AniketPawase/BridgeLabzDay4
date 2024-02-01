package com.DayTen;

import java.util.LinkedList;

public class LinkList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkList = new LinkedList<String>();
		linkList.add("A");
		linkList.add("B");
		linkList.addLast("C");
		linkList.addFirst("D");
		linkList.add("E");
		
		System.out.println("Linked list :"+linkList);
		
		linkList.remove("B");
		linkList.remove(3);
		linkList.removeFirst();
		linkList.removeLast();
		
		System.out.println("After Operations Linked List"+linkList);

	}

}
