import java.util.Scanner;

/*Pattern 9
Write a program to print the given below pattern.
Input format:

The input containing an integer which denotes the value of 'n'



Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.



Sample Input:

4



Sample Output:

1*2*3*4*17*18*19*20

 5*6*7*14*15*16

  8*9*12*13

   10*11
   */

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=1,b=n*n+1;
	    for(int i=n; i>=1; i--)
	    {
	    	for(int s=0; s<n-i; s++)
	    	{
	    		System.out.printf(" ");
	    	}
	    	for(int j=0; j<i; j++)
	    	{
	    		System.out.printf("%d*",a++);
	    	}
	    	for(int k=0; k<i-1; k++) {
	    	System.out.printf("%d*",b++);
	    	}
	    	System.out.println(b);
	    	b-=2*(i-1);
	    }
	}

}
