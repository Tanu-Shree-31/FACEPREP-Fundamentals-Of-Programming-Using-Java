import java.util.Scanner;

/*Sum of digits
Write a program to find the sum of digits in a number using recursion.


Input Format:

Input consists of a non - negative integer.



Output Format:

Print the sum of digits of a given number.

Refer sample input and output for formatting specifications.

 

Sample Input:

432



Sample Output:

The sum of digits in 432 is 9
*/

public class Q5 {
static int sum(int n)
{
	if(n==0) return 0;
	if (n==1) return 1;
	return n%10+sum(n/10);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The sum of digits in "+n+" is "+sum(n));

	}

}
