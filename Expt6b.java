//Sum of all odd digits of any 4 digit number
package assignment1;

public class Expt6b {
   
	public static void main(String[] args) {
		int n=2397,sum=0,od=0;
		od=((n%10)%2!=0)?(n%10):0;
		n=n/10;
		sum=sum+od;
		
		od=((n%10)%2!=0)?(n%10):0;
		n=n/10;
		sum=sum+od;
		
		od=((n%10)%2!=0)?(n%10):0;
		n=n/10;
		sum=sum+od;
		od=(n%2!=0)?n:0;
		sum=sum+od;
		
		System.out.println("Sum of all odd digits of this 4 digit number : "+sum);
	}
}
