import java.util.Scanner;

/*Pattern 1
Write a program to print the given pattern.
Input format:

The input containing an integer which denotes the value of 'n'



Output format:

Refer to the sample output. There is a trailing space at the end of each line.



Sample Input:

4



Sample Output:

1 2 3 4 5 6 7

1 2 3 4 5

1 2 3

1
*/

import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=2*i-1;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
