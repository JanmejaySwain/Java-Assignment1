//Sum of all even digits of any 4 digit number
package assignment1;

public class Expt6a {
public static void main(String[] args) {
	int n=4582,sum=0,ed=0;
	ed=((n%10)%2==0)?(n%10):0;
	n=n/10;
	sum=sum+ed;
	
	ed=((n%10)%2==0)?(n%10):0;
	n=n/10;
	sum=sum+ed;
	
	ed=((n%10)%2==0)?(n%10):0;
	n=n/10;
	sum=sum+ed;
	ed=(n%2==0)?n:0;
	sum=sum+ed;
	
	System.out.println("Sum of all even digits of this 4 digit number : "+sum);
	
}
}
