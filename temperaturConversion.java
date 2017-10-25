package com.bridgelabz.Algorithmic;

import com.bridgelabz.utility.Utility;
public class temperaturConversion 
{
	public static void main(String[] args) 
	{
			    double Fahrenheit,Celsius; 
			    Utility utility = new Utility();
			    System.out.println("Enter temperatue in Fahrenheit");
			    Fahrenheit = utility.inputDouble();
			    System.out.println("Enter temperatue in Celsius");
			    Celsius = utility.inputDouble();
			    utility.calculateCelsius( Fahrenheit,Celsius);
			    utility.calculateFahrenheit(Celsius,Fahrenheit);
	 }
}


