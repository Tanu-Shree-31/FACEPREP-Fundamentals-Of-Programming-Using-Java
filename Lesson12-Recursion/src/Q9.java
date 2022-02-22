import java.util.Scanner;

/*Sum of even numbers
Write a program to find the sum of the even numbers present in an array using recursion.


Input Format:

Input consists of n+1 integers.



Output Format:

Print the sum of even elements in an array.

Refer sample input and output for formatting specifications.



Sample Input :

4

23

54

67

98

Sample Output:

Sum of even numbers 152
*/

public class Q9 {
static void SumOfEven(int arr[],int i, int sum)
{
	if (i < 0)
	{
		System.out.print("Sum of even numbers "+sum);
		return;
	} 
    // If current element is even
    if ((arr[i]) % 2 == 0)
    {
        // Add it to the sum
        sum += (arr[i]);
    }
    SumOfEven(arr, i - 1, sum);
}
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		SumOfEven(arr,n-1,sum);
	}
}
