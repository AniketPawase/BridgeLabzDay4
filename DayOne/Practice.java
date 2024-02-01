package com.DayOne;

public class Practice {

	//First Use Case: Employee present or Not
	
	public static void main(String[] args) {
		//First Use Case: Employee present or Not
		//constants
		int IS_FULL_TIME=1;
		//Computation
		double empCheck = Math.floor(Math.random()*10)%2;
		if(empCheck == IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is Absent");
		
		
		//Second UseCase:
		int IS_PART_TIME=0;
		int WORK_HRS=0;
	}

}
