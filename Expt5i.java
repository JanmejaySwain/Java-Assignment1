//Sum of all digits of any 4 digit numbers
package assignment1;

import java.util.Scanner;

public class Expt5i {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n,d1=0,sum=0;
	System.out.println("Enter the four digits number:");
	n=sc.nextInt();
	d1=n%10;
	sum=sum+d1;
	n=n/10;
	
	d1=n%10;
	sum=sum+d1;
	n=n/10;
	
	d1=n%10;
	sum=sum+d1;
	n=n/10;
	
	sum=sum+n;
	System.out.println("Sum of digits of this four digits number is :"+sum);
}
}
