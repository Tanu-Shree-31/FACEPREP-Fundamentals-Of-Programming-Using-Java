import java.util.Scanner;

/*Series V
Write a program to generate the following series --- 121,225,361,...
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting.



Sample Input:

4



Sample Output:

121 225 361 529
*/

public class Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=11;
		for(int i=0; i<n; i++)
		{
			double p=Math.pow(k, 2);
			k=k+4;
			System.out.printf("%.0f ",p);
		}
	}
}
