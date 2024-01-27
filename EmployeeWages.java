package com.DayOne;

public class EmployeeWages {
	final static int IS_FULL_TIME=1;
	final static int IS_PART_TIME=0;
	final static int EMP_WAGE_PERHR=125;
	final static int MAX_HR_MONTH=200;
	final static int MAX_DAYS_MONTH=25;

	public static void main(String[] args) {
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		int totalWorkHrs=0;
		int totalWorkDays=0;
		
		while(totalWorkHrs<MAX_HR_MONTH &&  totalWorkDays<MAX_DAYS_MONTH ) {
			
			double empCheck = Math.floor(Math.random()*10)%2;
			if(empCheck == IS_FULL_TIME)
			{
				totalWorkDays++;
				System.out.println("Employee is present");
			}
			else
			System.out.println("Employee Is Absent");
			
			switch ((int)empCheck) {
			case 0:
				empHrs=4;
				break;

			case 1:
				empHrs=8;
				break;
				
			default:
				empHrs=0;
				break;
			}
			totalWorkHrs=totalWorkHrs+empHrs;
			empWage=empHrs*EMP_WAGE_PERHR;
			System.out.println("Employee wage is "+empWage);
			totalEmpWage=totalEmpWage+empWage;
		}
		System.out.println("Total Working Hours were "+totalWorkHrs);
		System.out.println("Total Working Days were "+totalWorkDays);
		System.out.println("Total Employee Wage is "+totalEmpWage);
	}

}
