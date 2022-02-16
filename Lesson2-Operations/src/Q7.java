import java.util.Scanner;

/*Simple Interest
Sara wished to build a new house but she didn't have a sufficient amount. So, she is planning to borrow 
some money from the bank on simple interest. When she is borrowing some money from the bank, she has 
to pay back the original amount accompanied by a certain amount of interest on that amount. She wants 
to find the interest for borrowed money within a certain period. Help her to find the simple interest. 

Input format:
The first line containing an integer value denoting the borrowed amount(principal amount)
The second line containing an integer value denoting the period in years
The third line containing the float value denoting the rate of interest

Output format:
Print the simple interest in float with 2 decimal places.
*/

public class Q7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int principal=sc.nextInt();
		int period=sc.nextInt();
		float ROI=sc.nextFloat();
		System.out.println((principal*period*ROI)/100);
		

	}

}
