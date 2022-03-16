import java.util.Scanner;

/*Series II
Write a program to generate the following series --- 6,11,21,36,56,...
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting.



Sample Input:

6



Sample Output:

6 11 21 36 56 81
*/

public class Q2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int temp=6;
		for(int i=1; i<=n; i++)
		{
			System.out.print(temp+" ");
			temp=temp+(5*i);
		}

	}

}
