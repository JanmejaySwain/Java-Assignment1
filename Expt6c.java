/*Difference between average of all even digits except divisible by 4 and 
Average of all odd digits except divisible by 3 of any 4 digit number */
package assignment1;

public class Expt6c {
   
	public static void main(String[] args) {
		int n=2567,se=0,so=0,ne=0,no=0,t=0,ed=0,od=0,d=0;
		float dif;
		d=n%10;
		ed=((d%2==0)&&(d%4!=0))?d:0;
		se=se+ed;
		t=ed>0?1:0;
		ne=ne+t;
		od=((d%2!=0)&&(d%3!=0))?d:0;
		so=so+od;
		t=od>0?1:0;
		no=no+t;
		n=n/10;
		
		d=n%10;
		ed=((d%2==0)&&(d%4!=0))?d:0;
		se=se+ed;
		t=ed>0?1:0;
		ne=ne+t;
		od=((d%2!=0)&&(d%3!=0))?d:0;
		so=so+od;
		t=od>0?1:0;
		no=no+t;
		n=n/10;
		
		d=n%10;
		ed=((d%2==0)&&(d%4!=0))?d:0;
		se=se+ed;
		t=ed>0?1:0;
		ne=ne+t;
		od=((d%2!=0)&&(d%3!=0))?d:0;
		so=so+od;
		t=od>0?1:0;
		no=no+t;
		d=n/10;
		
		
		ed=((d%2==0)&&(d%4!=0))?d:0;
		se=se+ed;
		t=ed>0?1:0;
		ne=ne+t;
		od=((d%2!=0)&&(d%3!=0))?d:0;
		so=so+od;
		t=od>0?1:0;
		no=no+t;
		
		dif=(se/ne)-(so/no);
		System.out.println("Sum of Even digit except divisible by 4 :"+se);
		System.out.println("Sum of odd digit except divisible by 3 :"+so);
		System.out.println("Average of even digits except divisible by 4:"+(se/ne));
		System.out.println("Average of odd digits except divisible by 3:"+(so/no));
		System.out.println("Difference is : "+dif);
		
	}
}
