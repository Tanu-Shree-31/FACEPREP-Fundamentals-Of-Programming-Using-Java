import java.util.Scanner;

/*Series XI
Write a program to generate the following series 95.0, 115.5, 138.0,..., 189.0
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting



Sample Input:

5



Sample Output:

95.0 115.5 138.0 162.5 189.0
*/

public class Q11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float num=95.0f;
		for(int i=0; i<n; i++)
		{
			System.out.printf("%.1f ",num);
			num=num+20.5f+(i*2);
		}
	}
}
