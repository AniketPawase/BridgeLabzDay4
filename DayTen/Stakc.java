package com.DayTen;

import java.util.Iterator;
import java.util.Stack;

public class Stakc {
	
	static void stack_push(Stack<Integer> stack) {
		for(int i=0;i<5;i++) {
			stack.push(i);
		}
	}
	
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop Operation :");
		for(int i=0;i<5;i++) {
			//Integer y = (Integer) stack.pop();
			Integer y =  stack.pop();
			System.out.println("Popped elements :"+y);
		}
	}
	
	static void stack_peek(Stack<Integer> stack) {
		//Integer ele = (Integer)stack.peek();
		Integer ele = stack.peek();
		System.out.println("Element on stack top :"+ele);
	}
	
	static void stack_search(Stack<Integer> stack,int elemnt) {
		//Integer pos = (Integer)stack.search(elemnt);
		Integer pos = stack.search(elemnt);
		if (pos == -1) 
			System.out.println("Element not Found");
		else
			System.out.println("Element found at position :"+pos);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		stack_push(stack);
		stack_peek(stack);
		stack_search(stack, 2);
		stack_search(stack, 6);


	}

}
