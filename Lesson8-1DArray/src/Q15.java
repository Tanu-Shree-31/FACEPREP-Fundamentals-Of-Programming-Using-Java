import java.util.Scanner;

/*Functions – Array Type
Write a program to find the type of array using functions. An array is said to be “Even” if all the elements in the array are even. An array is said to be “Odd” if all the elements in the array are odd. An array is said to be “Mixed” if it contains some odd elements and some even elements. Refer function specifications for the function details. The first argument corresponds to the number of elements in the array. The second argument corresponds to the pointer to an array. The return value of the function should be 1 if the array is Even. The return value of the function should be 2 if the array is Odd. The return value of the function should be 3 if the array is Mixed.
Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Assume that the maximum number of elements in the array is 20.



Sample Output:

Refer sample input and output for formatting specifications.



Sample Input:

5

2

4

1

3

5



Sample Output:

The array is Mixed

*/

import java.util.*;
public class Q15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) 
			a[i]=sc.nextInt();
		int res=fun(a,n);
		if(res==1)
			System.out.println("The array is Even");
		else if(res==2)
			System.out.println("The array is Odd");
		else
			System.out.println("The array is Mixed");
		

	}

private static int fun(int[] a, int n) {
	int even=0,odd=0;
	for(int i=0; i<n; i++)
	{
		if(a[i]%2==0)
			even++;
		else if(a[i]%2==1)
			odd++;
			
	}
	if(even==n)
		return 1;
	else if(odd==n)
		return 2;
	else
		return 3;

}

}
