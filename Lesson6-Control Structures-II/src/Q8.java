/*Series VIII
Write a program to generate the following series 4, 5, 9, 18, 34,...
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting.



Sample Input:

6



Sample Output:

4 5 9 18 34 59
*/
import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		double sum=4,i;
		for(i=0;i<d;i++)
		{
		    sum=sum+Math.pow(i,2);
		    System.out.print((int)sum+" ");
		}    
	}
}
