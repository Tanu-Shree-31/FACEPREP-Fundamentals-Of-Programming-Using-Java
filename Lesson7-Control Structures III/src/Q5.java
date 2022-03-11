import java.util.Scanner;

/*Pattern 5
Write a program to print the given below pattern.
Input format:

The input containing an integer which denotes 'n'



Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.



Sample Input:

4



Sample Output:

1

2 3

4 5 6

7 8 9 10
*/

public class Q5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int k=1;
	    for(int i=1; i<=n; i++)
	    {
	    	for(int j=1; j<=i; j++)
	    	{
	    		System.out.print(k++ +" ");
	    	}
	    	System.out.println();
	    }

	}

}
