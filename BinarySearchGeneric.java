package com.bridgelabz.Algorithmic;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class BinarySearchGeneric 
{
	public static void main(String[] args) 
	{
		long stoptime,Elapsedtime,starttime;
		Utility utility = new Utility();
		System.out.println("Enter the Range Array:");
		int range= utility.inputInteger();
		Integer[] array=new Integer[range];
		char ch;
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("1.Binary search for Integer Array:");
			System.out.println("2.Binary search for String Array:");
			System.out.println("Enter the choice:");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the Integer Array:");
				for(int i=0;i<range;i++)
					array[i] =  utility.inputInteger();	
				
				System.out.println();
				utility.bubbleSort1(array);
				System.out.println("Dsispaly the Integer Array After sorting:");
				utility.display(array);
				starttime = System.currentTimeMillis();
			
				System.out.println("Enter the Searcha Elements:");
				Integer search=utility.inputInteger();
				int position1=utility. binarySearch(array, search);
				if(position1>=0)
				{
					System.out.println();
					System.out.println("Found at "+position1+" position");
				}
				else
				{
					System.out.println("Not Found");
					System.out.println();
				}	 
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
				
				System.out.println("Dsispaly the String Array After sorting:");
				utility.bubbleSort(string);
				utility.display(string);
				starttime = System.currentTimeMillis();
				System.out.println("Enter the Searcha Elements:");
				String search1=utility.inputString();
				int position=utility.binarySearch(string,search1) ;
				
				if(position>0)
				{
					System.out.println();
					System.out.println("Found at "+position+" position");
				}
				else
				{
					System.out.println("Not Found");
					System.out.println();
				}	 
				stoptime = System.currentTimeMillis();
				Elapsedtime=stoptime-starttime;
				System.out.println("Elapsedtime time is: "+Elapsedtime);
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

