import java.util.Scanner;

/*Print the number in reverse
Write a Java program to print all numbers between a and b (a and b inclusive) using while loop.
Input Format:

Input consists of 2 integers. The first integer corresponds to a and the second integer corresponds to b. Assume a>=b.



Output Format:

Refer Sample Input and Output for formatting specifications.



Sample Input :

10

4



Sample Output:

10

9

8

7

6

5

4
*/

public class Q12 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n; i>=m; i--)
		{
			System.out.println(i);
		}

	}

}
