package com.DaySix;

public class EmployeeWageUC8 {
	//Compute Employee Wage for Multiple Company in
	//Procedural Way Using Class Methods
	
	
	final static int IS_FULL_TIME=1;
	final static int IS_PART_TIME=2;
	final static int EMP_WAGE_PERHR=125;
	final static int MAX_HR_MONTH=200;
	final static int MAX_DAYS_MONTH=25;
	
	public static int computeWage() {
		//Variables
		int empHrs=0;
		int totalWorkHrs=0;
		int totalWorkDays=0;
		
		//Computation
		while(totalWorkHrs < MAX_HR_MONTH && 
				totalWorkDays<MAX_DAYS_MONTH ) {
			totalWorkDays++;
			double empCheck = Math.floor(Math.random()*10)%3;
			
			switch ((int)empCheck) {
			case IS_FULL_TIME:
				empHrs=8;
				break;

			case IS_PART_TIME:
				empHrs=4;
				break;
				
			default:
				empHrs=0;
				break;
			}
			totalWorkHrs=totalWorkHrs+empHrs;
			System.out.println("Day# : "+totalWorkDays+" & Emp Hours :"+empHrs);
		}
		int totalEmpWage = totalWorkHrs * EMP_WAGE_PERHR;
		System.out.println("Total Emp Wage : "+totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeWage();
	}

}
