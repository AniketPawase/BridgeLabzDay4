package com.DaySeven;

import java.util.Scanner;

public class StockAccountManagement {
	
	//Name of stock holder
	String [] nameOfShare;
	
	//How much amount he has in shares
	public void getStockAmount () {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of Stocks ");
	int noOfStocks = sc.nextInt();
	System.out.println("Enter the No. of shares ");
	int noOfShares = sc.nextInt();
	//Names of shareHolders
	System.out.println("Enter Share name with seperate comma ");
	nameOfShare =sc.next().split(",");
	System.out.println("Enter the share price ");
	int sharePrice = sc.nextInt();
	int totalSharePrice = sharePrice * noOfShares;
	System.out.println("Total value of each stock is "+totalSharePrice);
	}
	
	public void getShareNames() {
		System.out.println("List of share names are : ");
		for (String str : nameOfShare) {
			System.out.println(str+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockAccountManagement scm = new StockAccountManagement();
		scm.getStockAmount();
		scm.getShareNames();
	}

}
