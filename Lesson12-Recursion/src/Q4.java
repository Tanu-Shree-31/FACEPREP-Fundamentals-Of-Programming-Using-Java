import java.util.Scanner;

/*Compute a^n
Write a program to compute a^n (a power n) using recursion.
Input and Output Format: 

Input consists of an integer.

Refer sample input and output for formatting specifications.

 

Sample Input and Output:

2

8



Sample Output:

The value of 2 power 8 is 256
*/

public class Q4 {
static int rec(int base,int power)
{
	if(power!=0) return (base*rec(base,power-1));
	else return 1;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int power=sc.nextInt();
		System.out.println("The value of "+base+" power "+power+" is "+rec(base,power));
	}
}
