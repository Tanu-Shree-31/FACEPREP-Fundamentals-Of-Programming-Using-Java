import java.util.Scanner;

/*Series III
Write a program to generate the first n terms in the series --- 3, 9, 27, 81,...,.
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting



Sample Input:

6



Sample Output:

3 9 27 81 243 729
*/

public class Q3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			int temp=(int)Math.pow(3, i);
			System.out.print(temp+" ");
		}

	}

}
