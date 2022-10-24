//Write a java program to find simple interest
package assignment1;

import java.util.Scanner;

public class Expt2 {
  public static void main(String[] args) {
	float p,r,si;
	int t;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principle:");
	p=sc.nextFloat();
	System.out.println("Enter the rate of intrest:");
	r=sc.nextFloat();
	System.out.println("Enter the time:");
	t=sc.nextInt();
	si=(p*t*r)/100;
	System.out.println("Simple intrest of "+p+" in "+t+" years at "+r+"% is: "+si);
}
}
