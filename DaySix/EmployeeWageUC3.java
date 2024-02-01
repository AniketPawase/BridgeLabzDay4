package com.DaySix;

public class EmployeeWageUC3 {
	//UseCase3 and Usecase4
	//Constansts
	static final int IS_PART_TIME=1;
	static final int IS_FULL_TIME=2;
	static final int EMP_RATE_PER_HOUR=20;


	public static void main(String[] args) {
		//variables
		int empHrs=0;
		int empWage=0;
		
		//Computation
		double empCheck = Math.floor(Math.random()*10)%3;
		if(empCheck == IS_FULL_TIME)
			empHrs=8;
		else if(empCheck == IS_PART_TIME)
			empHrs=4;
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage is "+empWage);

	}

}
