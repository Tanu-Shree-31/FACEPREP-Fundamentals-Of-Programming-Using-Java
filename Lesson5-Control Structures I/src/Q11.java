import java.util.Scanner;

/*Print continous number
Write a program to print all numbers between a and b (a and b inclusive) using a while loop.
Input Format:

Input consists of 2 integers. The first integer corresponds to a and the second integer corresponds to b. Assume a>=b.



Output Format:

Refer Sample Input and Output for formatting specifications.



Sample Input :

4

10



Sample Output:

4

5

6

7

8

9

10
*/

public class Q11 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n; i<=m; i++)
		{
			System.out.println(i);
		}

	}

}
