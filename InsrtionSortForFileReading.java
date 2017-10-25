package com.bridgelabz.Algorithmic;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class InsrtionSortForFileReading 
{
	public static void main(String[] args) throws IOException {

		Utility utility = new Utility();
		String str=null;
		String search;
		Scanner scanner=new Scanner(System.in);
		File file = new File("/home/bridgeit/input.txt");
		FileReader fread = new FileReader(file);
		BufferedReader br = new BufferedReader(fread);
		//	FileWriter fileWriter = new FileWriter("/home/bridgeit/input.txt");
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
		String str1[]=str.trim().split(",");

		System.out.println("length :" + str1.length);
		System.out.println("Array elements before sorting are :");
		for (int i = 0; i < str1.length; i++)
		{
			System.out.println(str1[i]);
		}
		utility.insertionSorting(str1);
		System.out.println("Array elements After sorting are :");
		for (int i = 0; i < str1.length; i++)
		{
			System.out.println(str1[i]);
		}
		scanner.close();
		br.close();
		fread.close();
	}
}




