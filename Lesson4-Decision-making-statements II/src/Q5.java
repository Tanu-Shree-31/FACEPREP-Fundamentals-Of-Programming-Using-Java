import java.util.Scanner;

/*Budget
It’s your job to calculate the cost of replacing damaged battle droids and to check whether it is within 
the budget limit of Rs. 15000. The cost of the equipment and parts is given below. Blast Rifle Rs. 350.34 
Visual Sensors Rs. 230.90 Auditory Sensors Rs. 190.55 Arms Rs. 125.30 Legs Rs. 180.90 Write a program to 
solve this problem.

Input format:
Input consists of 5 integers
The first input denotes the number of blast rifles needed
The second input denotes the number of visual sensors needed
The third input denotes the number of auditory sensors needed
The fourth input denotes the number of arms needed
The fifth input denotes the number of legs needed

Output format:
If the total cost of replacing damaged battle droids is within the sanctioned budget of Rs. 15000, print "Yes". 
Otherwise, print "No"

Refer the sample output for formatting
Sample Input:
20
10
14
3
9

Sample Output:
Yes
*/


public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		double total_cost=((a*350.34)+(b*230.90)+(c*190.55)+(d*125.30)+(e*180.90));
		if(total_cost<=15000)
			System.out.println("Yes");
		else
			System.out.println("No");
		

	}

}
