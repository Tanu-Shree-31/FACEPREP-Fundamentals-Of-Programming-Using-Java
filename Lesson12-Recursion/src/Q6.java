import java.util.Scanner;

/*Number of digits
Write a program to find the number of digits in a number using recursion.

Input Format:
Input consists of a non - negative integer.



Output Format:

Print number of digits of a given number

Refer sample input and output for formatting specifications.

 
Sample Input:
432



Sample Output:

The number of digits in 432 is 3
*/

public class Q6 {
static int digits(int n)
{
	if(n/10==0) return 1;
	return 1+digits(n/10);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The number of digits in "+n+" is "+digits(n));

	}

}
