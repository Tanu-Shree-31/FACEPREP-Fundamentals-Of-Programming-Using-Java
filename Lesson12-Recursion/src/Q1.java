/*Maximum element in array
Write a program to compute the sum of elements in an array using recursion.

Input Format:
Input consists of n+1 integers.

Output Format:
Print the maximum elements in an array.
Refer sample input and output for formatting specifications.

Sample Input :
6

2

5

1

7

4

2



Sample Output:
Maximum element in the array is 7
*/

import java.util.Scanner;
public class Q1 {
public static int max(int n1,int n2)
{
	return n1>n2?n1:n2;
}
static int maximum(int arr[],int n)
{
	if(n==1)
		return arr[0];
	else
		return max(maximum(arr,n-1),arr[n-1]);
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=maximum(arr,n);
		System.out.print("Maximum element in the array is "+max);
	}
}
