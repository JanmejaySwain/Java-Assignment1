/*find sum of product of corresponding digits of two any 4 digit 
number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1 */
package assignment1;

import java.util.Scanner;

public class Expt5v {

	 public static void main(String[] args) {
		int num1,num2,sum=0,d1,d2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first 4 digit number:");
		num1=sc.nextInt();
		System.out.println("Enter the second 4 digit number:");
		num2=sc.nextInt();
		
		d1=num1%10;
		d2=num2%10;
		num1=num1/10;
		num2=num2/10;
		sum=sum+(d1*d2);
		
		d1=num1%10;
		d2=num2%10;
		num1=num1/10;
		num2=num2/10;
		sum=sum+(d1*d2);
		
		d1=num1%10;
		d2=num2%10;
		num1=num1/10;
		num2=num2/10;
		sum=sum+(d1*d2);
		sum=sum+(num1*num2);
		
		System.out.println("sum of product of corresponding digits of these 4 digits number is :"+sum);
		
	}
}
