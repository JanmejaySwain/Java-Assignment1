/*Write a java program to find sum of product of corresponding even digits of 
first any 4 digit number and corresponding odd digit of any 4 digit number Such as 
n=1234 m=4567 output=4*7+2*5 */
package assignment1;

import java.util.Scanner;

public class Expt6g {

	public static void main(String[] args) {
		int n,m,d1=0,d2=0,sum=0,ed=0,od=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first 4 digit number : ");
		n=sc.nextInt();
		System.out.println("Enter second 4 digit number : ");
		m=sc.nextInt();
		d1=n%10;
		d2=m%10;
		n=n/10;
		m=m/10;
		ed=(d1%2==0)?d1:0;
		od=(d2%2!=0)?d2:0;
		sum=sum+(ed*od);
		
		d1=n%10;
		d2=m%10;
		n=n/10;
		m=m/10;
		ed=(d1%2==0)?d1:0;
		od=(d2%2!=0)?d2:0;
		sum=sum+(ed*od);
		
		d1=n%10;
		d2=m%10;
		n=n/10;
		m=m/10;
		ed=(d1%2==0)?d1:0;
		od=(d2%2!=0)?d2:0;
		sum=sum+(ed*od);
		
		d1=n;
		d2=m;
		ed=(d1%2==0)?d1:0;
		od=(d2%2!=0)?d2:0;
		sum=sum+(ed*od);
		System.out.println(sum);
	}
}
