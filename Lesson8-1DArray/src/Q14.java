import java.util.Scanner;

/*Array Range
Write a program to find the range of the elements in the array. Range of an array is the difference between the maximum and minimum element in an array,
Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Assume that the maximum number of elements in the array is 20.



Output Format:

Output consists of an integer which corresponds to the range of the array.



Sample Input:

5

2

4

1

3

5



Sample Output:

The range of the array is 4
*/

public class Q14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) 
			a[i]=sc.nextInt();
		int max=a[0],low=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];			
			if(a[i]<low)
				low=a[i];
		}
		System.out.println("The range of the array is "+(max-low));
	}
}
