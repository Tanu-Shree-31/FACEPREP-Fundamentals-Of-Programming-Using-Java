import java.util.Scanner;

/*Series VI
Write a program to generate the following series --- 0,2,8,14,...,34
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting.



Sample Input:

6



Sample Output:

0 2 8 14 24 34
*/

public class Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0) {
				sum=(i*i)-2;
				System.out.printf("%d ",sum);
			}
			else
			{
				sum=(i*i)-1;
				System.out.printf("%d ",sum);
			}
		}
	}

}
