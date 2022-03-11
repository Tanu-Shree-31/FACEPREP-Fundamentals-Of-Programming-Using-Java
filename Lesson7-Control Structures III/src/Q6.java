import java.util.Scanner;

/*Pattern 6
Write a program to print the given pattern.
Input format:

The input containing an integer which denotes the 'n'



Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.



Sample Input:

4



Sample Output:

1 

1 2 3 

1 2 3 4 5 

1 2 3 4 5 6 7 
*/

public class Q6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=1; i<=n; i++)
	    {
	    	int k=1;
	    	for(int j=1; j<=2*i-1; j++)
	    	{
	    		System.out.print(k+" ");
	    		k++;
	    	}
	    	System.out.println();
	    }
	}

}
