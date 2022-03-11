import java.util.Scanner;

/*Pattern 2
Write a program to print the given pattern.
Input format:

The input containing an integer which denotes the value of 'n'



Output format:

Refer the sample output for formatting.

There is a trailing space at the end of each line.



Sample Input:

4



Sample Output:

1

0 1

1 0 1

0 1 0 1
*/

public class Q2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	      int a1=s.nextInt();
	      int i=0,j;
	      int c=0;
	    for(i=1;i<=a1;i++)
	    {
	       for(j=1;j<=i;j++)
	        {  
	            ++c;
	            if(c%2==0)
	           {
	           System.out.print("1 ");
	            }
	            else
	            {
	                System.out.print("0 ");
	            }
	        }
	        System.out.println(" ");
}
	}
}


