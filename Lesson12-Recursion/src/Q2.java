import java.util.Scanner;

/*Factorial
Write a program to compute the factorial of a number using recursion.


Input Format:

Input consists of an integer.



Output Format:

Print the factorial of the given number

Refer sample input and output for formatting specifications. 



Sample Input:

5



Sample Output:

The factorial of 5 is 120
*/

public class Q2{
static int factorial(int n)
{
	return n==1 || n==0 ? 1:n*factorial(n-1);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=factorial(n);
		System.out.println("The factorial of "+n+" is "+res);
	}

}
