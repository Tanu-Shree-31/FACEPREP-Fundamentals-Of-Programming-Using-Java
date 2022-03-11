import java.util.Scanner;

/*Pattern 7
Write a program to print the given below pattern.
Input format:

The input containing an integer which denotes 'n'



Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line



Sample Input:

5



Sample Output:

1 

1 0 

1 0 1 

1 0 1 0 

1 0 1 0 1
*/

public class Q7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=1; i<=n; i++)
	    {
	    	for(int j=0; j<i; j++)
	    	{
	    		if(j%2==0)
	    			System.out.print(1+" ");
	    		else
	    			System.out.print(0+" "); 	
	    	}
	    	System.out.println();
	    }
	}
}
