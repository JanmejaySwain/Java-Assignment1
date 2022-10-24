/*Sum of product of consecutive digits of any 4 digit number? Supoose
num=1234 then output= 4*3+3*2+2*1 */
package assignment1;

import java.util.Scanner;

public class Expt5iv {
  
	public static void main(String[] args) {
		int num,n,sum=0,d1,d2,d3,d4;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a four digit number:");
		num=sc.nextInt();
		n=num;
		d1=n%10;
		n=n/10;
		d2=n%10;
		n=n/10;
		sum=sum+(d1*d2);
		d3=n%10;
		n=n/10;
		d4=n;
		sum=sum+(d2*d3)+(d3*n);
		System.out.println("Sum of product of consecutive digits of "+num+" is : "+sum);
		
	}
}
