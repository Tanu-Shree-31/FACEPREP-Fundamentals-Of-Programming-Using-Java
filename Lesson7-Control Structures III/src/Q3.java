/*Pattern 3
Write a program to print the given pattern.
Input format:

The input containing an integer which denotes 'n'



Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.



Sample Input:

5



Sample Output:

1 3 5 7 9

3 5 7 9

5 7 9

7 9

9
*/

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    n=n*2;
	    for(int i=1; i<=n; i=i+2)
	    {
	    	for(int j=i; j<=n; j=j+2)
	    	{
	    		System.out.print(j+" ");
	    	}
	    	System.out.println();
	    }
}
}
