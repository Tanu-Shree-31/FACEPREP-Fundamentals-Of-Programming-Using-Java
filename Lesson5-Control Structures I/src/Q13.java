import java.util.Scanner;

/*Count positive and negative
Write a program that allows the user to enter 'n' numbers and finds the number of positive numbers entered and the number of negative numbers entered using a loop.
Input Format:

Input consists of n+1 integers. The first integer corresponds to n. The next n integers correspond to the numbers to be added. Consider 0 to be a positive number.



Output Format:

Refer Sample Input and Output for formatting specifications.



Sample Input:

4

5

-2

-1

6



Sample Output:

Number of positive numbers entered is 2 and the sum is 1
*/

public class Q13 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int pos=0,neg=0;
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>=0) 
				pos++;
			else
				neg++;
		}
		System.out.println("Number of positive numbers is "+pos+" and the number of negative numbers is "+neg);

	}

}
