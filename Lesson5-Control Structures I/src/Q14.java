import java.util.Scanner;

/*Multiplication Table
Write a program to print the multiplication table of an integer n up to m rows using loop.
Input Format:

Input consists of 2 integers. The first integer corresponds to n. The second integer corresponds to m.



Output Format:

Refer Sample Input and Output for formatting specifications.



Sample Input:

5

4



Sample Output:

The multiplication table of 5 is

1*5=5

2*5=10

3*5=15

4*5=20
*/

public class Q14 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=1; i<=m; i++)
		{
			System.out.println(i+"*"+n+"="+(i*n));
		}

	}

}
