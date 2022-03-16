import java.util.Scanner;

/*Series X
Write a program to generate the following series 2, 3, 8, 63, 3968
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting



Sample Input:

5



Sample Output:

2 3 8 63 3968
*/

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int s=2;
		 System.out.printf(s+" ");
		 for(int i=2;i<=n;i++)
		 {
			            s=(s*s)-1;
			            System.out.printf(s+" ");
	     }
	}
}
