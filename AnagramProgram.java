package com.bridgelabz.Algorithmic;
import java.util.Scanner;
import com.bridgelabz.utility.Utility;
public class AnagramProgram
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("Enter first String:");
		String firstString= scanner.nextLine();
		System.out.println("Enter second String:");
		String secondString = scanner.nextLine();
		utility.isAnagram(firstString,secondString);
		scanner.close();
	}
}	


