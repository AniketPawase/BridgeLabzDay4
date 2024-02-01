package com.DayTen;

import java.util.LinkedList;
import java.util.Queue;

public class Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue= new LinkedList<>();
		queue.add("apple");
		queue.add("banana");
		queue.add("cherry");
		
		System.out.println("Queue :"+queue);
		
		String front = queue.remove();
		System.out.println("Removed Element :"+front);

		System.out.println("Upadated Queue :"+queue);
		
		queue.add("dates");
		
		String peeked = queue.peek();
		System.out.println("Peeked Element :"+peeked);
		
		System.out.println("Upadated Queue Second :"+queue);
	}

}
