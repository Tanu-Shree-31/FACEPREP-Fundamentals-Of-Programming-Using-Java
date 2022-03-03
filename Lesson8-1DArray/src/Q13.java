import java.util.Arrays;
import java.util.Scanner;

/*Array Mode
Write a program to find the mode of the elements in the array. The mode in a list of numbers refers to the list of numbers that occur most frequently. It is important to note that there can be more than one mode and if no number occurs more than once in the set, then there is no mode for that set of numbers.
Input Format:

Input consists of n+1 integers where n corresponds to the number of elements in the array.

The first integer corresponds to n and the next n integers correspond to the elements in the array.

Refer sample input and output for formatting specifications.

Assume that the maximum number of elements in the array is 20.

Assume that in the input data set there is 1 mode or no mode at all.



Sample Output:

All text in bold corresponds to input and the rest corresponds to output.



Sample Input:

5

2

4

1

3

5



Sample Output:

The mode of the array is none
*/
import java.util.Arrays;
public class Q13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) 
			a[i]=sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=i+1;j<n;j++) {
			if(a[i]==a[j])
			{
				flag=1;
				System.out.printf("Mode = %d",a[i]);
			}
		}
		}
		if(flag==0)
			System.out.println("The mode of the array is none");
	}
}
