import java.util.Scanner;

/*Pattern 4
Write a program to print the given pattern
Input format:

The input containing an integer which denotes the 'n'



Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line



Sample Input:

5



Sample Output:

5 5 5 5 5

4 5 5 5 5

3 4 5 5 5

2 3 4 5 5

1 2 3 4 5
*/

public class Q4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=n; i>=1; i--)
	    {
	    	for(int j=i; j<=n; j++)
	    	{
	    		System.out.print(j+"");
	    	}
	    	for(int k=1; k<=i-1; k++)
	    	{
	    		System.out.print(n+"");
	    	}
	    	System.out.println();
	    }
	}

}
