import java.util.Scanner;

/*Pattern 8
Write a program to print the given below pattern.
Input format:

The input containing an integer which denotes the value of 'n'



Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.



Sample Input:

5



Sample Output:

*   *

 * * 

  *  

 * * 

*   *  
*   */

public class Q8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=1; i<=n; i++)
	    {
	    	for(int j=1; j<=n; j++)
	    	{
	    		if(i==j || i+j==n+1)
	    		{
	    			System.out.printf("*");
	    		}
	    		else
	    			System.out.printf(" ");
	    	}
	    	System.out.println();
	    }
	}

}
