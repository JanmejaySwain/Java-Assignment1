//find the face value and position value of any 4 digit number
package assignment1;

public class Expt5ii {
public static void main(String[] args) {
	int n=7856,d1,d2,d3;
	d1=n%10;
	n=n/10;
	System.out.println("Face valueand place value of first digit is respectively : "+d1+" and "+d1*1);
	d2=n%10;
	n=n/10;
	System.out.println("Face value and place value of second digit is respectively : "+d2+" and "+d2*10);
	d3=n%10;
	n=n/10;
	System.out.println("Face value and place value of third digit is respectively : "+d3+" and "+d3*100);
	
	System.out.println("Face value and place value of fourth digit is respectively : "+n+" and "+n*1000);


}
}
