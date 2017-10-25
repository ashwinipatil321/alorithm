package com.bridgelabz.Algorithmic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class BinaryReadWordList
{
	public static void main(String[] args) throws IOException
	{
		Utility utility = new Utility();
		String str = null;
		String search;
		Scanner scanner=new Scanner(System.in);
		File file = new File("/home/bridgeit/file2.txt");
		FileReader fread = new FileReader(file);
		BufferedReader br = new BufferedReader(fread);
		if(file.exists())
		{
			if(file.canRead())
			{

				str = br.readLine();
			}
			else
			{
				System.out.println("File can not read");
			}
		}
		else
		{
			System.out.println("File not found");
		}
		String str1[]=str.trim().split(" ");
		utility.bubbleSort(str1);
		utility.display(str1);
		System.out.println("Enter word to search:");
		search=scanner.nextLine();
		int position=utility.binarySearch(str1,search);
		if(position>=0)
		{
			System.out.println("Found at "+position+" position");
		}
		else
		{
			System.out.println("Not Found");
		}	 
		br.close();
		scanner.close();
	}

}
