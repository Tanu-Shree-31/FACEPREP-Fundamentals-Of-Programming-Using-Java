import java.util.Scanner;

/*Fibonacci Series
Write a program to find the nth term in the Fibonacci series using recursion. Note that the first 2 terms in the Fibonacci Series are 0 and 1.
Input and Output Format: 

Input consists of an integer.

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.

 

Sample Input and Output:

4



Sample Output:

The term 4 in the fibonacci series is 2
*/

public class Q3 {
static int fibonacci(int n)
{
	if(n==2) return 1;
	if(n==1) return 0;
	return fibonacci(n-1)+fibonacci(n-2);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The term "+n+" in the fibonacci series is "+fibonacci(n));
	}
}
