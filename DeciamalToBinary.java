package com.bridgelabz.Algorithmic;

import com.bridgelabz.utility.Utility;

public class DeciamalToBinary 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter number:");
		int number = utility.inputInteger();
		utility.printBinaryFormat(number);
	}

}

