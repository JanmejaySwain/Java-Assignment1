/*Sum of product of consecutive odd digits of any 4 digit number? Supoose 
num=1356 then output= 5*3+ 3*1 */
package assignment1;

import java.util.Scanner;

public class Expt6e {
   public static void main(String[] args) {
	   int n,sum=0,d=0,ed1=0,ed2=0,ed3=0,ed4=0;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a four digits number:");
		  n=sc.nextInt();
		  d=n%10;
		  ed1=(d%2!=0)?d:0;
		 
		  n=n/10;
		  d=n%10;
		  ed2=(d%2!=0)?d:0;
		  sum=sum+(ed1*ed2);
		  
		  n=n/10;
		  d=n%10;
		  ed3=(d%2!=0)?d:0;
		  sum=sum+(ed2*ed3);
		  
		  n=n/10;     
	      d=n;
	      ed4=(d%2!=0)?d:0;
		  sum=sum+(ed3*ed4);
		  System.out.println("Sum of product of consecutive odd digits of this 4 digit number : "+sum);
		  sc.close();
}
}
