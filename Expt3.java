//Write a java program for temperature conversion?
package assignment1;

import java.util.*;

public class Expt3 {
	public static void main(String[] args) {
		float Fahrenheit, Celsius;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in celsius:");
	    Celsius= sc.nextFloat();  
	    Fahrenheit =((Celsius*9)/5)+32;  
	    System.out.println("Temperature in Fahrenheit is: "+Fahrenheit); 
	} 
}
