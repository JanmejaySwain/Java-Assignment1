/* Find the value available at position required by user it may be 10, 
100 or 1000 */
package assignment1;

public class Expt5iii {

	 public static void main(String[] args) {
		int n=5389;
		System.out.println("value avilable at 1000 :"+(n/1000));
		System.out.println("value avilable at 100 :"+(n/100)%10);
		System.out.println("value avilable at 10 :"+(n/10)%10);
		System.out.println("value avilable at 1 :"+(n%10));
	}
}
