import java.util.Scanner;

/*Compare two arrays
Given two arrays, you need to compare them and display if they are the same or not.
Input Format:

Input consists of 2n+1 integers. 

The first integer corresponds to ‘n’, the size of the array. 

The next ‘n’ integers correspond to the elements in the first array. 

The next ‘n’ integers correspond to the elements in the second array.

Assume that the maximum value of n is 15.



Output Format:

Print yes if the 2 arrays are the same. Print no if the 2 arrays are different.



Sample Input:

5

2

3

6

8

-1

2

3

6

8

-1



Sample Output:

yes
*/


public class Q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			arr2[i]=sc.nextInt();
			if(arr1[i]==arr2[i])
				count++;
		}
		System.out.println((count==n)? "Yes" : "No");
	}
}
