import java.util.Scanner;

/*Sum of elements in Array
Write a program to compute the sum of elements in an array using recursion.


Input Format:

Input consists of n+1 integers.



Output Format:

Print the sum of elements in an array.

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

The sum of the elements in the array is 21
*/

public class Q8 {
static int sum(int arr[],int n)
{
	if(n<=0)
		return 0; 
	return sum(arr,n-1)+arr[n-1];
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("The sum of the elements in the array is "+sum(arr,n));

	}

}
