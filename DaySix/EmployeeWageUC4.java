package com.DaySix;

public class EmployeeWageUC4 {
	//Using Switch case statements
	//Constansts
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;

	public static void main(String[] args) {
		//variables
		int empHrs=0;
		int empWage=0;
		
		//Computation
		double empCheck = Math.floor(Math.random()*10)%3;
		switch ((int)empCheck) {
		case IS_PART_TIME:
			empHrs=4;
			break;
			
		case IS_FULL_TIME:
			empHrs=8;
			break;

		default:
			empHrs=0;
			break;
		}
		
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage is "+empWage);

	}

}
