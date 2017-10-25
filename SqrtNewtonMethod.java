package com.bridgelabz.Algorithmic;

import com.bridgelabz.utility.Utility;

public class SqrtNewtonMethod
{
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		System.out.println("Enter the non negative number");
		double number= utility.inputDouble();
		double epsilon = 1e-15;    
		double temp = number;             
		utility.sqrtNewton(number,epsilon,temp);
	}


}


