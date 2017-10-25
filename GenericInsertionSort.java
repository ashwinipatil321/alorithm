package com.bridgelabz.Algorithmic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class GenericInsertionSort
{

	public static void main(String[] args)
	{
		/*Utility utility = new Utility();
		System.out.println("Enter the Range of Integer Array:");
		int range = utility.inputInteger();
		int array[]=new int[range];
		System.out.println("Enter the Integer Array:");
		for( int i=0;i<range;i++)
		{
			array[i] =  utility.inputInteger();	
		}
		System.out.println("Dsispaly the Integer Array befor sorting:");
		for(int i=0;i<range;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		utility.insertionSorting( array);
		System.out.println("Dsispaly the Integer Array after sorting :");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+ " ");
		}*/

		long stoptime,Elapsedtime,starttime;
		Utility utility = new Utility();
		System.out.println("Enter the Range Array:");
		int range= utility.inputInteger();
		Integer array[]=new Integer[range];
		char ch;
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("1.Insertion sort for Integer Array:");
			System.out.println("2.String sort for String Array:");
			System.out.println("Enter the choice:");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Integer Array:");
				for(int i=0;i<range;i++)
					array[i] =  utility.inputInteger();	
				

				starttime = System.currentTimeMillis();
				System.out.println("Dsispaly the Integer Array befor sorting:");
				utility.display(array);

				System.out.println();
				utility.insertionSorting(array);
				System.out.println("Dsispaly the Integer Array After sorting:");
				utility.display(array);
				stoptime = System.currentTimeMillis();

				Elapsedtime=stoptime-starttime;
				System.out.println("Elapsedtime time is: "+Elapsedtime);
			//	scanner.nextLine();
				break;
			case 2:
				scanner.nextLine();
				System.out.println("Enter String Array elements :");
			
				String string[]=new String[range];	
				for (int i = 0; i < string.length; i++)
				{
				string[i]=scanner.next();
				}
				starttime = System.currentTimeMillis();
				System.out.println("Array of String elements before sorting are :");
				utility.display(string);
				utility.insertionSorting(string);
				stoptime = System.currentTimeMillis();
				System.out.println("Array of String elements After sorting are :");
				utility.display(string);
				Elapsedtime=stoptime-starttime;
				System.out.println("Elapsedtime time is :"+Elapsedtime);
				break;
				default:
					System.out.println("no opration");

			}
			System.out.println("Do you want to continue(y/Y)");
			ch=scanner.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
	}

	}

