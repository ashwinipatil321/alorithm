package com.bridgelabz.Algorithmic;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment 
{
	public static void main(String[] args)
	{
		int year;
		double principal;
		double  retpercent;
		Utility utility = new Utility();
		System.out.println("Enter year:");
		year=utility.inputInteger();
		System.out.println("Enter principal:");
		principal=utility.inputDouble();
		System.out.println("Enter retpercent:");
		retpercent=utility.inputDouble();
		utility.calMonthlyPayment(year,principal,retpercent);
	}

}
