import java.util.Scanner;

/*Array mean
Write a program to find the mean of the elements in an array.
Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Output consists of a double value which corresponds to the mean of the array and is printed up to 2 digits of precision.

Assume that the maximum number of elements in the array is 20.



Sample Output:

Refer to the sample input and output for formatting specifications.



Sample Input:

5

2

4

1

3

5



Sample Output:

The mean of the array is 3.00
*/


public class Q11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		float avg=sum/n;
		System.out.printf("The mean of the array is %.2f",avg);
		
		}	
	}


