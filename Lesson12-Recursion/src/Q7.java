import java.util.Scanner;

/*GCD of 2 Numbers
Write a program to compute GCD of 2 numbers using recursion.


Input Format:

Input consists of a non - negative integer.



Output Format:

Print the sum of digits of a given number.

Refer sample input and output for formatting specifications.

 

Sample Input:

36

27



Sample Output:

G.C.D of 36 and 27 = 9
*/
public class Q7 {
static int gcd(int a,int b)
{
	if(a==0) return b;
	if(b==0) return a;
	if(a==b) return a;
	if(a>b) return gcd(a-b,b);
	return gcd(a,b-a);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("G.C.D of "+a+" and "+b+" is "+gcd(a,b));
	}
}
