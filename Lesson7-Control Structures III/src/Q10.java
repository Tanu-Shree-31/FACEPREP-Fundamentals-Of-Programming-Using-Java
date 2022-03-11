import java.util.Scanner;

/*Pattern 10
Write a program to print the given below pattern.
Input format:

The input containing an integer which denotes the value of 'n'



Output format:

Refer the sample output for formatting. There is a trailing space at the end of each line.



Sample Input:

4



Sample Output:

1112

3222

3334

5444
*/

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    for(int i=1;i<=a;i++)

	    {

	      for(int j=1;j<=a;j++)

	      {

	          if(i%2!=0 && j==a || i%2==0 && j==1)

	          {

	          System.out.print((i+1));

	          }

	          else

	          {

	             System.out.print(i); 

	          }

	      }

	      System.out.printf("\n");

	  } 

	}

}
