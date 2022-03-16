import java.util.Scanner;

/*Series XIII
Write a program to generate the following series 5, 16, 49, 104, 181...
Input format:

The input containing an integer which denotes 'n'



Output format:

Print the series and refer the sample output for formatting.



Sample Input:

5



Sample Output:

5 16 49 104 181
*/

public class Q13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=5;
		int d=11,odd=1;
		for(int i=0; i<n; i++)
		{
			System.out.printf("%d ",num);
			num=num+d*odd;
			odd=odd+2;
		}

	}

}
