package com.bridgelabz.Algorithmic;

import com.bridgelabz.utility.Utility;

public class DayOfWeek 
{
	public static void main (String[] args)
	{
		Utility utility = new Utility();
		System.out.print( " \n \n Please Enter The Month number:");
		int month = utility.inputInteger();
		System.out.print( " \n Please Enter The Day number : ");
		int dayNumber = utility.inputInteger();
		System.out.print( " \n Please Enter The year: ");
		int year = utility.inputInteger();
		utility.dayCal(  month,dayNumber,year );
		utility.monthCal(month);
	}
}







