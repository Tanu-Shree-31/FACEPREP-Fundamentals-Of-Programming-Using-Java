/*Series IV
Write a program to generate the following series --- 0.5,1.5,4.5,13.5,...
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting.



Sample Input:

5



Sample Output:

0.5 1.5 4.5 13.5 40.5
*/
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++)
		{
			double p=((Math.pow(3, i))*5)/10;
			System.out.print(p+" ");
		}
	}
}
