package com.bridgelabz.Algorithmic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Binary {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int decimal;
		Utility utility = new Utility();
		System.out.println("Enter the Number......");
		decimal=scanner.nextInt();
		utility.binaryDecimal(decimal);
	}
	
}


